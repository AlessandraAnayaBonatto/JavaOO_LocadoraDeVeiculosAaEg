package javaoo_locadoradeveiculosaaeg.git.models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Philip
 */
public class Carro {
    
    private int codigo;
    private String modelo ;
    private String marca;
    private int ano;
    private String categoria;
    private int quantPortas;
    private int quantPessoas;
    private int quantMalas;
    private boolean ar;
    private boolean direcaoHidraulica;
    private boolean vidroEletrico;
    private boolean travaEletrica;
    private boolean airBag;
    private boolean abs;
    private String potenciaMotor;
    private boolean blindagem;
    private boolean couro;
    private String tipoCombustivel;
    private String tipoCambio;
    private String nivelTanque;
    private boolean limpeza;
    private int quilometragem;
    private float valores;
    private float taxas;
    private String tipoLocacao;

    /**
     * @return the modelo
     */
    
    
    public int getCodigo()
    {
        return codigo;
    }
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the quantPortas
     */
    public int getQuantPortas() {
        return quantPortas;
    }

    /**
     * @param quantPortas the quantPortas to set
     */
    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    /**
     * @return the quantPessoas
     */
    public int getQuantPessoas() {
        return quantPessoas;
    }

    /**
     * @param quantPessoas the quantPessoas to set
     */
    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    /**
     * @return the quantMalas
     */
    public int getQuantMalas() {
        return quantMalas;
    }

    /**
     * @param quantMalas the quantMalas to set
     */
    public void setQuantMalas(int quantMalas) {
        this.quantMalas = quantMalas;
    }

    /**
     * @return the ar
     */
    public boolean isAr() {
        return ar;
    }

    /**
     * @param ar the ar to set
     */
    public void setAr(boolean ar) {
        this.ar = ar;
    }

    /**
     * @return the direcaoHidraulica
     */
    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    /**
     * @param direcaoHidraulica the direcaoHidraulica to set
     */
    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    /**
     * @return the vidroEletrico
     */
    public boolean isVidroEletrico() {
        return vidroEletrico;
    }

    /**
     * @param vidroEletrico the vidroEletrico to set
     */
    public void setVidroEletrico(boolean vidroEletrico) {
        this.vidroEletrico = vidroEletrico;
    }

    /**
     * @return the travaEletrica
     */
    public boolean isTravaEletrica() {
        return travaEletrica;
    }

    /**
     * @param travaEletrica the travaEletrica to set
     */
    public void setTravaEletrica(boolean travaEletrica) {
        this.travaEletrica = travaEletrica;
    }

    /**
     * @return the airBag
     */
    public boolean isAirBag() {
        return airBag;
    }

    /**
     * @param airBag the airBag to set
     */
    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    /**
     * @return the abs
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * @param abs the abs to set
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    /**
     * @return the potenciaMotor
     */
    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    /**
     * @param potenciaMotor the potenciaMotor to set
     */
    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    /**
     * @return the blindagem
     */
    public boolean isBlindagem() {
        return blindagem;
    }

    /**
     * @param blindagem the blindagem to set
     */
    public void setBlindagem(boolean blindagem) {
        this.blindagem = blindagem;
    }

    /**
     * @return the couro
     */
    public boolean isCouro() {
        return couro;
    }

    /**
     * @param couro the couro to set
     */
    public void setCouro(boolean couro) {
        this.couro = couro;
    }

    /**
     * @return the tipoCombustivel
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * @param tipoCombustivel the tipoCombustivel to set
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     * @return the tipoCambio
     */
    public String getTipoCambio() {
        return tipoCambio;
    }

    /**
     * @param tipoCambio the tipoCambio to set
     */
    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    /**
     * @return the nivelTanque
     */
    public String getNivelTanque() {
        return nivelTanque;
    }

    /**
     * @param nivelTanque the nivelTanque to set
     */
    public void setNivelTanque(String nivelTanque) {
        this.nivelTanque = nivelTanque;
    }

    /**
     * @return the limpeza
     */
    public boolean isLimpeza() {
        return limpeza;
    }

    /**
     * @param limpeza the limpeza to set
     */
    public void setLimpeza(boolean limpeza) {
        this.limpeza = limpeza;
    }

    /**
     * @return the quilometragem
     */
    public int getQuilometragem() {
        return quilometragem;
    }

    /**
     * @param quilometragem the quilometragem to set
     */
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    /**
     * @return the valores
     */
    public float getValores() {
        return valores;
    }

    /**
     * @param valores the valores to set
     */
    public void setValores(float valores) {
        this.valores = valores;
    }

    /**
     * @return the taxas
     */
    public float getTaxas() {
        return taxas;
    }

    /**
     * @param taxas the taxas to set
     */
    public void setTaxas(float taxas) {
        this.taxas = taxas;
    }

    /**
     * @return the tipoLocacao
     */
    public String getTipoLocacao() {
        return tipoLocacao;
    }

    /**
     * @param tipoLocacao the tipoLocacao to set
     */
    public void setTipoLocacao(String tipoLocacao) {
        this.tipoLocacao = tipoLocacao;
    }
    
  
    
    
    
    
    
    
    
}
