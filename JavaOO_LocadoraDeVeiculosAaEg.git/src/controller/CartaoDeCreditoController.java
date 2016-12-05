/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import javaoo_locadoradeveiculosaaeg.git.JavaOO_LocadoraDeVeiculosAaEgGit;
import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.CartaoDeCreditoModel;

/**
 *
 * @author eduar
 */
public class CartaoDeCreditoController {
    
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void CadastrarCartadeCredito() 
    {
        System.out.println("Informe o número d cartão:");
        String numeroCartao = leitor.nextLine();
        
        System.out.println("Informe o nome do titular:");
        String nomeDoTitular = leitor.nextLine();
        
        System.out.println("Informe o codigo de seguranca:");
        int codigoSeguranca = leitor.nextInt();
        leitor.nextLine();
            
        System.out.println("Informe o mes de validade:");
        int mesValidade = leitor.nextInt();
        leitor.nextLine();
        
        System.out.println("Informe o ano de validade:");
        int anoValidade = leitor.nextInt();
        leitor.nextLine();
   
        CartaoDeCreditoModel c = new CartaoDeCreditoModel();
        
        c.setNumeroCartao(numeroCartao);
        c.setNomeDoTitular(nomeDoTitular);
        c.setCodigoSegurança(codigoSeguranca);
        c.setMesValidade(mesValidade);
        c.setAnoValidade(anoValidade);
        
        BancoDeDadosLocadora.getTabelaCartaoDeCredito().add(c);
        
    }
    
}
