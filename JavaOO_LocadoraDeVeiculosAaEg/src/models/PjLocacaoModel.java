/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.PjLocacaoInterface;

/**
 *
 * @author eduar
 */
public class PjLocacaoModel extends LocacaoModel implements PjLocacaoInterface{
    private ClientePessoaJuridicaModel clientePj;
    private String status;
    
    public ClientePessoaJuridicaModel getClientePj() {
        return clientePj;
    }

    public void setClientePj(ClientePessoaJuridicaModel clientePj) {
        this.clientePj = clientePj;
    }
    
   
    
     public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public  String AlugaParaCnpj (){
            this.status = "Locação efetuada com Sucesso!!";
            return status;
    }
}
