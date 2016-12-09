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

    private String status;
    
     public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public  String AlugaParaCpf (){
            this.status = "Locação efetuada com Sucesso!!";
            return status;
    }
}
