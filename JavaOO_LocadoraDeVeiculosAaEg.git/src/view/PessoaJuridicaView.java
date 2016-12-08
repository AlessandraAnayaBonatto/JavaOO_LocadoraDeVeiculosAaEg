/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.CartaoDeCreditoModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaJuridicaModel;

/**
 *
 * @author eduar
 */
public class PessoaJuridicaView {
    
    
    public static void ExibirPessoaJuridica() 
    {
        //Leitura e exibição de todos os médicos cadastrados na Lista
        for(ClientePessoaJuridicaModel j : BancoDeDadosLocadora.getTabelaClientePessoaJuridica())
        {
            System.out.println("***Lista de pessoas juridicas cadastradas***");
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
               
        }
       
    }
    
}
