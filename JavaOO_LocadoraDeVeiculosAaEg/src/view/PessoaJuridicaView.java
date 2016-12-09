/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bancoDeDados.BancoDeDadosLocadora;
import java.util.Scanner;
import models.ClientePessoaJuridicaModel;
import controller.PessoaJuricaController;

/**
 *
 * @author eduar
 */
public class PessoaJuridicaView {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void ExibirPessoaJuridica() 
    {
        //Leitura e exibição de todos os médicos cadastrados na Lista
        System.out.println("***Lista de pessoas juridicas cadastradas***");
        for(ClientePessoaJuridicaModel j : BancoDeDadosLocadora.getTabelaClientePessoaJuridica())
        {
            System.out.println("Nome:" + j.getNome());
            System.out.println("CNPJ:" + j.getCnpj());
            System.out.println("Telefone:" + j.getTelefone());
            
            System.out.println("Endereço");
            
            System.out.println("Endereço:" + j.getEndereco());
            System.out.println("Número:" + j.getNumero());     
            System.out.println("CEP:" + j.getCep()); 
            System.out.println("Estado:" + j.getEstado());   
            System.out.println("Cidade:" + j.getCidade());   
            System.out.println("Bairro:" + j.getBairro());   
            System.out.println("--- --- --- --- --- --- ---");   
        }
       
    }
    
    public static void ExibirPessoaJuridicaPorCnpj() 
    {
        System.out.println("");
        System.out.println("***Exibir pessoa juridica por CNPJ***");
        System.out.print("Informe O CNPJ: ");
        String cnpjPessoaJuridica = leitor.nextLine(); 
        
        ClientePessoaJuridicaModel pj = PessoaJuricaController.PesquisarPessoaPorCnpj(cnpjPessoaJuridica);
        
        System.out.println("");
        if(pj != null){
            System.out.println("Dados Pesso Juridica");
            for(ClientePessoaJuridicaModel j : BancoDeDadosLocadora.getTabelaClientePessoaJuridica())
            {
                if(pj.equals(j)){
                    System.out.println("Nome:" + j.getNome());
                    System.out.println("CNPJ:" + j.getCnpj());
                    System.out.println("Telefone:" + j.getTelefone());

                    System.out.println("Endereço");

                    System.out.println("Endereço:" + j.getEndereco());
                    System.out.println("Número:" + j.getNumero());     
                    System.out.println("CEP:" + j.getCep()); 
                    System.out.println("Estado:" + j.getEstado());   
                    System.out.println("Cidade:" + j.getCidade());   
                    System.out.println("Bairro:" + j.getBairro());   
                    System.out.println("--- --- --- --- --- --- ---");   
                    System.out.println("");
                }    
            }
        }else{
            System.out.println("CNPJ não cadastrado.");
            System.out.println("");
        }
       
    }
}
