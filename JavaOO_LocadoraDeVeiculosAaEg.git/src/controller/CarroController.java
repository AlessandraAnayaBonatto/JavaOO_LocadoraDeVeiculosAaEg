/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import javaoo_locadoradeveiculosaaeg.git.JavaOO_LocadoraDeVeiculosAaEgGit;
import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.CarroModel;

/**
 *
 * @author eduar
 */
public class CarroController {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void CadastrarCarro() 
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
        
        
        BancoDeDadosLocadora.getTabelaCarro().add(c);
              
    }

    
    private static CarroModel PesquisarCarroPorCodigo(int codCarro)
    {
        
        for(CarroModel c : BancoDeDadosLocadora.getTabelaCarro())
        {
            if(c.getCodigo() == codCarro)
            {
                return c;
            }      
        }             
        return null;
    }
    
    
    
    private static void AlterarCarro() 
    {
       System.out.println("Digite o código do carro que você deseja alterar:");
       int codCarro = leitor.nextInt();
       leitor.nextLine(); 
       
        CarroModel c = PesquisarCarroPorCodigo(codCarro);
        
       
        if (c != null)
        {
            System.out.println("Digite o novo Código para o carro, (Anterior: " + c.getCodigo() + "): ");
            int novoCodigo = leitor.nextInt();
            leitor.nextLine(); 
            
                c.setCodigo(novoCodigo);
            
            System.out.println("Informe o novo modelo para carro, (Anterior: " + c.getModelo() + "): ");
            String novoModeloCarro = leitor.nextLine();  
            
                c.setModelo(novoModeloCarro);
            
            
            System.out.println("Informe o nova marca para carro, (Anterior: " + c.getMarca() + "): ");
            String novaMarcaCarro = leitor.nextLine(); 
            
                c.setMarca(novoModeloCarro);
        
            System.out.println("Informe o novo ano para o carro, (Anterior: " + c.getAno() + "): ");
            int novoAnoCarro = leitor.nextInt(); 
            leitor.nextLine();
            
                c.setAno(novoAnoCarro);
            
            
            System.out.println("Informe o nova categoria para o carro, (Anterior: " + c.getCategoria () + "): ");
            String novaCategoriaCarro = leitor.nextLine(); 
            
                c.setCategoria(novaCategoriaCarro);

            System.out.println("Informe a nova quantidade de portas para o carro, (Anterior: " + c.getQuantPortas () + "): ");
            int novaQuantPortasCarro = leitor.nextInt(); 
            leitor.nextLine();
            
                c.setQuantPortas(novaQuantPortasCarro);

            System.out.println("Informe a quantidade de pessoas do carro, (Anterior: " + c.getQuantPessoas () + "): ");
            int novaQuantPessoasCarro = leitor.nextInt(); 
            leitor.nextLine();
            
                c.setQuantPessoas(novaQuantPessoasCarro);
            

            System.out.println("Informe a quantidade de malas do carro, (Anterior: " + c.getQuantMalas () + "): ");
            int novaQuantMalasCarro = leitor.nextInt(); 
            leitor.nextLine();
            
                c.setQuantMalas(novaQuantMalasCarro);            

            System.out.println("Informe se tem ar no carro (sendo S para sim e N para não), (Anterior: " + c.isAr () + "): ");
            boolean novoArCarro = leitor.nextBoolean();             
            
                c.setAr(novoArCarro);
            
            System.out.println("Informe se tem ou não direção hidraulica: (sendo S para sim e N para não), (Anterior: " + c.isDirecaoHidraulica () + "):");
            boolean novaDirecaoCarro = leitor.nextBoolean();            
            
                c.setDirecaoHidraulica(novaDirecaoCarro);          
            
            System.out.println("Informe se tem ou não Vidro eletrico: (sendo S para sim e N para não), (Anterior: " + c.isVidroEletrico () + "):");
            boolean novoVidroCarro = leitor.nextBoolean();
            
                c.setVidroEletrico(novoVidroCarro);                   
            
            
            System.out.println("Informe se tem ou não Trava eletrica: (sendo S para sim e N para não), (Anterior: " + c.isTravaEletrica () + "):");
            boolean novoTravaCarro = leitor.nextBoolean();
            
            
                c.setTravaEletrica(novoTravaCarro);
            

            System.out.println("Informe se tem ou não Airbag: (sendo S para sim e N para não),(Anterior: " + c.isAirBag () + "):");
            boolean novoAirbagCarro = leitor.nextBoolean();
            
            
                c.setAirBag(novoAirbagCarro);
              
                        
            System.out.println("Informe se tem ou não freios abs: (sendo S para sim e N para não), (Anterior: " + c.isAbs () + "):");
            boolean novoAbsCarro = leitor.nextBoolean();
            
            
                c.setAbs(novoAbsCarro);
                
                
            System.out.println("Informe se tem ou não blindagem: (sendo S para sim e N para não), (Anterior: " + c.isBlindagem() + "):");
            boolean novaBlindagemCarro = leitor.nextBoolean();

                c.setBlindagem(novaBlindagemCarro);
            
            System.out.println("Informe se tem ou não couro: (sendo S para sim e N para não) ,(Anterior: " + c.isCouro() +  "):");
            boolean novoCouroCarro = leitor.nextBoolean();
            
            
                c.setCouro(novoCouroCarro);

            System.out.println("Informe se tem ou não limpeza: (sendo S para sim e N para não), (Anterior: " + c.isLimpeza() + "):");
            boolean novaLimpezaCarro = leitor.nextBoolean();
            
                c.setLimpeza(novaLimpezaCarro);

               
            System.out.println("Informe a potência do motor: , (Anterior: " + c.getPotenciaMotor() + "):");
            String novaPotenciaMotorCarro = leitor.nextLine(); 
            
                c.setPotenciaMotor(novaPotenciaMotorCarro);

            System.out.println("Informe o tipo de combustivel: ,(Anterior: " + c.getTipoCombustivel() + "):");
            String novoCombustivelCarro = leitor.nextLine(); 
            
                c.setTipoCombustivel(novoCombustivelCarro);

            System.out.println("Informe o tipo de cambio: , (Anterior: " + c.getTipoCambio() + "):");
            String novoCambioCarro = leitor.nextLine(); 
            
                c.setTipoCambio(novoCambioCarro);

            System.out.println("Informe qual nivel está o tanque: ,(Anterior: " + c.getNivelTanque() + "):");
            String novoTanqueCarro = leitor.nextLine(); 
            
                c.setNivelTanque(novoTanqueCarro);

            System.out.println("Informe o tipo de locação: , (Anterior: " + c.getTipoLocacao() + "):");
            String novoTipoLocacaoCarro = leitor.nextLine(); 
            
                c.setTipoLocacao(novoTipoLocacaoCarro);

            System.out.println("Informe a quilometragem: , (Anterior: " + c.getQuilometragem() + "):");
            int novaQuilometragemCarro = leitor.nextInt(); 
            leitor.nextLine(); 
            
                c.setQuilometragem(novaQuilometragemCarro);

            System.out.println("Informe o valor: , (Anterior: " + c.getValores() + "):");
            float novoValorCarro = leitor.nextFloat(); 
            leitor.nextLine();
            
                c.setValores(novoValorCarro);

            System.out.println("Informe as taxas: , (Anterior: " + c.getTaxas() + "):");
            float novaTaxasCarro = leitor.nextFloat(); 
            leitor.nextLine();
            
                c.setTaxas(novaTaxasCarro);          
            
            
            System.out.println("Carro alterado com Sucesso!");
            
        }else
        {
            System.out.println("Carro não cadastrado!");
        }       
                
    }
    
    
}
