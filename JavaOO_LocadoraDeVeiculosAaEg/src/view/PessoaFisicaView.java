/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bancoDeDados.BancoDeDadosLocadora;
import models.ClientePessoaFisicaModel;
import models.ClientePessoaJuridicaModel;

/**
 *
 * @author eduar
 */
public class PessoaFisicaView {
    
    public static void ExibirPessoaFisica() 
    {
        //Leitura e exibição de todos os médicos cadastrados na Lista
        System.out.println("***Lista de pessoas fisicas cadastradas***");
        for(ClientePessoaFisicaModel f : BancoDeDadosLocadora.getTabelaClientesPessoaFisica())
        {
            System.out.println("Nome:" + f.getNome());
            System.out.println("CPF:" + f.getCpf());
            System.out.println("Telefone:" + f.getTelefone());
            
            System.out.println("Endereço");
            
            System.out.println("Endereço:" + f.getEndereco());
            System.out.println("Número:" + f.getNumero());     
            System.out.println("CEP:" + f.getCep()); 
            System.out.println("Estado:" + f.getEstado());   
            System.out.println("Cidade:" + f.getCidade());   
            System.out.println("Bairro:" + f.getBairro());  
            
            System.out.println("Dados CNH");
            
            System.out.println("Número CNH:" + f.getNumeroCnh()); 
            System.out.println("Registro CNH:" + f.getRegistroCnh()); 
            System.out.println("Estado emissor CNH:" + f.getEstadoEmissor()); 
            System.out.println("Categoria CNH:" + f.getCategoria()); 
            System.out.println("Tempo de CNH:" + f.getTempo()); 
            System.out.println("--- --- --- --- --- --- ---");   
        }
       
    }
    
}
