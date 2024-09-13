package br.com.edu.dao;

import br.com.edu.Cliente;

import java.util.List;

public interface IContratoDao {
    String salvar();

    String buscar();

    String excluir();

    Integer atualizar();
}


