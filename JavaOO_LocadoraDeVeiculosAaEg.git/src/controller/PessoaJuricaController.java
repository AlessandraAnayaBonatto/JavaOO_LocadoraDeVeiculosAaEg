/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.PessoaFisicaController.PesquisarPessoaPorCpf;
import java.util.Scanner;
import javaoo_locadoradeveiculosaaeg.git.JavaOO_LocadoraDeVeiculosAaEgGit;
import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaFisicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaJuridicaModel;

/**
 *
 * @author eduar
 */
public class PessoaJuricaController {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void CadastrarPessoaJuridica() 
    {
        
        System.out.println("Informe o nome:");
        String nomePessoaJuridica = leitor.nextLine(); 
        
        System.out.println("Informe o telefone:");
        int telefonePessoaJuridica = leitor.nextInt();
        leitor.nextInt();  
                
        System.out.println("Informe o Endereço da empresa:");
        
        System.out.println("Informe o nome da rua da empresa:");
        String enderecoPessoaJuridica = leitor.nextLine();
        
        System.out.println("Informe o numero da empresa:");
        int numeroCasaPessoaJuridica = leitor.nextInt();
               
        System.out.println("Informe o Cep da rua da empresa:");
        int cepPessoaJuridica = leitor.nextInt();
        leitor.nextInt();
        
        System.out.println("Informe algum complemento:");
        String complementoPessoaJuridica = leitor.nextLine();
        
        System.out.println("Informe o bairro da empresa:");
        String bairroPessoaJuridica = leitor.nextLine();
        
        System.out.println("Informe a cidade da empresa:");
        String cidadePessoaJuridica = leitor.nextLine();
        
        System.out.println("Informe o estado da empresa:");
        String estadoPessoaJuridica = leitor.nextLine();
        
        
        System.out.println("Informe o CNPJ:");
        String cnpjPessoaJuridica = leitor.nextLine();
        
        ClientePessoaJuridicaModel  p = new ClientePessoaJuridicaModel();
        
        
        p.setNome(nomePessoaJuridica);
        p.setTelefone(telefonePessoaJuridica);
        p.setEndereco(enderecoPessoaJuridica);
        p.setNumero(numeroCasaPessoaJuridica);
        p.setCep(cepPessoaJuridica);
        p.setComplemento(complementoPessoaJuridica);
        p.setBairro(bairroPessoaJuridica);
        p.setCidade(cidadePessoaJuridica);
        p.setEstado(cnpjPessoaJuridica);     
        p.setCnpj(cnpjPessoaJuridica);
        
        
        BancoDeDadosLocadora.getTabelaClientePessoaJuridica().add(p);
       
     
        
     }
    
    
    public static ClientePessoaJuridicaModel PesquisarPessoaPorCnpj (String codCnpj) 
    {
        
        for(ClientePessoaJuridicaModel j : BancoDeDadosLocadora.getTabelaClientePessoaJuridica())
        {
            if(j.getCnpj() == codCnpj)
            {
                return j;
            }      
        }             
        return null;
 
    }
    
    public static void AlterarPessoaJuridica() 
    {
        System.out.println("Digite o CNPJ que deseja alterar:");
        String codCnpj = leitor.nextLine();
        
       
        ClientePessoaJuridicaModel j = PesquisarPessoaPorCnpj(codCnpj);
        
        
        if (j != null)
        {
            System.out.println("Digite o novo Nome, (Anterior: " + j.getNome() + "): ");
            String novoNome = leitor.nextLine();
            
                j.setNome(novoNome);
            
            System.out.println("Informe o novo telefone, (Anterior: " + j.getTelefone() + "): ");
            int novoTelefone = leitor.nextInt();  
            leitor.nextLine();
            
                j.setTelefone(novoTelefone);
                
            System.out.println("Informe dados do novo endereço!");
            
            
            System.out.println("Digite o novo endereço, (Anterior: " + j.getEndereco()+ "): ");
            String novoEndereco = leitor.nextLine();
            
                j.setEndereco(novoEndereco);
                
            System.out.println("Digite o novo número, (Anterior: " + j.getNumero() + "): ");
            int novoNumero = leitor.nextInt();
            leitor.nextLine();
            
                j.setNumero(novoNumero);
            
            System.out.println("Digite o novo complemento, (Anterior: " + j.getComplemento() + "): ");
            String novoComplemento = leitor.nextLine();
            
                j.setComplemento(novoComplemento);
                
            System.out.println("Digite o novo CEP, (Anterior: " + j.getCep() + "): ");
            int novoCep = leitor.nextInt();
            leitor.nextLine();
            
                j.setCep(novoCep);
                
            System.out.println("Digite o novo Estado, (Anterior: " + j.getEstado() + "): ");
            String novoEstado = leitor.nextLine();
            
                j.setEstado(novoEstado);
                
            System.out.println("Digite a nova cidade, (Anterior: " + j.getCidade() + "): ");
            String novoCidade = leitor.nextLine();
            
                j.setCidade(novoCidade);
                
            System.out.println("Digite o novo bairro, (Anterior: " + j.getBairro() + "): ");
            String novoBairro = leitor.nextLine();
            
                j.setBairro(novoBairro);
                
            System.out.println("Digite o novo CNPJ, (Anterior: " + j.getCnpj() + "): ");
            String novoCnpjPessoaFisica = leitor.nextLine();     
                            
                j.setCnpj(novoCnpjPessoaFisica);              
            

            System.out.println("Pessoa Juridica alterada com Sucesso!");
            
        }else
        {
            System.out.println("CNPJ  não cadastrado!");
        }  
        
    }
        
        public static void ExcluirPessoaJuridica() 
        {
            
            System.out.println("Digite o CNPJ da pessoa que deseja excluir:");
            String codCnpj = leitor.nextLine();
            leitor.nextLine();

            ClientePessoaJuridicaModel c = PesquisarPessoaPorCnpj (codCnpj);


            if (c != null)
            {
                
                BancoDeDadosLocadora.getTabelaClientePessoaJuridica().remove(c);
                
                System.out.println("Pessoa Juridica excluida com Sucesso!");

            }else
            {
                System.out.println("Pessoa Juridica não cadastrada no sistema!!!");
            }     

        }
        
    }
    
