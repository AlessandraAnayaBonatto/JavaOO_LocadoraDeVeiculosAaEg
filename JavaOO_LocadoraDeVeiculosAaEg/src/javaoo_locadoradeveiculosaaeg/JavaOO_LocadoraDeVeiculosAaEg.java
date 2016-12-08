/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo_locadoradeveiculosaaeg;

import bancoDeDados.BancoDeDadosLocadora;
import view.MenuView;

public class JavaOO_LocadoraDeVeiculosAaEg 
{   
    public static void main(String[] args)
    {        
        BancoDeDadosLocadora.iniciarBancoDeDados();     
        
        MassaTeste.MassaTeste.GerarMassaTeste();
        
        MenuView.ExibirMenu();
        
        
    }    
}
