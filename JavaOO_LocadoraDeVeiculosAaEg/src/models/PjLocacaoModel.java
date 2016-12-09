/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author eduar
 */
public class PjLocacaoModel extends LocacaoModel{
    private ClientePessoaJuridicaModel clientePj;

    public ClientePessoaJuridicaModel getClientePj() {
        return clientePj;
    }

    public void setClientePj(ClientePessoaJuridicaModel clientePj) {
        this.clientePj = clientePj;
    }
    
    
}
