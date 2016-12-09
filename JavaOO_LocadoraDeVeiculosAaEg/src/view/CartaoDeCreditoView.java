/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bancoDeDados.BancoDeDadosLocadora;
import java.util.Scanner;
import models.CartaoDeCreditoModel;
import controller.CartaoDeCreditoController;

/**
 *
 * @author eduar
 */
public class CartaoDeCreditoView {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void ExibirCartoesCadastrados() 
    {
        //Leitura e exibição de todos os médicos cadastrados na Lista
        System.out.println("***Lista de Cartões cadastrados***");
        for(CartaoDeCreditoModel c : BancoDeDadosLocadora.getTabelaCartaoDeCredito())
        {
            
            System.out.println("Numero do cartão:" + c.getNumeroCartao());
            System.out.println("Nome do titular:" + c.getNomeDoTitular());
            System.out.println("Código de segurança:" + c.getCodigoSegurança());
            System.out.println("Mês de validade do cartão:" + c.getMesValidade());
            System.out.println("Ano de validade do cartão:" + c.getAnoValidade());            
            System.out.println("--- --- --- --- --- --- ---");        
        }
       
    }
    
    public static void ExibirCartoesCadastradosPorNumero() 
    {
        System.out.println("");
        System.out.println("***Exibir cartão por numero***");
        System.out.print("Informe O Numero: ");
        String numeroCartao = leitor.nextLine();
        
        CartaoDeCreditoModel cc = CartaoDeCreditoController.PesquisarCartaoPorNumero(numeroCartao);
        
        System.out.println("");
        if(cc != null){
            System.out.println("Dados Cartão");
            for(CartaoDeCreditoModel c : BancoDeDadosLocadora.getTabelaCartaoDeCredito())
            {
                if(cc.equals(c)){
                    System.out.println("Numero do cartão:" + c.getNumeroCartao());
                    System.out.println("Nome do titular:" + c.getNomeDoTitular());
                    System.out.println("Código de segurança:" + c.getCodigoSegurança());
                    System.out.println("Mês de validade do cartão:" + c.getMesValidade());
                    System.out.println("Ano de validade do cartão:" + c.getAnoValidade());            
                    System.out.println("--- --- --- --- --- --- ---");        
                    System.out.println("");
                }    
            }
        }else{
            System.out.println("Numero não cadastrado.");
            System.out.println("");
        }
        
    }
    
}
