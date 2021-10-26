package br.edu.utfpr.mediaregistrationapp.controller;

import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;
import br.edu.utfpr.mediaregistrationapp.model.domain.Music;
import br.edu.utfpr.mediaregistrationapp.model.dto.CdDTO;
import br.edu.utfpr.mediaregistrationapp.model.mapper.CdMapper;
import br.edu.utfpr.mediaregistrationapp.service.CdService;
import br.edu.utfpr.mediaregistrationapp.service.MusicService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CdDetailController", value = "/visualizar")
public class CdDetailController extends HttpServlet {

    CdService cdService = new CdService();
    MusicService musicService = new MusicService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cdId = request.getParameter("codCD");
        Long cdIdInt = Long.parseLong(cdId);
        Cd cd = cdService.getById(cdIdInt);
        CdDTO cdDTO = CdMapper.toDTO(cd);
        List<Music> musicList = musicService.listByForeignOrObjectProperty("cd", cd);
        request.setAttribute("flash.cd", cdDTO);
        request.setAttribute("flash.musics", musicList);
        request.getRequestDispatcher("/resultado").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
