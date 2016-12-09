/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.CarroController.PesquisarCarroPorCodigo;
import static controller.LojaController.PesquisarLojaPorCnpj;
import static controller.PessoaFisicaController.PesquisarPessoaPorCpf;
import models.CarroModel;
import models.CartaoDeCreditoModel;
import models.ClientePessoaFisicaModel;
import models.LojaModel;

import java.util.Scanner;
import models.PfLocacaoModel;

/**
 *
 * @author aless
 */
public class LocacaoController {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void LocacaoPJ()
    {
        
        
        
        
    }
    
    public static void LocacaoPF()
    {
        System.out.println("Informe o CPF:");
        String codCpf = leitor.nextLine();
        
        ClientePessoaFisicaModel c = PesquisarPessoaPorCpf(codCpf);
        
        
        if (c != null)
        {
            System.out.println("CPF encontrado:");
            System.out.println("Dados CPF:");
       
            System.out.println("CPF:" + c.getCpf());
            System.out.println("");

            System.out.println("Informe o código do carro ");
            int CodCarro = leitor.nextInt();
            leitor.nextLine();
            
            CarroModel cr  = PesquisarCarroPorCodigo(CodCarro);
            
            if(cr != null)
            {    
                System.out.println("CARRO:" + cr.getCodigo());
                System.out.println("");
                
                System.out.println("Informe o CNPJ da loja");
                String cnpjLoja = leitor.nextLine();
                
                LojaModel l = PesquisarLojaPorCnpj(cnpjLoja);
                
                if (l != null)
                {
                    System.out.println("LOJA:" + l.getCnpj());
                    System.out.println("");
                    
                    System.out.println("Informe o Número do Cartão");
                    String numeroCartao = leitor.nextLine();
                                        
                    CartaoDeCreditoModel cc = CartaoDeCreditoController.PesquisarCartaoPorNumero(numeroCartao);
                    
                    if(cc != null)
                    {
                        System.out.println("CARTÃO:" + cc.getNumeroCartao());
                        System.out.println("");
                        
                        PfLocacaoModel pf = new PfLocacaoModel();
                        
                        
                
                    }else
                    {
                       System.out.println("Cartão não encontrado, Por favor verifique se o cartão está cadastrado!!");
                    }
                
                }
                else
                {
                    System.out.println("Loja não encontrada, Por favor verifique se a loja está cadastrada!!");
                }
                
            }
            else
            {
                System.out.println("Carro não encontrado, Por favor verifique se o carro está cadastrado!!");
            }
             
        }else
        {
            System.out.println("CPF não encontrado, Por favor verifique se o CPF está cadastrado!!");
        }
        
        
        
    }

 
    
}
