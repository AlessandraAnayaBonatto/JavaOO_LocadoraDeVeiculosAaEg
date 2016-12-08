/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MassaTeste;

import bancoDeDados.BancoDeDadosLocadora;
import models.CarroModel;
import models.CartaoDeCreditoModel;
import models.ClientePessoaFisicaModel;
import models.ClientePessoaJuridicaModel;
import models.LojaModel;


/**
 *
 * @author eduar
 */
public class MassaTeste {
    public static void GerarMassaTeste(){
        //Laço para geração de massa teste de carro
        for (int i = 1; i <= 10; i++) {
            CarroModel cr = new CarroModel();
            cr.setCodigo(i);
            cr.setModelo("ModeloTeste" + i);
            cr.setMarca("MarcaTeste" + i);
            cr.setAno(1966 + 1);
            cr.setCategoria("CategoriaTeste" + i);
            cr.setQuantPessoas(5);
            cr.setTipoCombustivel("Flex");
            cr.setQuilometragem(i * 100);
            cr.setValores(90);
            cr.setTaxas(10);
            
            if((i % 2) == 0){
                cr.setTipoLocacao("PF");
                cr.setNivelTanque("Cheio");
                cr.setTipoCambio("Automatico");
                cr.setPotenciaMotor("1.6 16V");
                cr.setQuantMalas(5);
                cr.setQuantPortas(4);
                cr.setAr(true);
                cr.setDirecaoHidraulica(true);
                cr.setVidroEletrico(true);
                cr.setTravaEletrica(true);
                cr.setAirBag(true);
                cr.setAbs(true);
                cr.setBlindagem(false);
                cr.setCouro(true);
                cr.setLimpeza(true);
            }else{
                cr.setTipoLocacao("PJ");
                cr.setNivelTanque("Meio");
                cr.setTipoCambio("Manual");
                cr.setPotenciaMotor("1.0");
                cr.setQuantMalas(3);
                cr.setQuantPortas(2);
                cr.setAr(false);
                cr.setDirecaoHidraulica(false);
                cr.setVidroEletrico(false);
                cr.setTravaEletrica(false);
                cr.setAirBag(false);
                cr.setAbs(false);
                cr.setBlindagem(false);
                cr.setCouro(false);
                cr.setLimpeza(false);
            }
            
            BancoDeDadosLocadora.getTabelaCarro().add(cr);
        }

        //Laço para geração de massa teste de cartão de credito        
        for (int i = 1; i <= 10; i++) {
            CartaoDeCreditoModel cc = new CartaoDeCreditoModel();
            cc.setNumeroCartao("0000 0000 0000 000"+i);
            cc.setNomeDoTitular("TesteCatão"+i);
            cc.setCodigoSegurança(100+i);
            cc.setMesValidade(i);
            cc.setAnoValidade(20+i);
            
            BancoDeDadosLocadora.getTabelaCartaoDeCredito().add(cc);
        }

        //Laço para geração de massa teste de loja        
        for (int i = 1; i <= 4; i++) {
            LojaModel lj = new LojaModel();
            lj.setNome("LojaTeste"+i);
            lj.setEndereco("EndereçoTeste"+i);
            lj.setNumero(i);
            lj.setCep(83409000+i);
            lj.setComplemento("Complemento"+i);
            lj.setBairro("Bairro"+i);
            lj.setCidade("Cidade"+i);
            lj.setEstado("Estado"+i);
            lj.setHorarioInicio("Incias as 08:00");
            lj.setHorarioFim("Finaliza as 18:00");
            lj.setCnpj("CNPJ"+i);
            lj.setTelefone(33330000+i);
            
            BancoDeDadosLocadora.getTabelaLoja().add(lj);
        }

        //Laço para geração de massa teste de cliente pf        
        for (int i = 1; i <= 10; i++) {
            ClientePessoaFisicaModel pf = new ClientePessoaFisicaModel();
            pf.setNome("PessoaFisicaTeste"+i);
            pf.setTelefone(33330000+i);
            pf.setCpf("CPF"+i);
            pf.setEndereco("EndereçoPF"+i);
            pf.setNumero(i);
            pf.setCep(83409000+i);
            pf.setComplemento("ComplementoPF"+i);
            pf.setBairro("BairroPF"+i);
            pf.setCidade("CidadePF"+i);
            pf.setEstado("EstadoPF"+i);
            pf.setCategoria("CategoriaCnhPF"+i);
            pf.setTempo("TempoCnhPF"+i);
            pf.setEstadoEmissor("EstadoEmissorcnhPF"+i);
            pf.setNumeroCnh("NumeroCnhPF"+i);
            pf.setRegistroCnh("RegistroCnhPF"+i);
            
            BancoDeDadosLocadora.getTabelaClientesPessoaFisica().add(pf);
        }

        //Laço para geração de massa teste de cliente pj                
        for (int i = 1; i <= 5; i++) {
            ClientePessoaJuridicaModel pj = new ClientePessoaJuridicaModel();
            pj.setNome("PessoaJuridicaTeste"+i);
            pj.setTelefone(33330000+i);
            pj.setEndereco("EndereçoPF"+i);
            pj.setNumero(i);
            pj.setCep(83409000+i);
            pj.setComplemento("ComplementoPF"+i);
            pj.setBairro("BairroPF"+i);
            pj.setCidade("CidadePF"+i);
            pj.setEstado("EstadoPF"+i);
            pj.setCnpj("CNPJ"+i);
            
            BancoDeDadosLocadora.getTabelaClientePessoaJuridica().add(pj);
        }
    }
}
