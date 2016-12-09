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

    public ClientePessoaJuridicaModel getClientePj() {
        return clientePj;
    }

    public void setClientePj(ClientePessoaJuridicaModel clientePj) {
        this.clientePj = clientePj;
    }
    
    @Override
    public boolean ValidaCnpj (String codCnpj){
        ClientePessoaJuridicaModel pj = controller.PessoaJuricaController.PesquisarPessoaPorCnpj(codCnpj);
        
        if(pj!= null){
            return true;
        }else{
          return false;
        }
    }
}
