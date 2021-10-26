package br.edu.utfpr.mediaregistrationapp.controller;

import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;
import br.edu.utfpr.mediaregistrationapp.service.CdService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CdListController", value = {"", "/listar-cds"})
public class CdListController extends HttpServlet {

    CdService cdService = new CdService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cd> cds = cdService.findAll();
        request.setAttribute("cds", cds);
        request.getRequestDispatcher("/WEB-INF/view/cd-list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
