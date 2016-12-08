/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo_locadoradeveiculosaaeg.git.models;

/**
 Classe utilizada para cadastro de clientes pessoa fisica no sistema;
 */
public class ClientePessoaFisicaModel extends Pessoa{
    private String cpf;
    //Dados da CNH
    private String categoriaCnh;
    private String tempoCnh;
    private String estadoEmissorCnh;
    private String numeroCnh;
    private String registroCnh;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCategoria() {
        return categoriaCnh;
    }

    public void setCategoria(String categoria) {
        this.categoriaCnh = categoria;
    }

    public String getTempo() {
        return tempoCnh;
    }

    public void setTempo(String tempo) {
        this.tempoCnh = tempo;
    }

    public String getEstadoEmissor() {
        return estadoEmissorCnh;
    }

    public void setEstadoEmissor(String estadoEmissor) {
        this.estadoEmissorCnh = estadoEmissor;
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(String numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public String getRegistroCnh() {
        return registroCnh;
    }

    public void setRegistroCnh(String registroCnh) {
        this.registroCnh = registroCnh;
    }
}
