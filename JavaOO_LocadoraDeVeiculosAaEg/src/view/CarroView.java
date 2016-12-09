/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bancoDeDados.BancoDeDadosLocadora;
import models.CarroModel;

/**
 *
 * @author eduar
 */
public class CarroView {
    
    public static void ExibirCarros() 
    {
        //Leitura e exibição de todos os médicos cadastrados na Lista
        System.out.println("***Lista de carros cadastrados***");
        for(CarroModel c : BancoDeDadosLocadora.getTabelaCarro())
        {
            System.out.println("Código:" + c.getCodigo());
            System.out.println("Marca:" + c.getMarca());
            System.out.println("Modelo:" + c.getModelo());
            
            System.out.println("Ano:" + c.getAno());
            System.out.println("Categoria:" + c.getCategoria());
            System.out.println("Nível do tanque:" + c.getNivelTanque());
            System.out.println("Potência do motor:" + c.getPotenciaMotor());
            System.out.println("Tipo de Câmbio:" + c.getTipoCambio());
            System.out.println("Tipo de combustivel:" + c.getTipoCombustivel());
            
            System.out.println("Quantidade de Malas:" + c.getQuantMalas());
            System.out.println("Quantidade de pessoas:" + c.getQuantPessoas());
            System.out.println("Quantidade de portas:" + c.getQuantPortas());
            System.out.println("Quilometragem:" + c.getQuilometragem());
            System.out.println("Valores:" + c.getValores());
            System.out.println("Taxas:" + c.getTaxas());
            System.out.println("--- --- --- --- --- --- ---");
        }
    }
    
   
}
