/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Hospedes {
    private String cpf;
    private int avaliacao;
    private String comentario;
    private String nome;
    private String data_de_nasc;
    private String sexo;
    private String email;
    private String telefone;
    private Endereco id_endereco;

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
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

    public String getData_de_nasc() {
        return data_de_nasc;
    }

    public void setData_de_nasc(String data_de_nasc) {
        this.data_de_nasc = data_de_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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
    public void addHospede(String pCpf, String pNome,String pSexo,String pEmail,String pTelefone,Endereco pId_endereco){
        this.setCPF(pCpf);
        this.setNome(pNome);
        this.setSexo(pSexo);
        this.setEmail(pEmail);
        this.setTelefone(pTelefone);
        this.setId_endereco(pId_endereco);
    } 
}
