/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import javaoo_locadoradeveiculosaaeg.git.JavaOO_LocadoraDeVeiculosAaEgGit;
import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaFisicaModel;

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
        String numeroCasaPessoaFisica = leitor.nextLine();
               
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
    
}
