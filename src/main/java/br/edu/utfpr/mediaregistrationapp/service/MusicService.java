package br.edu.utfpr.mediaregistrationapp.service;

import br.edu.utfpr.mediaregistrationapp.model.dao.MusicDAO;
import br.edu.utfpr.mediaregistrationapp.model.domain.Music;

public class MusicService extends AbstractService<Long, Music>{

    public MusicService()
    {
        dao = new MusicDAO();
    }

}
