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

    
}
