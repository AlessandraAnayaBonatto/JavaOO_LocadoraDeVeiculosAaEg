/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bancoDeDados.BancoDeDadosLocadora;
import models.CartaoDeCreditoModel;
import models.LojaModel;

/**
 *
 * @author eduar
 */
public class CartaoDeCreditoView {
    
    public static void ExibirCartoesCadastrados() 
    {
        //Leitura e exibição de todos os médicos cadastrados na Lista
        for(CartaoDeCreditoModel c : BancoDeDadosLocadora.getTabelaCartaoDeCredito())
        {
            System.out.println("***Lista de Cartões cadastrados***");
            System.out.println("Numero do cartão:" + c.getNumeroCartao());
            System.out.println("Nome do titular:" + c.getNomeDoTitular());
            System.out.println("Código de segurança:" + c.getCodigoSegurança());
            System.out.println("Mês de validade do cartão:" + c.getMesValidade());
            System.out.println("Ano de validade do cartão:" + c.getAnoValidade());            
                    
        }
       
    }
    
}
