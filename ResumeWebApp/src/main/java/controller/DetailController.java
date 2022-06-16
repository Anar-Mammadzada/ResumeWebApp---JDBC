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
@WebServlet(name = "DetailController", urlPatterns = {"/userdetail"})
public class DetailController extends HttpServlet {

    private UserDaoInter udao = Contextt.instanceUserDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        User u = udao.getById(id);
        u.setName(name);
        u.setSurname(surname);
        udao.updateUser(u);
        response.sendRedirect("users");
    }
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String strId = request.getParameter("id");
            if (strId == null || strId.trim().isEmpty()) {
                throw new IllegalArgumentException("id is not specified");
            }
            int userId = Integer.parseInt(strId);
            UserDaoInter udao = Contextt.instanceUserDao();
            User u = udao.getById(userId);
            if (u == null) {
                throw new IllegalArgumentException("there is no user with this id");
            }
            request.setAttribute("user", u);
            request.getRequestDispatcher("userdetail.jsp").forward(request, response);

        } catch (Exception ex) {
            ex.printStackTrace();
            response.sendRedirect("error.jsp?msg=" + ex.getMessage());
        }
    }
}
