/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo_locadoradeveiculosaaeg.git;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.CarroModel;
import javaoo_locadoradeveiculosaaeg.git.models.CartaoDeCreditoModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaFisicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaJuridicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.LojaModel;
import view.MenuView;

public class JavaOO_LocadoraDeVeiculosAaEgGit 
{   
    public static void main(String[] args)
    {        
        BancoDeDadosLocadora.iniciarBancoDeDados();     
        
        MassaTeste.MassaTeste.GerarMassaTeste();
        
        MenuView.ExibirMenu();
        
        
    }    
}
