/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PessoaFisicaController;
import controller.CartaoDeCreditoController;
import controller.PessoaJuricaController;
import controller.CarroController;
import controller.LojaController;
import java.util.Scanner;
import controller.LocacaoController;
import java.util.InputMismatchException;

/**
 *
 * @author 1614837
 */
public class MenuView {    
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void ExibirMenu()
    {
        int opcao = 0;
        
        do
        {
            System.out.println("--------------------LOCAÇÃO DE VEÍCULOS--------------------");
            System.out.println("******Essas são suas opcões******");


            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Exibir lista de carros para locação");
            System.out.println("3 - Exibir carro por Código");
            System.out.println("4 - Excluir carro cadastrado");
            System.out.println("5 - Alterar carro cadastrado");


            System.out.println("6 - Cadastrar Pessoa Fisica");
            System.out.println("7 - Exibir lista de pessoas fisicas");
            System.out.println("8 - Exibir pessoa fisica por CPF");
            System.out.println("9 - Excluir pessoa fisica cadastrada");
            System.out.println("10 - Alterar pessoa fisica cadastrada");

            System.out.println("11 - Cadastrar Pessoa Juridica");
            System.out.println("12 - Exibir lista de pessoas juridicas");
            System.out.println("13 - Exibir pessoa juridica por CNPJ");
            System.out.println("14 - Excluir pessoa juridica cadastrada");
            System.out.println("15 - Alterar pessoa juridica cadastrada");

            System.out.println("16 - Cadastrar Loja");
            System.out.println("17 - Exibir lista de lojas");
            System.out.println("18 - Exibir loja por CNPJ");
            System.out.println("19 - Excluir loja cadastrada");
            System.out.println("20 - Alterar loja cadastrada");

            System.out.println("21 - Cadastrar cartão de crédito");
            System.out.println("22 - Exibir lista de cartões cadastrados");
            System.out.println("22 - Exibir cartão por número");
            System.out.println("24 - Excluir cartão cadastrado");
            System.out.println("25 - Alterar cartão cadastrado");
            
            System.out.println("26 - Efetuar Locação");
            System.out.println("27 - Exibir Lista de Locações Pessoa Fisica");
            System.out.println("28 - Exibir Lista de Locações Pessoa Juridica");
            System.out.println("29 - Exibir locação por CPF ");
            System.out.println("30 - Alterar Locação");
            System.out.println("31 - Ecluir Locação");

            System.out.println("32 - SAIR");        
            System.out.print("Digite sua Opção AQUI: ");
        
        try{  
            opcao =  leitor.nextInt();
            leitor.nextLine();

            switch (opcao)
            {
                //Opções referentes a carro
                case 1:
                    CarroController.CadastrarCarro();
                    break;   
                case 2:
                    CarroView.ExibirCarros();
                    break;
                case 3:
                    CarroView.ExibirCarroPorCodigo();
                    break;    
                case 4 :
                    CarroController.AlterarCarro();
                    break;
                case 5:
                    CarroController.ExcluirCarro();
                    break;

                //Opções referentes a Cliente PF
                case 6:
                    PessoaFisicaController.CadastrarPessoaFisica();
                    break;
                case 7:
                    PessoaFisicaView.ExibirPessoaFisica();
                    break;
                case 8:
                    PessoaFisicaView.ExibirPessoaFisicaPorCPF();
                    break; 
                case 9 :
                    PessoaFisicaController.AlterarPessoaFisica();
                    break;    
                case 10:
                    PessoaFisicaController.ExcluirPessoaFisica();
                    break;

                //Opções referentes a Cliente PJ    
                case 11:
                    PessoaJuricaController.CadastrarPessoaJuridica();
                    break;
                case 12:
                    PessoaJuridicaView.ExibirPessoaJuridica();
                    break;
                case 13:
                    PessoaJuridicaView.ExibirPessoaJuridicaPorCnpj();
                    break;
                case 14:
                    PessoaJuricaController.AlterarPessoaJuridica();
                    break;    
                case 15:
                    PessoaJuricaController.ExcluirPessoaJuridica();
                    break;    

                //Opções referentes a loja 
                case 16:
                    LojaController.CadastrarLoja();
                    break;
                case 17:
                    LojaView.ExibirLojasCadastradas();
                    break;    
                case 18:
                    LojaView.ExibirLojaPorCnpj();
                    break; 
                case 19:
                    LojaController.AlterarLoja();
                    break;    
                case 20:
                    LojaController.ExcluirLoja();
                    break;    

                //Opções referentes a cartão de crédito    
                case 21:
                    CartaoDeCreditoController.CadastrarCartadeCredito();
                    break;
                case 22:
                    CartaoDeCreditoView.ExibirCartoesCadastrados();
                    break;
                case 23:
                    CartaoDeCreditoView.ExibirCartoesCadastradosPorNumero();
                    break;    
                case 24:
                    CartaoDeCreditoController.AlterarCartaoCredito();
                    break;
                case 25:
                    CartaoDeCreditoController.ExcluirCartao();
                    break;
                //Opções referentes a locação 
                case 26:
                    LocacaoController.TipoLocacao();
                break;
                case 27:
                    LocacaoView.ExibirLocacaoPessoaFisica();
                    break;
                case 28:
                    LocacaoView.ExibirLocacaoPessoaJuridica();
                    break;
                case 29:
                    LocacaoView.ExibirLocacaoPorCpf();
                    break;
                case 30:
                    LocacaoController.AlterarLocacao();
                    break;
                case 31:
                    LocacaoController.ExcluirLocacao();
                    break;
                case 32:
                    break;
                }
            opcao = 0; 
            
           }catch(InputMismatchException e1){
            System.out.println("");
            System.out.println("Você não inseriu um número, Este Menu suporta apenas números.");
            System.out.println("");
            leitor.nextLine();
            } 
        }while (opcao != 32);
        
    }
}

