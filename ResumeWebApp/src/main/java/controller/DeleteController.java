/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daoInter.UserDaoInter;
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
@WebServlet(name = "DeleteController", urlPatterns = {"/deletecontrol"})
public class DeleteController extends HttpServlet {
    
    UserDaoInter udao = Contextt.instanceUserDao();
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            int id = Integer.valueOf(request.getParameter("id"));
            udao.removeUser(id);
            response.sendRedirect("users");
    }

}
