/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.PessoaJuricaController.PesquisarPessoaPorCnpj;
import java.util.Scanner;
import javaoo_locadoradeveiculosaaeg.git.JavaOO_LocadoraDeVeiculosAaEgGit;
import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.CartaoDeCreditoModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaJuridicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.LojaModel;

/**
 *
 * @author eduar
 */
public class CartaoDeCreditoController {
    
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void CadastrarCartadeCredito() 
    {
        System.out.println("Informe o número d cartão:");
        String numeroCartao = leitor.nextLine();
        
        System.out.println("Informe o nome do titular:");
        String nomeDoTitular = leitor.nextLine();
        
        System.out.println("Informe o codigo de seguranca:");
        int codigoSeguranca = leitor.nextInt();
        leitor.nextLine();
            
        System.out.println("Informe o mes de validade:");
        int mesValidade = leitor.nextInt();
        leitor.nextLine();
        
        System.out.println("Informe o ano de validade:");
        int anoValidade = leitor.nextInt();
        leitor.nextLine();
   
        CartaoDeCreditoModel c = new CartaoDeCreditoModel();
        
        c.setNumeroCartao(numeroCartao);
        c.setNomeDoTitular(nomeDoTitular);
        c.setCodigoSegurança(codigoSeguranca);
        c.setMesValidade(mesValidade);
        c.setAnoValidade(anoValidade);
        
        BancoDeDadosLocadora.getTabelaCartaoDeCredito().add(c);
        
    }
    
    
    public static void AlterarCartaoCredito() 
    {
       System.out.println("Digite o numerodo cartão que deseja alterar:");
       String numeroCartao = leitor.nextLine();
      
         CartaoDeCreditoModel c = new CartaoDeCreditoModel ();
        
       
        if (c != null)
        {
            System.out.println("Digite o novo número do cartão, (Anterior: " + c.getNumeroCartao()+ "): ");
            String novoNumeroCartao = leitor.nextLine();
                        
                c.setNumeroCartao(novoNumeroCartao);
            
            System.out.println("Digite o novo nome do titular do cartão, (Anterior: " + c.getNomeDoTitular() + "): ");
            String novoNomeCartao = leitor.nextLine();
            
                c.setNomeDoTitular(novoNomeCartao);
                
            System.out.println("Digite o novo codigo de segurança, (Anterior: " + c.getCodigoSegurança() + "): ");
            int novoCodCartao = leitor.nextInt();
                
                c.setCodigoSegurança(novoCodCartao);

            System.out.println("Digite o novo mes de valiade, (Anterior: " + c.getMesValidade() + "): ");
            int novoMesCartao = leitor.nextInt();
                
                c.setMesValidade(novoMesCartao);
            
            System.out.println("Digite o novo ano de validade, (Anterior: " + c.getAnoValidade() + "): ");
            int novoAnoCartao = leitor.nextInt();
                
                c.setAnoValidade(novoAnoCartao);
        
            System.out.println("Cartão alterado com Sucesso!");
            
            
        }else
        {
            System.out.println("Cartão não cadastrado!");
        }  
    
    }
        
        public static void ExcluirCartao() 
        {
            
            System.out.println("Digite o numero do cartão que deseja excluir:");
            String numeroCartao = leitor.nextLine();
            leitor.nextLine();

            if (numeroCartao != null)
            {
                
                BancoDeDadosLocadora.getTabelaCartaoDeCredito().remove(numeroCartao);
                System.out.println("Cartão excluido com Sucesso!");

            }else
            {
                System.out.println("Cartão não cadastrado no sistema!!!");
            }     

        }

    }
