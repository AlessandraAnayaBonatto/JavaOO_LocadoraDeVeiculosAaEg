/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo_locadoradeveiculosaaeg.git.models;

/**
 *
 * @author eduar
 */
public class CartaoDeCreditoModel {
    private String numeroCartao;
    private int codigoSegurança;
    private String nomeDoTitular;
    private int mesValidade;
    private int anoValidade;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getCodigoSegurança() {
        return codigoSegurança;
    }

    public void setCodigoSegurança(int codigoSegurança) {
        this.codigoSegurança = codigoSegurança;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public int getMesValidade() {
        return mesValidade;
    }

    public void setMesValidade(int mesValidade) {
        this.mesValidade = mesValidade;
    }

    public int getAnoValidade() {
        return anoValidade;
    }

    public void setAnoValidade(int anoValidade) {
        this.anoValidade = anoValidade;
    }
}
