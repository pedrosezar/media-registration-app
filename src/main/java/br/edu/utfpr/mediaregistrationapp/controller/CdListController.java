package br.edu.utfpr.mediaregistrationapp.controller;

import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;
import br.edu.utfpr.mediaregistrationapp.model.dto.CdDTO;
import br.edu.utfpr.mediaregistrationapp.model.mapper.CdMapper;
import br.edu.utfpr.mediaregistrationapp.service.CdService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "CdListController", urlPatterns = {"", "/listar-cds"})
public class CdListController extends HttpServlet {

    CdService cdService = new CdService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cd> cds = cdService.findAll();
        List<CdDTO> cdDTOs = cds.stream().map(cd -> CdMapper.toDTO(cd)).collect(Collectors.toList());
        request.setAttribute("cds", cdDTOs);
        request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
