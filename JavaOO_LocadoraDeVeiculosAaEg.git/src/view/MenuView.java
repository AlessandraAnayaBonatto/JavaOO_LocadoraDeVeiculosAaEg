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



/**
 *
 * @author 1614837
 */


public class MenuView {    
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void ExibirMenu()
    {
    System.out.println("--------------------LOCAÇÃO DE VEÍCULOS--------------------");
    System.out.println("******Essas são suas opcões******");
        
      
    System.out.println("1 - Cadastrar Carro");
    System.out.println("2 - Exibir lista de carros para locação");
    System.out.println("3 - Excluir carro cadastrado");
    System.out.println("4 - Alterar carro cadastrado");


    System.out.println("5 - Cadastrar Pessoa Fisica");
    System.out.println("6 - Exibir lista de pessoas fisicas");
    System.out.println("7 - Excluir pessoa fisica cadastrada");
    System.out.println("8 - Alterar pessoa fisica cadastrada");

    System.out.println("9 - Cadastrar Pessoa Juridica");
    System.out.println("10 - Exibir lista de pessoas juridicas");
    System.out.println("11 - Excluir pessoa juridica cadastrada");
    System.out.println("12 - Alterar pessoa juridica cadastrada");

    System.out.println("13 - Cadastrar Loja");
    System.out.println("14 - Exibir lista de lojas");
    System.out.println("15 - Excluir loja cadastrada");
    System.out.println("16 - Alterar loja cadastrada");

    System.out.println("17 - Cadastrar cartão de crédito");
    System.out.println("18 - Exibir lista de cartões cadastrados");
    System.out.println("19 - Excluir cartão cadastrado");
    System.out.println("20 - Alterar cartão cadastrado");


    System.out.println("21 - SAIR");        
    System.out.println("Digite sua Opção AQUI:");

    int opcao =  leitor.nextInt();
    leitor.nextLine();

   
        do
        {
            switch (opcao)
            {
                //Opções referentes a carro
                case 1:
                    CarroController.CadastrarCarro();
                    break;   
                case 2:
                    CarroView.ExibirCarros();
                    break;
                case 3 :
                    CarroController.AlterarCarro();
                    break;
                case 4:
                    CarroController.ExcluirCarro();
                    break;
                
                //Opções referentes a Cliente PF
                case 5:
                    PessoaFisicaController.CadastrarPessoaFisica();
                    break;
                case 6:
                    PessoaFisicaView.ExibirPessoaFisica();
                    break;    
                case 7 :
                    PessoaFisicaController.AlterarPessoaFisica();
                    break;    
                case 8:
                    PessoaFisicaController.ExcluirPessoaFisica();
                    break;
                    
                //Opções referentes a Cliente PJ    
                case 9:
                    PessoaJuricaController.CadastrarPessoaJuridica();
                    break;
                case 10:
                    PessoaJuridicaView.ExibirPessoaJuridica();
                    break;    
                case 11:
                    PessoaJuricaController.AlterarPessoaJuridica();
                    break;    
                case 12:
                    PessoaJuricaController.ExcluirPessoaJuridica();
                    break;    
                
                //Opções referentes a loja 
                case 13:
                    LojaController.CadastrarLoja();
                    break;
                case 14:
                    LojaView.ExibirLojasCadastradas();
                    break;    
                case 15:
                    LojaController.AlterarLoja();
                    break;    
                case 16:
                    LojaController.ExcluirLoja();
                    break;    
                
                //Opções referentes a cartão de crédito    
                case 17:
                    CartaoDeCreditoController.CadastrarCartadeCredito();
                    break;
                 case 18:
                    CartaoDeCreditoView.ExibirCartoesCadastrados();
                    break;
                case 19:
                    CartaoDeCreditoController.AlterarCartaoCredito();
                    break;
                case 20:
                    CartaoDeCreditoController.ExcluirCartao();
                    break;
                case 21:
                    break;
                }
            }while (opcao != 22);
    }
}

