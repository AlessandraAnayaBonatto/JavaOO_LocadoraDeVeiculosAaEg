/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import javaoo_locadoradeveiculosaaeg.git.JavaOO_LocadoraDeVeiculosAaEgGit;
import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
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
        String numeroCasaPessoaJuridica = leitor.nextLine();
               
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
    
}
