/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anar
 */
public class ControllerUtil {
    public static void errorPage(HttpServletResponse response, Exception ex) {
        ex.printStackTrace();
        try {
            response.sendRedirect("error.jsp?msg=" +ex.getMessage());
        } catch (IOException ex1) {
            
        }
    }
}
