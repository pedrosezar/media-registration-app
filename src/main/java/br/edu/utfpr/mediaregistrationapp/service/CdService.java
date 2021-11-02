package br.edu.utfpr.mediaregistrationapp.service;

import br.edu.utfpr.mediaregistrationapp.model.dao.CdDAO;
import br.edu.utfpr.mediaregistrationapp.model.domain.Cd;

public class CdService extends AbstractService<Long, Cd>{

    public CdService() {
        dao = new CdDAO();
    }

}
