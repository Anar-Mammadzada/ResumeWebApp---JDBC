/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anar
 */
@WebServlet(name = "UserController", urlPatterns = {"/users"})
public class UserController extends HttpServlet {

//   private UserDaoInter udao = Contextt.instanceUserDao();

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            request.getRequestDispatcher("users.jsp").forward(request, response);

    }

}
