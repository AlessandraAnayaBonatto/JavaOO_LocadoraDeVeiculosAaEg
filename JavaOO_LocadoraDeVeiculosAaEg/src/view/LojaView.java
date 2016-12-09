/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LojaController;
import bancoDeDados.BancoDeDadosLocadora;
import java.util.Scanner;
import models.LojaModel;

/**
 *
 * @author eduar
 */
public class LojaView {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void ExibirLojasCadastradas() 
    {
        //Leitura e exibição de todos os médicos cadastrados na Lista
        System.out.println("***Lista de Lojas cadastradas***");
        for(LojaModel l : BancoDeDadosLocadora.getTabelaLoja())
        {
            System.out.println("Nome da loja:" + l.getNome());
            System.out.println("CNPJ da loja:" + l.getCnpj());
            System.out.println("Horaio de inicio de funcionamento da loja:" + l.getHorarioInicio());
            System.out.println("Horario de fim de funcionamento da loja:" + l.getHorarioFim());
            
            System.out.println("Endereço da Loja");
            System.out.println("Endereço:" + l.getEndereco());
            System.out.println("Número:" + l.getNumero());
            System.out.println("Complemento:" + l.getComplemento());
            System.out.println("CEP:" + l.getCep());
            System.out.println("Estado:" + l.getEstado());
            System.out.println("Cidade:" + l.getCidade());
            System.out.println("Bairro:" + l.getBairro());
            System.out.println("--- --- --- --- --- --- ---");
                    
        }
       
    }
    
    public static void ExibirLojaPorCnpj() 
    {
        System.out.println("");
        System.out.println("***Exibir loja por CNPJ***");
        System.out.print("Informe O CNPJ: ");
        String cnpjLoja = leitor.nextLine(); 
        
        LojaModel lj = LojaController.PesquisarLojaPorCnpj(cnpjLoja);
        
        System.out.println("");
        if(lj != null){
            System.out.println("Dados Loja");
            for(LojaModel l : BancoDeDadosLocadora.getTabelaLoja())
            {
                if(lj.equals(l)){
                    System.out.println("Nome da loja:" + l.getNome());
                    System.out.println("CNPJ da loja:" + l.getCnpj());
                    System.out.println("Horaio de inicio de funcionamento da loja:" + l.getHorarioInicio());
                    System.out.println("Horario de fim de funcionamento da loja:" + l.getHorarioFim());

                    System.out.println("Endereço da Loja");
                    System.out.println("Endereço:" + l.getEndereco());
                    System.out.println("Número:" + l.getNumero());
                    System.out.println("Complemento:" + l.getComplemento());
                    System.out.println("CEP:" + l.getCep());
                    System.out.println("Estado:" + l.getEstado());
                    System.out.println("Cidade:" + l.getCidade());
                    System.out.println("Bairro:" + l.getBairro());
                    System.out.println("--- --- --- --- --- --- ---");
                }    
            }
        }else{
            System.out.println("CNPJ não cadastrado.");
            System.out.println("");
        }
       
    }
}
