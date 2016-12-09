/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bancoDeDados.BancoDeDadosLocadora;
import static controller.CarroController.PesquisarCarroPorCodigo;
import static controller.LojaController.PesquisarLojaPorCnpj;
import static controller.PessoaFisicaController.PesquisarPessoaPorCpf;
import static controller.PessoaJuricaController.PesquisarPessoaPorCnpj;
import models.CarroModel;
import models.CartaoDeCreditoModel;
import models.ClientePessoaFisicaModel;
import models.LojaModel;
import models.PfLocacaoModel;
import models.PjLocacaoModel;
import java.util.Scanner;
import models.ClientePessoaJuridicaModel;
import models.LocacaoModel;
import models.PfLocacaoModel;
import models.PjLocacaoModel;

/**
 *
 * @author aless
 */
public class LocacaoController {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void TipoLocacao(){
        System.out.println("");
        System.out.println("Efetuar Locação");
        System.out.println("");
        System.out.print("Informe o tipo de Locação (PF para Pessoa Fisica ou PJ para Pessoa juridica): ");
        String tipo = leitor.nextLine();
        
        if(tipo.equalsIgnoreCase("pf")){
            LocacaoPF();
        }else if(tipo.equalsIgnoreCase("pj")){
            LocacaoPJ();
        }else{
            System.out.println("");
            System.out.println("Tipo invalido.");
            System.out.println("");
        }
    }
    
    
    
    public static void LocacaoPJ()
    {
        System.out.println("Informe o CNPJ:");
        String codCnpj = leitor.nextLine();
        
        ClientePessoaJuridicaModel j = PesquisarPessoaPorCnpj(codCnpj);
        
        if(j != null)
        {
            System.out.println("CNPJ:" + j.getCnpj());
            System.out.println("");
            
            
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
                        
                        PjLocacaoModel pj = new PjLocacaoModel();
                        
                        pj.setClientePj(j);
                        pj.setClietePF(c);
                        pj.setCarro(cr);
                        pj.setLoja(l);
                        pj.setCartao(cc);
                        
                        BancoDeDadosLocadora.getTabelaLocacaoPessoaJuridica().add(pj);
                        System.out.println(pj.AlugaParaCnpj());
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
        }else
        {
            System.out.println("CNPJ não encontrado, Por favor verifique se está cadastrado no sistema!!");
        }
        
        
        
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
                        
                        pf.setClietePF(c);
                        pf.setCarro(cr);
                        pf.setLoja(l);
                        pf.setCartao(cc);
                        
                        BancoDeDadosLocadora.getTabelaLocacaoPessoaFisica().add(pf);
                        
                        System.out.println(pf.AlugaParaCpf());
                
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

    public static ClientePessoaFisicaModel PesquisarLocacaoPorCpf ( String codCpf ) 
    {
        for(PfLocacaoModel lpf : BancoDeDadosLocadora.getTabelaLocacaoPessoaFisica())
        {
            if(lpf.getClietePF().getCpf().equalsIgnoreCase(codCpf))
            {
                return lpf.getClietePF();
            }      
        }
        
        for(PjLocacaoModel lpj : BancoDeDadosLocadora.getTabelaLocacaoPessoaJuridica())
        {
            if(lpj.getClietePF().getCpf().equalsIgnoreCase(codCpf))
            {
                return lpj.getClietePF();
            }      
        }
        return null;
    }
  
    public void AlterarLocacao()
    {
        System.out.println("Informe o Cpf da locação que deseja alterar");
        String codCpf = leitor.next();        
        
        ClientePessoaFisicaModel cpf = PesquisarLocacaoPorCpf(codCpf);
        
        //Verificação de locação PJ ou Pf
        String tipo = null;
        
        PfLocacaoModel antcpf = null;
        
        PjLocacaoModel antcnpj = null;
        
        if(cpf != null )
        {
            for (PfLocacaoModel lpf : BancoDeDadosLocadora.getTabelaLocacaoPessoaFisica())
            {
                if(lpf.getClietePF().getCpf().equalsIgnoreCase(codCpf))
                {
                    tipo = "PF";    
                    antcpf = lpf;
                }
            }
            
            for (PjLocacaoModel lpj : BancoDeDadosLocadora.getTabelaLocacaoPessoaJuridica())
            {
                if(lpj.getClietePF().getCpf().equalsIgnoreCase(codCpf))
                {
                    tipo = "PJ";    
                    antcnpj = lpj;
                }
            }
        }
    
        
        if(cpf != null && tipo.equalsIgnoreCase("PF") )
        {
            
            System.out.println("Digite o código do novo Cpf, (Anterior: " + antcpf.getClietePF().getCpf() + "): ");
            String novoCpf = leitor.nextLine();
            
            ClientePessoaFisicaModel ncpf = PesquisarPessoaPorCpf(novoCpf);
            
            if(ncpf != null)           
            {
                            
                System.out.println("Digite o código do novo Carro, (Anterior: " + antcpf.getCarro().getCodigo() + "): ");
                int novoCarro = leitor.nextInt();
                leitor.nextLine();           

                CarroModel cr  = PesquisarCarroPorCodigo(novoCarro);    

                if(cr != null)
                {
                    System.out.println("Digite o novo cpf para loja, (Anterior: " + antcpf.getLoja().getCnpj() + "): ");
                    String cpfLoja = leitor.nextLine();

                    LojaModel lj = PesquisarLojaPorCnpj(cpfLoja);

                    if (lj != null)
                    {
                        System.out.println("Informe o novo número do Cartão, (Anterior: " + antcpf.getCartao().getNumeroCartao() + "):");
                        String numeroCartao = leitor.nextLine();

                        CartaoDeCreditoModel cc = CartaoDeCreditoController.PesquisarCartaoPorNumero(numeroCartao);

                        if (cc != null)
                        {
                            antcpf.setClietePF(cpf);
                            antcpf.setCarro(cr);
                            antcpf.setLoja(lj);
                            antcpf.setCartao(cc);                        
                            
                            System.out.println("Locação alterada com Sucesso!"); 
                        }

                    }

                }
                   
            }
        }else           
        {
            System.out.println("Digite o código do novo Cnpj, (Anterior: " + antcnpj.getClientePj().getCnpj() + "): ");
            String novoCnpj = leitor.nextLine();

                ClientePessoaJuridicaModel ncnpj = PesquisarPessoaPorCnpj(novoCnpj);
            
            if(ncnpj != null)
            {    
                System.out.println("Digite o código do novo Cpf, (Anterior: " + antcnpj.getClietePF().getCpf() + "): ");
                String novoCpf = leitor.nextLine();

                ClientePessoaFisicaModel ncpf = PesquisarPessoaPorCpf(novoCpf);

                if(ncpf != null)           
                {

                    System.out.println("Digite o código do novo Carro, (Anterior: " + antcnpj.getCarro().getCodigo() + "): ");
                    int novoCarro = leitor.nextInt();
                    leitor.nextLine();           

                    CarroModel cr  = PesquisarCarroPorCodigo(novoCarro);    

                    if(cr != null)
                    {
                        System.out.println("Digite o novo cnpj para loja, (Anterior: " + antcnpj.getLoja().getCnpj() + "): ");
                        String cnpjLoja = leitor.nextLine();

                        LojaModel lj = PesquisarLojaPorCnpj(cnpjLoja);

                        if (lj != null)
                        {
                            System.out.println("Informe o novo número do Cartão, (Anterior: " + antcnpj.getCartao().getNumeroCartao() + "):");
                            String numeroCartao = leitor.nextLine();

                            CartaoDeCreditoModel cc = CartaoDeCreditoController.PesquisarCartaoPorNumero(numeroCartao);

                            if (cc != null)
                            {
                                antcnpj.setClietePF(cpf);
                                antcnpj.setCarro(cr);
                                antcnpj.setLoja(lj);
                                antcnpj.setCartao(cc);                        

                                System.out.println("Locação alterada com Sucesso!"); 
                            }

                        }

                    }

                }
            }
            
        }
    }
}

