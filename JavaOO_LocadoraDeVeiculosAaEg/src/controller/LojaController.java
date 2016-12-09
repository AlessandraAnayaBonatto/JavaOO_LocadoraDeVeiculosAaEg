/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import bancoDeDados.BancoDeDadosLocadora;
import models.LojaModel;

/**
 *
 * @author eduar
 */
public class LojaController {
    
    private static Scanner leitor = new Scanner(System.in);
    
    public static void CadastrarLoja() 
    {
         
        System.out.println("Informe o nome da loja:");
        String nomeLoja = leitor.nextLine();
        
        System.out.println("Informe o endereco da loja:");
        String enderecoLoja = leitor.nextLine();
        
        System.out.println("Informe o numero da loja:");
        int numeroLoja = leitor.nextInt();
               
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
        
        BancoDeDadosLocadora.getTabelaLoja().add(l);
       
       
    }
    
    public static LojaModel PesquisarPessoaPorCnpj (String codCnpj) 
    {
        
        for(LojaModel j : BancoDeDadosLocadora.getTabelaLoja())
        {
            if(j.getCnpj().equalsIgnoreCase(codCnpj))
            {
                return j;
            }      
        }             
        return null;
 
    }
    
    
    public static void AlterarLoja() 
    {
       System.out.println("Digite o nome da loja você deseja alterar:");
       String nomeLoja = leitor.nextLine();
      
        LojaModel l = new LojaModel ();
        
       
        if (l != null)
        {
            System.out.println("Digite o novo Código para o carro, (Anterior: " + l.getNome()+ "): ");
            String novoNome = leitor.nextLine();
                        
                l.setNome(novoNome);
            
            System.out.println("Informe o novo telefone para loja, (Anterior: " + l.getTelefone() + "): ");
            int novoTelefone = leitor.nextInt();  
            leitor.nextLine();
            
                l.setTelefone(novoTelefone);
                
            System.out.println("Informe dados do novo endereço!");
            
            
            System.out.println("Digite o novo endereço para loja, (Anterior: " + l.getEndereco()+ "): ");
            String novoEndereco = leitor.nextLine();
            
                l.setEndereco(novoEndereco);            
                
            System.out.println("Digite o novo número para loja, (Anterior: " + l.getNumero() + "): ");
            int novoNumero = leitor.nextInt();
            leitor.nextLine();
            
                l.setNumero(novoNumero);
            
            System.out.println("Digite o novo complemento para loja, (Anterior: " + l.getComplemento() + "): ");
            String novoComplemento = leitor.nextLine();
            
                l.setComplemento(novoComplemento);
                
            System.out.println("Digite o novo CEP para loja, (Anterior: " + l.getCep() + "): ");
            int novoCep = leitor.nextInt();
            leitor.nextLine();
            
                l.setCep(novoCep);
                
            System.out.println("Digite o novo Estado para loja, (Anterior: " + l.getEstado() + "): ");
            String novoEstado = leitor.nextLine();
            
                l.setEstado(novoEstado);
                
            System.out.println("Digite a nova cidade para a loja, (Anterior: " + l.getCidade() + "): ");
            String novoCidade = leitor.nextLine();
            
                l.setCidade(novoCidade);
                
            System.out.println("Digite o novo bairro para a loja, (Anterior: " + l.getBairro() + "): ");
            String novoBairro = leitor.nextLine();
            
                l.setBairro(novoBairro);
                
            System.out.println("Digite o novo CNPJ da loja, (Anterior: " + l.getCnpj() + "): ");
            String novoCnpj = leitor.nextLine();
            
                l.setCnpj(novoCnpj);
                
            System.out.println("Digite o novo horario inicio, (Anterior: " + l.getHorarioInicio() + "): ");
            String novoHorarioInicio = leitor.nextLine();
            
                l.setHorarioInicio(novoHorarioInicio);
            
            System.out.println("Digite o novo horario fim, (Anterior: " + l.getHorarioFim() + "): ");
            String novoHorarioFim = leitor.nextLine();
            
                l.setHorarioFim(novoHorarioFim);
                
                        
            System.out.println("Loja alterada com Sucesso!");
            
            
        }else
        {
            System.out.println("Loja não cadastrada!");
        }     
        
    }
        
        public static void ExcluirLoja() 
        {
            
            System.out.println("Digite o nome da loja que deseja excluir:");
            String nomeLoja = leitor.nextLine();
            

            if (nomeLoja != null)
            {
                BancoDeDadosLocadora.getTabelaLoja().remove(nomeLoja);
                System.out.println("Loja excluida com Sucesso!");

            }else
            {
                System.out.println("Loja não cadastrada no sistema!!!");
            }     

        }
        
                
    }
    
    

