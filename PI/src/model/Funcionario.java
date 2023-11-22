/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cliente
 */
public class Funcionario {
    private int id_funcionario;
    private String senha;
    private String login;
    
    public int getIdFuncionario() {
        return id_funcionario;
    }
    public void setIdFuncionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String s) {
        this.senha = s;
    }
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String l) {
        this.login = l;
    }
}
