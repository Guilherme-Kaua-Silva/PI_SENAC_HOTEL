/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Hospedes {
    private int cpf;
    private int avaliacao;
    private String comentario;
    private String nome;
    private int data_de_nasc;
    private Sexo sexo;
    private String email;
    private String telefone;
    private Endereco id_endereco;

    public int getId() {
        return cpf;
    }

    public void setId(int cpf) {
        this.cpf = cpf;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getData_de_nasc() {
        return data_de_nasc;
    }

    public void setData_de_nasc(int data_de_nasc) {
        this.data_de_nasc = data_de_nasc;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setFoto(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.nome = telefone;
    }

    public Endereco getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Endereco id_endereco) {
        this.id_endereco = id_endereco;
    }
}
