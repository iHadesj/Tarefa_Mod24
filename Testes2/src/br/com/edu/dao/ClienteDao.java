package br.com.edu.dao;

import br.com.edu.Cliente;

import java.util.ArrayList;
import java.util.List;


public class ClienteDao implements IClienteDao {

    private final List<Cliente> clientes = new ArrayList<>();

    public String salvar() {
        throw new UnsupportedOperationException("Nao funciona sem config de banco");
        //return "sucesso";
    }

}