package br.com.edu.dao;

public class ContratoDao implements IContratoDao{

    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
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