/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaFisicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaJuridicaModel;

/**
 *
 * @author eduar
 */
public class PessoaFisicaView {
    
    public static void ExibirPessoaFisica() 
    {
        //Leitura e exibição de todos os médicos cadastrados na Lista
        for(ClientePessoaFisicaModel f : BancoDeDadosLocadora.getTabelaClientesPessoaFisica())
        {
            System.out.println("***Lista de pessoas fisicas cadastradas***");
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
               
        }
       
    }
    
}
