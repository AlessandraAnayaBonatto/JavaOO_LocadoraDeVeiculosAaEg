/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import bancoDeDados.BancoDeDadosLocadora;
import models.ClientePessoaFisicaModel;

/**
 *
 * @author eduar
 */
public class PessoaFisicaController {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void CadastrarPessoaFisica() 
    {        
        System.out.println("Informe o nome:");
        String nomePessoaFisica = leitor.nextLine(); 
        
        System.out.println("Informe o telefone:");
        int telefonePessoaFisica = leitor.nextInt();
        leitor.nextInt();
        
        System.out.println("Informe o CPF:");
        String cpfPessoaFisica = leitor.nextLine(); 
        
        System.out.println("Informe o Endereço:");
        
        System.out.println("Informe o nome da rua:");
        String enderecoPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o numero da casa:");
        int numeroCasaPessoaFisica = leitor.nextInt();
               
        System.out.println("Informe o Cep da rua:");
        int cepPessoaFisica = leitor.nextInt();
        leitor.nextInt();
        
        System.out.println("Informe algum complemento:");
        String complementoPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o bairro:");
        String bairroPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe a cidade:");
        String cidadePessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o estado:");
        String estadoPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe dados da CNH:");
      
        System.out.println("Informe a categoria da CNH:");
        String categoriaCnhPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o tempo da CNH:");
        String tempoCnhPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o estado emissor da CNH:");
        String estadoEmissorCnhPessoaFisica = leitor.nextLine();

        System.out.println("Informe o numero da CNH:");
        String numeroCnhPessoaFisica = leitor.nextLine();
   
        System.out.println("Informe o registro da CNH:");
        String registroCnhPessoaFisica = leitor.nextLine();
   
        ClientePessoaFisicaModel p = new ClientePessoaFisicaModel();
        
        p.setNome(nomePessoaFisica);
        p.setTelefone(telefonePessoaFisica);
        p.setCpf(cpfPessoaFisica);
        p.setEndereco(enderecoPessoaFisica);
        p.setNumero(numeroCasaPessoaFisica);
        p.setCep(cepPessoaFisica);
        p.setComplemento(complementoPessoaFisica);
        p.setBairro(bairroPessoaFisica);
        p.setCidade(cidadePessoaFisica);
        p.setEstado(estadoPessoaFisica);
        p.setCategoria(categoriaCnhPessoaFisica);
        p.setTempo(tempoCnhPessoaFisica);
        p.setEstadoEmissor(estadoEmissorCnhPessoaFisica);
        p.setNumeroCnh(numeroCnhPessoaFisica);
        p.setRegistroCnh(registroCnhPessoaFisica);
    
        BancoDeDadosLocadora.getTabelaClientesPessoaFisica().add(p);
        
        
    }
    
    public static ClientePessoaFisicaModel PesquisarPessoaPorCpf (String codCpf) 
    {
        
        for(ClientePessoaFisicaModel p : BancoDeDadosLocadora.getTabelaClientesPessoaFisica())
        {
            if(p.getCpf() == codCpf)
            {
                return p;
            }      
        }             
        return null;
 
    }
    
    public static void AlterarPessoaFisica() 
    {
        System.out.println("Digite o CPF que deseja alterar:");
        String codCpf = leitor.nextLine();
        
       
        ClientePessoaFisicaModel c = PesquisarPessoaPorCpf(codCpf);
        
        
        if (c != null)
        {
            System.out.println("Digite o novo Nome, (Anterior: " + c.getNome() + "): ");
            String novoNome = leitor.nextLine();
            
                c.setNome(novoNome);
            
            System.out.println("Informe o novo telefone, (Anterior: " + c.getTelefone() + "): ");
            int novoTelefone = leitor.nextInt();  
            leitor.nextLine();
            
                c.setTelefone(novoTelefone);
                
            System.out.println("Informe dados do novo endereço!");
            
            
            System.out.println("Digite o novo endereço, (Anterior: " + c.getEndereco()+ "): ");
            String novoEndereco = leitor.nextLine();
            
                c.setEndereco(novoEndereco);
                
            System.out.println("Digite o novo número, (Anterior: " + c.getNumero() + "): ");
            int novoNumero = leitor.nextInt();
            leitor.nextLine();
            
                c.setNumero(novoNumero);
            
            System.out.println("Digite o novo complemento, (Anterior: " + c.getComplemento() + "): ");
            String novoComplemento = leitor.nextLine();
            
                c.setComplemento(novoComplemento);
                
            System.out.println("Digite o novo CEP, (Anterior: " + c.getCep() + "): ");
            int novoCep = leitor.nextInt();
            leitor.nextLine();
            
                c.setCep(novoCep);
                
            System.out.println("Digite o novo Estado, (Anterior: " + c.getEstado() + "): ");
            String novoEstado = leitor.nextLine();
            
                c.setEstado(novoEstado);
                
            System.out.println("Digite a nova cidade, (Anterior: " + c.getCidade() + "): ");
            String novoCidade = leitor.nextLine();
            
                c.setCidade(novoCidade);
                
            System.out.println("Digite o novo bairro, (Anterior: " + c.getBairro() + "): ");
            String novoBairro = leitor.nextLine();
            
                c.setBairro(novoBairro);
                
            System.out.println("Digite o novo CPF, (Anterior: " + c.getCpf() + "): ");
            String novoCpfPessoaFisica = leitor.nextLine();     
                            
                c.setCpf(novoCpfPessoaFisica);
                
            System.out.println("Informe novos dados da CNH:");
      
            System.out.println("Digite a nova categoria, (Anterior: " + c.getCategoria() + "): ");
            String novaCategoriaCnhPessoaFisica = leitor.nextLine();
            
                c.setCategoria(novaCategoriaCnhPessoaFisica);

            System.out.println("Digite o novo tempo da CNH, (Anterior: " + c.getTempo() + "): ");
            String novoTempoCnhPessoaFisica = leitor.nextLine();
            
                c.setTempo(novoTempoCnhPessoaFisica);

            System.out.println("Digite o novo estado emissor da CNH, (Anterior: " + c.getEstadoEmissor() + "): ");
            String novoEstadoEmissorCnhPessoaFisica = leitor.nextLine();
            
                c.setEstadoEmissor(novoEstadoEmissorCnhPessoaFisica);

            System.out.println("Digite o novo numero da CNH, (Anterior: " + c.getNumeroCnh() + "): ");
            String novoNumeroCnhPessoaFisica = leitor.nextLine();
            
                c.setNumeroCnh(novoNumeroCnhPessoaFisica);

            System.out.println("Digite o novo registro da CNH, (Anterior: " + c.getRegistroCnh() + "): ");
            String novoRegistroCnhPessoaFisica = leitor.nextLine();
            
                c.setRegistroCnh(novoRegistroCnhPessoaFisica);
            
            
            System.out.println("Pessoa Física alterada com Sucesso!");
            
        }else
        {
            System.out.println("CPF  não cadastrado!");
        }       
    } 


    public static void ExcluirPessoaFisica() 
    {
        System.out.println("Digite o CPF da pessoa que deseja excluir:");
        String codCpf = leitor.nextLine();
        leitor.nextLine();
        
        ClientePessoaFisicaModel c = PesquisarPessoaPorCpf (codCpf);
        
        
        if (c != null)
        {
            BancoDeDadosLocadora.getTabelaClientesPessoaFisica().remove(c);
            
            System.out.println("Pessoa física excluida com Sucesso!");
            
        }else
        {
            System.out.println("Pessoa física não cadastrada no sistema!!!");
        }     
        
    }
              
    
}
