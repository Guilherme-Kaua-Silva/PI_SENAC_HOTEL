package controller;

import java.sql.Connection;
import model.Reserva;

import java.sql.SQLException;
import java.sql.PreparedStatement; // Dentro da conexão permite executar comandos SQL
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import model.Endereco;
import model.Hospedes;
import model.Quartos;
import model.Tipo;


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
    
    public void incluirReserva(Reserva obj){
        sql = "INSERT INTO RESERVA VALUES (? , ?, ?, ?, ? ,?)";
        
        try{
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, obj.getId_reserva());
            ps.setInt(2, obj.getId_hospede().getCPF());
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
    public void incluirHospede(Hospedes obj){
        sql = "INSERT INTO HOSPEDES VALUES (? , ?, ?, ?, ? ,?, ?, ?, ?)";
        
        try{
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, obj.getAvaliacao());
            ps.setInt(2, obj.getCPF());
            ps.setString(3, obj.getComentario());
            ps.setString(4, obj.getNome());
            ps.setInt(5, obj.getData_de_nasc());
            ps.setString(6, obj.getSexo().getDescricao());
            ps.setString(7, obj.getEmail());
            ps.setString(8, obj.getTelefone());
            ps.setInt(9, obj.getId_endereco().getId());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Cadastro feito com Sucesso!");
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Erro ao fazer Cadastro!" + err.getMessage());
        }
    }
    public ResultSet buscarEndereco(String cep){
        sql = "SELECT * FROM ENDERECO WHERE CEP = '?'";
        try{
            ps = mycon.prepareStatement(sql);
            ps.setString(1,cep);
            return ps.executeQuery();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Erro ao buscar Endereco!" + err.getMessage());
            return null;
        }
    }
    public void incluirEndereco(Endereco obj){
        sql = "INSERT INTO ENDERECO (CEP, Cidade, Bairro) VALUES (?,?,?)";
        
        try{
            ps = mycon.prepareStatement(sql);
            ps.setString(1, obj.getCEP());
            ps.setString(2, obj.getCidade());
            ps.setString(3, obj.getBairro());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Endereco incluido com Sucesso!");
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Erro ao incluir Endereco!" + err.getMessage());
        }
    }
    
    public void incluirQuarto(Quartos obj){
        sql = "INSERT INTO Quartos (Banheiro , Disponibilidade,Cozinha, Capacidade, Preco_por_noite) VALUES (?,?,?,?,?)";
        
        try{
            ps = mycon.prepareStatement(sql);
            ps.setBoolean(1, obj.isBanheiro());
            ps.setBoolean(2, obj.isDisponibilidade());
            ps.setBoolean(3, obj.isCozinha());
            ps.setInt(4, obj.getCapacidade());
            ps.setDouble(5, obj.getPreco_por_noite());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Quarto incluido com Sucesso!");
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Erro ao incluir Quarto!" + err.getMessage());
        }
    }
        

    
}