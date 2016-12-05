/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo_locadoradeveiculosaaeg.git.models;

/**
 Classe utilizada para cadastro de clientes pessoa juridica no sistema;
 */
public class ClientePessoaJuridicaModel extends Pessoa{
    private String cnpj;
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
