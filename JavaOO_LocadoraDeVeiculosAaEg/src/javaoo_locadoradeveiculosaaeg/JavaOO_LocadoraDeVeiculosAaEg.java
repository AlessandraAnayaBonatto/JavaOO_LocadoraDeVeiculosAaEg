/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo_locadoradeveiculosaaeg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import bancoDeDados.BancoDeDadosLocadora;
import models.CarroModel;
import models.CartaoDeCreditoModel;
import models.ClientePessoaFisicaModel;
import models.ClientePessoaJuridicaModel;
import models.LojaModel;
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
