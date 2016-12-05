/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import javaoo_locadoradeveiculosaaeg.git.JavaOO_LocadoraDeVeiculosAaEgGit;
import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.LojaModel;

/**
 *
 * @author eduar
 */
public class LojaController {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void CadastrarLoja() 
    {
         
        System.out.println("Informe o nome da loja:");
        String nomeLoja = leitor.nextLine();
        
        System.out.println("Informe o endereco da loja:");
        String enderecoLoja = leitor.nextLine();
        
        System.out.println("Informe o numero da loja:");
        String numeroLoja = leitor.nextLine();
               
        System.out.println("Informe o Cep da loja:");
        int cepLoja = leitor.nextInt();
        leitor.nextInt();
        
        System.out.println("Informe algum complemento da loja:");
        String complementoLoja = leitor.nextLine();
        
        System.out.println("Informe o bairro da loja:");
        String bairroLoja = leitor.nextLine();
        
        System.out.println("Informe a cidade da loja:");
        String cidadeLoja = leitor.nextLine();
        
        System.out.println("Informe o estado da loja:");
        String estadoLoja = leitor.nextLine();
        
        System.out.println("Informe o horario de inicio do atendimento da loja:");
        String hoararioInicioLoja = leitor.nextLine();
        
        System.out.println("Informe o horario de fim do atendimento da loja:");
        String hoararioFimLoja = leitor.nextLine();       
        LojaModel l = new LojaModel();
        
        System.out.println("Informe o CNPJ da loja:");
        String cnpjLoja = leitor.nextLine();
        
        
        l.setNome(nomeLoja);
        l.setEndereco(enderecoLoja);
        l.setNumero(numeroLoja);
        l.setCep(cepLoja);
        l.setComplemento(complementoLoja);
        l.setBairro(bairroLoja);
        l.setCidade(cidadeLoja);
        l.setEstado(estadoLoja);
        l.setHorarioInicio(hoararioInicioLoja);
        l.setHorarioFim(hoararioFimLoja);
        l.setCnpj(cnpjLoja);
        
        BancoDeDadosLocadora.getTabelaLoja().add(l);
       
       
    }
    
}
