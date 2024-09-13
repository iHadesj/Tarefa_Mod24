package br.com.edu.dao.mock;

import br.com.edu.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {

    @Override
    public String salvar() {
        return null;
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
