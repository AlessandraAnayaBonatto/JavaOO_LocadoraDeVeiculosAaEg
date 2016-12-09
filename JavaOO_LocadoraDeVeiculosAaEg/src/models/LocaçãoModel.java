/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author eduar
 */
public abstract class LocaçãoModel {
    private LojaModel loja;
    private CarroModel carro;
    private ClientePessoaFisicaModel clietePF;
    private CartaoDeCreditoModel cartao;

    public LojaModel getLoja() {
        return loja;
    }

    public void setLoja(LojaModel loja) {
        this.loja = loja;
    }

    public CarroModel getCarro() {
        return carro;
    }

    public void setCarro(CarroModel carro) {
        this.carro = carro;
    }

    public ClientePessoaFisicaModel getClietePF() {
        return clietePF;
    }

    public void setClietePF(ClientePessoaFisicaModel clietePF) {
        this.clietePF = clietePF;
    }

    public CartaoDeCreditoModel getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCreditoModel cartao) {
        this.cartao = cartao;
    }
    
    
}
