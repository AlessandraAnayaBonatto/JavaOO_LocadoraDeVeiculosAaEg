/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoo_locadoradeveiculosaaeg.git;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javaoo_locadoradeveiculosaaeg.git.models.CarroModel;
import javaoo_locadoradeveiculosaaeg.git.models.CartaoDeCreditoModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaFisicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaJuridicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.LojaModel;

/**
 *
 * @author eduar
 */
public class JavaOO_LocadoraDeVeiculosAaEgGit {
    
    private static Scanner leitor = new Scanner(System.in);

    private static List<CarroModel> carros;
    
    private static List<ClientePessoaFisicaModel> pessoasFisicas;
    
    private static List<ClientePessoaJuridicaModel> pessoasJuridicas;
    
    private static List<LojaModel> lojas;
    
    private static List<CartaoDeCreditoModel> cartoes;
    
 
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        
        
    carros = new ArrayList<CarroModel>();    
    pessoasFisicas = new ArrayList<ClientePessoaFisicaModel>();    
    pessoasJuridicas = new ArrayList<ClientePessoaJuridicaModel>();
    lojas = new ArrayList<LojaModel>();
    cartoes = new ArrayList<CartaoDeCreditoModel>();
    
        
    int opcao  = 0 ;        
   
        do
        {
            opcao = Opcoes();
            
            switch (opcao)
            {
                case 1:
                    CadastrarCarro();
                    break;   
                case 2:
                    CadastrarPessoaFisica();
                    break;
                case 3:
                    CadastrarPessoaJuridica();
                    break;
                case 4:
                    CadastrarLoja();
                    break;
                case 5:
                    CadastrarCartadeCredito();
                    break;
                case 6 :
                    AlterarCarro();
                    break;
                case 7 :
                    AlterarPessoaFisica();
                    break;
                case 8:
                    AlterarPessoaJuridica();
                    break;
                case 9:
                    AlterarLoja();
                    break;
                case 10:
                    AlterarCartaoCredito();
                    break;
                case 11:
                    ExluirCarro();
                    break;
                case 12:
                    ExcluirPessoaFisica();
                    break;
                case 13:
                    ExcluirPessoaJuridica();
                    break;
                case 14:
                    ExcluirLoja();
                    break;
                case 15:
                    EcluirCartaoCredito();
                    break;
                case 16:
                    VisualizarListaCarros();
                    break;
                case 17:
                    VisualizarListaPessoaFisica();
                    break;
                case 18:
                    VisualizarListaPessoaJuridica();
                    break;
                case 19:
                    VisualizarListaLojas();
                    break;
                case 20:
                    VisualizarListaCartaoCredito();
                    break;
                case 21:
                    break;
                }
      
            }while (opcao != 22);
            
    } 
    
    //Opções para o usuário
    private static int Opcoes()
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
        
        return opcao;
    }

  

    private static CarroModel CadastrarCarro() 
    {
        
        System.out.println("Informe o código do carro:");
        int codCarro = leitor.nextInt();     
        leitor.nextLine();   
             
        System.out.println("Informe o modelo:");
        String modeloCarro = leitor.nextLine();    
        
        System.out.println("Informe a marca:");
        String marcaCarro = leitor.nextLine(); 
        
        System.out.println("Informe o ano:");
        int anoCarro = leitor.nextInt(); 
        leitor.nextLine();
      
        System.out.println("Informe a categoria:");
        String categoriaCarro = leitor.nextLine(); 
    
        System.out.println("Informe a quantidade de portas:");
        int quantPortasCarro = leitor.nextInt(); 
        leitor.nextLine();
        
        System.out.println("Informe a quantidade de pessoas:");
        int quantPessoasCarro = leitor.nextInt(); 
        leitor.nextLine();
   
        System.out.println("Informe a quantidade de malas:");
        int quantMalasCarro = leitor.nextInt(); 
        leitor.nextLine();
        
        System.out.println("Informe se tem ou não Ar: (sendo S para sim e N para não)");
        boolean arCarro = leitor.nextBoolean(); 
        
        System.out.println("Informe se tem ou não direção hidraulica: (sendo S para sim e N para não)");
        boolean direcaoCarro = leitor.nextBoolean();
        
        System.out.println("Informe se tem ou não Vidro eletrico: (sendo S para sim e N para não)");
        boolean vidroCarro = leitor.nextBoolean();
    
        System.out.println("Informe se tem ou não Trava eletrica: (sendo S para sim e N para não)");
        boolean travaCarro = leitor.nextBoolean();
   
        System.out.println("Informe se tem ou não Airbag: (sendo S para sim e N para não)");
        boolean airbagCarro = leitor.nextBoolean();
    
        System.out.println("Informe se tem ou não freios abs: (sendo S para sim e N para não)");
        boolean absCarro = leitor.nextBoolean();
        
        System.out.println("Informe se tem ou não blindagem: (sendo S para sim e N para não)");
        boolean blindagemCarro = leitor.nextBoolean();
        
        System.out.println("Informe se tem ou não couro: (sendo S para sim e N para não)");
        boolean couroCarro = leitor.nextBoolean();
  
        System.out.println("Informe se tem ou não limpeza: (sendo S para sim e N para não)");
        boolean limpezaCarro = leitor.nextBoolean();
        
        System.out.println("Informe a potência do motor:");
        String potenciaMotorCarro = leitor.nextLine(); 

        System.out.println("Informe o tipo de combustivel:");
        String combustivelCarro = leitor.nextLine(); 
        
        System.out.println("Informe o tipo de cambio:");
        String cambioCarro = leitor.nextLine(); 
   
        System.out.println("Informe qual nivel está o tanque:");
        String tanqueCarro = leitor.nextLine(); 
        
        System.out.println("Informe o tipo de locação:");
        String tipoLocacaoCarro = leitor.nextLine();         
         
        System.out.println("Informe a quilometragem:");
        int quilometragemCarro = leitor.nextInt(); 
        leitor.nextLine(); 
         
        System.out.println("Informe o valor:");
        float valorCarro = leitor.nextFloat(); 
        leitor.nextLine();
        
        System.out.println("Informe as taxas:");
        float taxasCarro = leitor.nextFloat(); 
        leitor.nextLine();
    
        
        CarroModel c = new CarroModel();
        
        c.setCodigo(codCarro);
        c.setModelo(modeloCarro);
        c.setMarca(marcaCarro);
        c.setAno(anoCarro);
        c.setCategoria(categoriaCarro);
        c.setQuantPortas(quantPortasCarro);
        c.setQuantPessoas(quantPessoasCarro);
        c.setQuantMalas(quantMalasCarro);
        c.setAr(arCarro);
        c.setDirecaoHidraulica(direcaoCarro);
        c.setVidroEletrico(vidroCarro);
        c.setTravaEletrica(travaCarro);
        c.setAirBag(airbagCarro);
        c.setAbs(absCarro);
        c.setBlindagem(blindagemCarro);
        c.setCouro(couroCarro);
        c.setLimpeza(limpezaCarro);
        c.setPotenciaMotor(potenciaMotorCarro);
        c.setTipoCombustivel(combustivelCarro);
        c.setTipoCambio(cambioCarro);
        c.setNivelTanque(tanqueCarro);
        c.setTipoLocacao(tipoLocacaoCarro);
        c.setQuilometragem(quilometragemCarro);
        c.setValores(valorCarro);
        c.setTaxas(taxasCarro);
        
        
        JavaOO_LocadoraDeVeiculosAaEgGit.carros.add(c);
       
        return c;  

    }

    private static ClientePessoaFisicaModel CadastrarPessoaFisica() 
    {        
        System.out.println("Informe o nome:");
        String nomePessoaFisica = leitor.nextLine(); 
        
        System.out.println("Informe o telefone:");
        int telefonePessoaFisica = leitor.nextInt();
        leitor.nextInt();
        
        System.out.println("Informe o CPF:");
        String cpfPessoaFisica = leitor.nextLine(); 
        
        System.out.println("Informe o Endereço:");
        
        System.out.println("Informe o nome da rua:");
        String enderecoPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o numero da casa:");
        String numeroCasaPessoaFisica = leitor.nextLine();
               
        System.out.println("Informe o Cep da rua:");
        int cepPessoaFisica = leitor.nextInt();
        leitor.nextInt();
        
        System.out.println("Informe algum complemento:");
        String complementoPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o bairro:");
        String bairroPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe a cidade:");
        String cidadePessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o estado:");
        String estadoPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe dados da CNH:");
      
        System.out.println("Informe a categoria da CNH:");
        String categoriaCnhPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o tempo da CNH:");
        String tempoCnhPessoaFisica = leitor.nextLine();
        
        System.out.println("Informe o estado emissor da CNH:");
        String estadoEmissorCnhPessoaFisica = leitor.nextLine();

        System.out.println("Informe o numero da CNH:");
        String numeroCnhPessoaFisica = leitor.nextLine();
   
        System.out.println("Informe o registro da CNH:");
        String registroCnhPessoaFisica = leitor.nextLine();
   
        ClientePessoaFisicaModel p = new ClientePessoaFisicaModel();
        
        p.setNome(nomePessoaFisica);
        p.setTelefone(telefonePessoaFisica);
        p.setCpf(cpfPessoaFisica);
        p.setEndereco(enderecoPessoaFisica);
        p.setNumero(numeroCasaPessoaFisica);
        p.setCep(cepPessoaFisica);
        p.setComplemento(complementoPessoaFisica);
        p.setBairro(bairroPessoaFisica);
        p.setCidade(cidadePessoaFisica);
        p.setEstado(estadoPessoaFisica);
        p.setCategoria(categoriaCnhPessoaFisica);
        p.setTempo(tempoCnhPessoaFisica);
        p.setEstadoEmissor(estadoEmissorCnhPessoaFisica);
        p.setNumeroCnh(numeroCnhPessoaFisica);
        p.setRegistroCnh(registroCnhPessoaFisica);
    
        JavaOO_LocadoraDeVeiculosAaEgGit.pessoasFisicas.add(p);
       
        return p;  
        
       
    }

    private static ClientePessoaJuridicaModel CadastrarPessoaJuridica() 
    {
        
        System.out.println("Informe o nome:");
        String nomePessoaJuridica = leitor.nextLine(); 
        
        System.out.println("Informe o telefone:");
        int telefonePessoaJuridica = leitor.nextInt();
        leitor.nextInt();  
                
        System.out.println("Informe o Endereço da empresa:");
        
        System.out.println("Informe o nome da rua da empresa:");
        String enderecoPessoaJuridica = leitor.nextLine();
        
        System.out.println("Informe o numero da empresa:");
        String numeroCasaPessoaJuridica = leitor.nextLine();
               
        System.out.println("Informe o Cep da rua da empresa:");
        int cepPessoaJuridica = leitor.nextInt();
        leitor.nextInt();
        
        System.out.println("Informe algum complemento:");
        String complementoPessoaJuridica = leitor.nextLine();
        
        System.out.println("Informe o bairro da empresa:");
        String bairroPessoaJuridica = leitor.nextLine();
        
        System.out.println("Informe a cidade da empresa:");
        String cidadePessoaJuridica = leitor.nextLine();
        
        System.out.println("Informe o estado da empresa:");
        String estadoPessoaJuridica = leitor.nextLine();
        
        
        System.out.println("Informe o CNPJ:");
        String cnpjPessoaJuridica = leitor.nextLine();
        
        ClientePessoaJuridicaModel  p = new ClientePessoaJuridicaModel();
        
        
        p.setNome(nomePessoaJuridica);
        p.setTelefone(telefonePessoaJuridica);
        p.setEndereco(enderecoPessoaJuridica);
        p.setNumero(numeroCasaPessoaJuridica);
        p.setCep(cepPessoaJuridica);
        p.setComplemento(complementoPessoaJuridica);
        p.setBairro(bairroPessoaJuridica);
        p.setCidade(cidadePessoaJuridica);
        p.setEstado(cnpjPessoaJuridica);     
        p.setCnpj(cnpjPessoaJuridica);
        
        
        JavaOO_LocadoraDeVeiculosAaEgGit.pessoasJuridicas.add(p);
       
        return p;  
        
     }

    private static LojaModel CadastrarLoja() 
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
        
        JavaOO_LocadoraDeVeiculosAaEgGit.lojas.add(l);
       
        return l; 
        
    }

    private static CartaoDeCreditoModel CadastrarCartadeCredito() 
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
        
        JavaOO_LocadoraDeVeiculosAaEgGit.cartoes.add(c);
       
        return c;
        
    }

    private static void AlterarCarro()
    {
        
    }

    private static void AlterarPessoaFisica()
    {
      
    }

    private static void AlterarPessoaJuridica() 
    {
        
    }

    private static void AlterarLoja() 
    {
       
    }

    private static void AlterarCartaoCredito()
    {
        
    }

    private static void ExluirCarro() 
    {
        
    }

    private static void ExcluirPessoaFisica()
    {
        
    }

    private static void ExcluirPessoaJuridica() 
    {
       
    }

    private static void ExcluirLoja()
    {
        
    }

    private static void EcluirCartaoCredito()
    {
        
    }

    private static void VisualizarListaCarros()
    {
       
    }

    private static void VisualizarListaPessoaFisica() 
    {
       
    }

    private static void VisualizarListaLojas() 
    {
       
    }

    private static void VisualizarListaPessoaJuridica()
    {
        
    }

    private static void VisualizarListaCartaoCredito() 
    {
        
    }
    

}
