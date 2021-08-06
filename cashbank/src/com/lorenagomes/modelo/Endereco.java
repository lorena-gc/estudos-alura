package com.lorenagomes.modelo;

/**
 * @author Lorena Gomes
 * @version 1.0
 *
 * Essa é a classe de endereço para ser utilizada pelo Cliente e Funcionários.
 */
public class Endereco {
    private String logadouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
