package br.edu.utfpr.mediaregistrationapp.controller;

import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;
import br.edu.utfpr.mediaregistrationapp.service.CdService;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CdRegistrationController", value = "/cadastrar-cds")
public class CdRegistrationController extends HttpServlet {

    CdService cdService = new CdService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String artist = request.getParameter("artista");
        String title = request.getParameter("titulo");
        String year = request.getParameter("ano");

        if(artist == null || title == null || year == null){
            request.getRequestDispatcher("/WEB-INF/view/cd-registration.jsp").forward(request, response);
        } else {
            Integer yearInt = Integer.parseInt(year);
            Cd cd = new Cd(artist, title, yearInt);
            cdService.save(cd);
            request.setAttribute("cd", cd);
            request.getRequestDispatcher("/WEB-INF/view/cd-list.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String artist = request.getParameter("artist");
        String title = request.getParameter("title");
        String year = request.getParameter("year");
        Integer yearInt = Integer.parseInt(year);
        Cd cd = new Cd(artist, title, yearInt);
        cdService.save(cd);
        response.sendRedirect("listar-cds");
    }

}
