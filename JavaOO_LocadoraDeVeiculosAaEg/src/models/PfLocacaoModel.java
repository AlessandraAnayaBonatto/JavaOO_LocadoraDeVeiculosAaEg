/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.PfLocacaoInterface;

/**
 *
 * @author eduar
 */
public class PfLocacaoModel extends LocacaoModel implements PfLocacaoInterface{

    @Override
    public boolean ValidaCpf (String codCpf){
        ClientePessoaFisicaModel pf = controller.PessoaFisicaController.PesquisarPessoaPorCpf(codCpf);
        
        if(pf!= null){
            return true;
        }else{
          return false;
        }
    }
}
