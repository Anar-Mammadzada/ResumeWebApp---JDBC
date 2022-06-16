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
@WebServlet(name = "AllDetailController", urlPatterns = {"/alldetail"})
public class AllDetailController extends HttpServlet {
UserDaoInter udao = Contextt.instanceUserDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
           
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("id"));
        User u = udao.getById(id);
        request.setAttribute("detal", u);
        request.getRequestDispatcher("alldetail.jsp").forward(request, response);
    }

}
