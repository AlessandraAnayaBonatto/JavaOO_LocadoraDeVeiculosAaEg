/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import bancoDeDados.BancoDeDadosLocadora;
import controller.LocacaoController;
import static controller.LocacaoController.PesquisarLocacaoPorCpf;
import controller.LojaController;
import java.util.Scanner;
import models.ClientePessoaFisicaModel;
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
            System.out.println("CPF:" + l.getClietePF().getCpf());
            System.out.println("CARRO:" + l.getCarro().getCodigo());
            System.out.println("LOJA:" + l.getLoja().getCnpj());
            System.out.println("CARTÃO:" + l.getCartao().getNumeroCartao());      
            System.out.println("");
        }
        
    }
    
    public static void ExibirLocacaoPessoaJuridica()
    {        
        System.out.println("***Lista de Locações de pessoa juridica***");
        System.out.println("");
        
        for(PjLocacaoModel j : BancoDeDadosLocadora.getTabelaLocacaoPessoaJuridica())
        {
            System.out.println("CNPJ:" + j.getClientePj().getCnpj());
            System.out.println("CPF:" + j.getClietePF().getCpf());
            System.out.println("CARRO:" + j.getCarro().getCodigo());
            System.out.println("LOJA:" + j.getLoja().getCnpj());
            System.out.println("CARTÃO:" + j.getCartao().getNumeroCartao());
            System.out.println("");
        }
        
    }
    
    
    public static void ExibirLocacaoPorCpf() 
    {
        
        System.out.println("");
        System.out.println("***Exibir locacao por cpf***");
        System.out.print("Informe O Cpf: ");
        String cpf = leitor.nextLine(); 
        
        ClientePessoaFisicaModel pf = PesquisarLocacaoPorCpf(cpf);
    
        System.out.println("");
        if(pf != null){
            System.out.println("Dados locação pessoa Fisica");
            for(PfLocacaoModel f : BancoDeDadosLocadora.getTabelaLocacaoPessoaFisica())
            {
                if(pf.equals(f.getClietePF()))
                {                    
                    System.out.println("");
                    System.out.println("CPF:" + f.getClietePF().getCpf());
                    System.out.println("CARRO:" + f.getCarro().getCodigo());
                    System.out.println("LOJA:" + f.getLoja().getCnpj());
                    System.out.println("CARTÃO:" + f.getCartao().getNumeroCartao());
                    System.out.println("");
                }    
            }
        }else{
            System.out.println("CPF não cadastrado.");
            System.out.println("");
        }
        
    } 
}


        
    
    


