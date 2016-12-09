/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeDados;

import java.util.ArrayList;
import java.util.List;
import models.CarroModel;
import models.CartaoDeCreditoModel;
import models.ClientePessoaFisicaModel;
import models.ClientePessoaJuridicaModel;
import models.LojaModel;
import models.PfLocacaoModel;
import models.PjLocacaoModel;

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
    
    // Listas para armazenamentos de novas locações pessoa fisica ou juridica.
    private static List<PfLocacaoModel> tabelaLocacaoPessoaFisica;
    private static List<PjLocacaoModel> tabelaLocacaoPessoaJuridica;
    
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
    
    public static List<PfLocacaoModel> getTabelaLocacaoPessoaFisica() {
        return tabelaLocacaoPessoaFisica;
    }

    public static List<PjLocacaoModel> getTabelaLocacaoPessoaJuridica() {
        return tabelaLocacaoPessoaJuridica;
    }
    
    public static void iniciarBancoDeDados (){
        tabelaClientesPessoaFisica = new ArrayList<ClientePessoaFisicaModel>();
        tabelaClientePessoaJuridica = new ArrayList<ClientePessoaJuridicaModel>();
        tabelaCartaoDeCredito = new  ArrayList<CartaoDeCreditoModel>();
        tabelaCarro = new ArrayList<CarroModel>();
        tabelaLoja = new ArrayList<LojaModel>();
        tabelaLocacaoPessoaFisica = new ArrayList<PfLocacaoModel>();
        tabelaLocacaoPessoaJuridica = new ArrayList<PjLocacaoModel>();
                
    }
}
