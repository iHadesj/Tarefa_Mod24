package br.com.edu.service;

import br.com.edu.dao.IContratoDao;

public class ContratoService implements IContratoService {

       private IContratoDao contratoDao;


       public ContratoService(IContratoDao dao) {
               this.contratoDao = dao;

    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "sucesso";
       }

    @Override
    public String buscar() {
        return "Cliente encontrado";
    }

    @Override
    public String excluir() {
        return "Cliente excluido com sucesso";
    }

    @Override
    public Integer atualizar() {
        return 1000;
    }
}

