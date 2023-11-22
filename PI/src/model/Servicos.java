/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author guilherme.ksilva4
 */
public class Servicos {
    private int id_servico;
    private String nome;
    private String descricao;
    private double preco_adicional;

    public int getId() {
        return id_servico;
    }

    public void setId(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoAdicional() {
        return preco_adicional;
    }

    public void setPrecoAdicional(double preco_adicional) {
        this.preco_adicional = preco_adicional;
    }
}
