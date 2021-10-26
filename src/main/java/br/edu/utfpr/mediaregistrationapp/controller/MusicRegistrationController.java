package br.edu.utfpr.mediaregistrationapp.controller;

import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;
import br.edu.utfpr.mediaregistrationapp.model.domain.Music;
import br.edu.utfpr.mediaregistrationapp.service.CdService;
import br.edu.utfpr.mediaregistrationapp.service.MusicService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MusicRegistrationController", value = "/cadastrar-musicas")
public class MusicRegistrationController extends HttpServlet {

    MusicService musicService = new MusicService();
    CdService cdService = new CdService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/music-registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cdId = request.getParameter("cd_id");
        String track = request.getParameter("track");
        String title = request.getParameter("title");
        Long cdIdInt = Long.parseLong(cdId);
        Integer trackInt = Integer.parseInt(track);
        Cd cd = cdService.getById(cdIdInt);
        Music music = new Music(trackInt, title, cd);
        musicService.save(music);
        response.sendRedirect("listar-cds");
    }

}
