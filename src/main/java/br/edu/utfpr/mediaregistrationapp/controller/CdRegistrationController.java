package br.edu.utfpr.mediaregistrationapp.controller;

import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;
import br.edu.utfpr.mediaregistrationapp.model.dto.CdDTO;
import br.edu.utfpr.mediaregistrationapp.model.mapper.CdMapper;
import br.edu.utfpr.mediaregistrationapp.service.CdService;
import br.edu.utfpr.mediaregistrationapp.util.Constants;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
            List<Cd> cds = cdService.findAll();
            request.setAttribute("cds", cds);
            request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String artist = request.getParameter("artist");
        String title = request.getParameter("title");
        String year = request.getParameter("year");
        Integer yearInt = Integer.parseInt(year);
        Cd cd = new Cd(artist, title, yearInt);
        cdService.save(cd);
        response.sendRedirect("listar-cds");
    }

}
