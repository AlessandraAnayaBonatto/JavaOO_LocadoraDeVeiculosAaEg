/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo_locadoradeveiculosaaeg.git.bancoDeDados;

import java.util.ArrayList;
import java.util.List;
import javaoo_locadoradeveiculosaaeg.git.models.CarroModel;
import javaoo_locadoradeveiculosaaeg.git.models.CartaoDeCreditoModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaFisicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaJuridicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.LojaModel;

/**
 Classe criada para armazenamento das informações inseridas no sistema
 */
public class BancoDeDadosLocadora {
    // Listas para armazenamentos de novos cliente pessoa fisica ou juridica.
    private static List<ClientePessoaFisicaModel> tabelaClientesPessoaFisica;
    private static List<ClientePessoaJuridicaModel> tabelaClientePessoaJuridica;
    
    // Listas para armazenamentos de novos cartões crédito
    private static List<CartaoDeCreditoModel> tabelaCartaoDeCredito;
    
    // Listas para armazenamentos de novos carros
    private static List<CarroModel> tabelaCarro;
    
    // Listas para armazenamentos de novas lojas
    private static List<LojaModel> tabelaLoja;
    
    public static List<ClientePessoaFisicaModel> getTabelaClientesPessoaFisica() {
        return tabelaClientesPessoaFisica;
    }

    public static List<ClientePessoaJuridicaModel> getTabelaClientePessoaJuridica() {
        return tabelaClientePessoaJuridica;
    }
    
    public static List<CartaoDeCreditoModel> getTabelaCartaoDeCredito() {
        return tabelaCartaoDeCredito;
    }

    public static List<CarroModel> getTabelaCarro() {
        return tabelaCarro;
    }

    public static List<LojaModel> getTabelaLoja() {
        return tabelaLoja;
    }
    
    public static void iniciarBancoDeDados (){
        tabelaClientesPessoaFisica = new ArrayList<ClientePessoaFisicaModel>();
        tabelaClientePessoaJuridica = new ArrayList<ClientePessoaJuridicaModel>();
        tabelaCartaoDeCredito = new  ArrayList<CartaoDeCreditoModel>();
        tabelaCarro = new ArrayList<CarroModel>();
        tabelaLoja = new ArrayList<LojaModel>();
    }
}
