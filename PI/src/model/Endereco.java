/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author guilherme.ksilva4
 */
public class Endereco {
    private int id_endereco;
    private String CEP;
    private String cidade;
    private String bairro;

    public int getId() {
        return id_endereco;
    }

    public void setId(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void addEndereco(int pId, String pCep, String pCidade, String pBairro){
        this.setId(pId);
        this.setCEP(pCep);
        this.setCidade(pCidade);
        this.setBairro(pBairro);
    } 
}
