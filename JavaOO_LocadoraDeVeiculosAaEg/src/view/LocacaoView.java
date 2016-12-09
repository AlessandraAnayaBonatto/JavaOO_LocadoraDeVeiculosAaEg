/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import bancoDeDados.BancoDeDadosLocadora;
import controller.LocacaoController;
import java.util.Scanner;
import models.ClientePessoaJuridicaModel;
import models.LocacaoModel;
import models.LojaModel;
import models.PfLocacaoModel;
import models.PjLocacaoModel;


/**
 *
 * @author aless
 */

public class LocacaoView 
{    
    private static Scanner leitor = new Scanner(System.in);
    
    public void Locacao ()
    {
    System.out.println("Informe qual o tipo de Locação:");
    String codLocacao = leitor.nextLine(); 
    
    if("PJ".equals(codLocacao))
    {
       LocacaoController.LocacaoPJ(); 
    }else
    {
       LocacaoController.LocacaoPF();
    }
    
    }
    
    
    public static void ExibirLocacaoPessoaFisica()
    {
        
        System.out.println("***Lista de Locações de pessoa fisica***");
        System.out.println("");
        
        
        for(PfLocacaoModel l : BancoDeDadosLocadora.getTabelaLocacaoPessoaFisica())
        {
            System.out.println("CPF:" + l.getClietePF());
            System.out.println("CARRO:" + l.getCarro());
            System.out.println("LOJA:" + l.getLoja());
            System.out.println("CARTÃO:" + l.getCartao());          
        }
        
    }
    
    public static void ExibirLocacaoPessoaJuridica()
    {        
        System.out.println("***Lista de Locações de pessoa juridica***");
        System.out.println("");
        
        for(PjLocacaoModel j : BancoDeDadosLocadora.getTabelaLocacaoPessoaJuridica())
        {
            System.out.println("CNPJ:" + j.getClientePj());
            System.out.println("CPF:" + j.getClietePF());
            System.out.println("CARRO:" + j.getCarro());
            System.out.println("LOJA:" + j.getLoja());
            System.out.println("CARTÃO:" + j.getCartao());
            
        }
        
    }
        
}
        
    
    


