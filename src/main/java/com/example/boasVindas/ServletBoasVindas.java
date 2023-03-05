package com.example.boasVindas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/boasvindas")
public class ServletBoasVindas extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Boas-Vindas aos Calouros</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Seja Bem-Vindo(a) ao Curso de Licenciatura em Computação!</h1>");
        out.println("<p>Caro(a) calouro(a), é com muita satisfação que recebemos você em nossa instituição de ensino.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}