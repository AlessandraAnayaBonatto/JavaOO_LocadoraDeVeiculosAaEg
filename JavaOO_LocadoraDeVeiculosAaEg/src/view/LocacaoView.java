/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.LocacaoController;
import java.util.Scanner;


/**
 *
 * @author aless
 */

public class LocacaoView 
{    
    private static Scanner leitor = new Scanner(System.in);
    
    public void Locacao ()
    {
    System.out.println("Informe qual o tipo de Locação:");
    String codLocacao = leitor.nextLine(); 
    
    if("PJ".equals(codLocacao))
    {
       LocacaoController.LocacaoPJ(); 
    }else
    {
       LocacaoController.LocacaoPF();
    }
       
    
    
    }
}
