/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daoInter.UserDaoInter;
import entity.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.Contextt;

/**
 *
 * @author Anar
 */
@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

   private UserDaoInter udao = Contextt.instanceUserDao();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            request.getRequestDispatcher("login.jsp").forward(request, response);
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            User user = udao.findByEmailAndPassword(email,password);
            if(user == null){
                throw new IllegalArgumentException("email or password is incorrect !!!");
            }
            request.getSession().setAttribute("loggedinuser", user);
            response.sendRedirect("users");
        }catch(Exception ex){
            ControllerUtil.errorPage(response, ex);
        }
    }

}
