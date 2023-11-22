package controller;

import java.sql.Connection;
import model.Reserva;

import java.sql.SQLException;
import java.sql.PreparedStatement; // Dentro da conexão permite executar comandos SQL
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class UsuarioDao extends ConectarDao {
    
    
     // objeto para executar o sql

    
    
    public UsuarioDao() {
        super();
    }
    
    public ResultSet validarLogin(String login, String senha){
        sql = "Select * from funcionario where login='" + login + "'"
                + " and senha = '" + senha + "'";
        
        try{
            PreparedStatement ps = (PreparedStatement)
                    mycon.prepareStatement(sql);
            ResultSet resul = ps.executeQuery();
            return resul;
            
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }
    }
    
    public void incluir(Reserva obj){
        sql = "INSERT INTO RESERVA VALUES (? , ?, ?, ?, ? ,?)";
        
        try{
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, obj.getId_reserva());
            ps.setInt(2, obj.getId_hospede().getId());
            ps.setInt(3, obj.getId_quarto().getId_quarto());
            ps.setString(4, obj.getCheck_in());
            ps.setString(5, obj.getCheck_out());
            ps.setString(6, obj.getStatus_pagamento().getDescricao());
            ps.setString(7, obj.getEstado().getDescricao());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Reserva feita com Sucesso!");
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Erro ao fazer check-in!" + err.getMessage());
        }
    }
    
        

    
}