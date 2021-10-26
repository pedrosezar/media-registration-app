package br.edu.utfpr.mediaregistrationapp.controller;

import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;
import br.edu.utfpr.mediaregistrationapp.service.CdService;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "CdController", value = "/cds")
public class CdController extends HttpServlet {

    CdService cdService = new CdService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cd> cds = cdService.findAll();
        String json = new Gson().toJson(cds);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
