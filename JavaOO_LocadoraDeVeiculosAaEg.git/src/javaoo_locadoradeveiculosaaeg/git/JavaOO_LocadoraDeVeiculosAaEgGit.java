/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo_locadoradeveiculosaaeg.git;

import java.util.ArrayList;
import java.util.List;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaFisicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaJuridicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.PessoaFisica;
import javaoo_locadoradeveiculosaaeg.git.models.PessoaJuridica;

/**
 Classe criada para armazenamento das informações inseridas no sistema
 */
public class JavaOO_LocadoraDeVeiculosAaEgGit {
    
    // Listas para armazenamentos de nosvos cliente pessoa fisica ou juridica.
    private static List<ClientePessoaFisicaModel> tabelaClientesPessoaFisica;
    private static List<ClientePessoaJuridicaModel> tabelaClientePessoaJuridica;
    
    public static List<ClientePessoaFisicaModel> getTabelaClientesPessoaFisica() {
        return tabelaClientesPessoaFisica;
    }

    public static List<ClientePessoaJuridicaModel> getTabelaClientePessoaJuridica() {
        return tabelaClientePessoaJuridica;
    }
    
    public static void iniciarBancoDeDados (){
        tabelaClientesPessoaFisica = new ArrayList<ClientePessoaFisicaModel>();
        tabelaClientePessoaJuridica = new ArrayList<ClientePessoaJuridicaModel>();
    }
}
