package controller;

import view.Reservar;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement; // Dentro da conexão permite executar comandos SQL
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import model.Endereco;
import model.Hospedes;
import model.Quartos;
import model.Reserva;
import model.Tipo;

public class UsuarioDao extends ConectarDao {

    // objeto para executar o sql
    public UsuarioDao() {
        super();
    }

    public ResultSet validarLogin(String login, String senha) {
        sql = "Select * from funcionario where login='" + login + "'"
                + " and senha = '" + senha + "'";

        try {
            PreparedStatement ps = (PreparedStatement) mycon.prepareStatement(sql);
            ResultSet resul = ps.executeQuery();
            return resul;

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
            return null;
        }
    }

    public void incluirReserva(Reserva obj) {
        sql = "INSERT INTO RESERVA (id_reserva,id_hospede,id_quarto,check_in,check_out, status_pagamento,estado )VALUES (? , ?, ?, ?, ? ,?,?)";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, obj.getId_reserva());
            ps.setString(2, obj.getId_hospede().getCPF());
            ps.setInt(3, obj.getId_quarto());
            ps.setBoolean(4, obj.getCheck_in());
            ps.setBoolean(5, obj.getCheck_out());
            ps.setString(6, obj.getStatus_pagamento());
            ps.setString(7, obj.getEstado());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Reserva feita com Sucesso!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer check-in!" + err.getMessage());
        }
    }

    public void incluirHospede(Hospedes obj) {
        sql = "INSERT INTO HOSPEDES (avaliacao, cpf, comentario, nome, data_de_nasc, sexo, email, telefone, id_endereco) VALUES (? , ?, ?, ?, ? ,?, ?, ?, ?)";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, obj.getAvaliacao());
            ps.setString(2, obj.getCPF());
            ps.setString(3, obj.getComentario());
            ps.setString(4, obj.getNome());
            ps.setString(5, obj.getData_de_nasc());
            ps.setString(6, obj.getSexo());
            ps.setString(7, obj.getEmail());
            ps.setString(8, obj.getTelefone());
            ps.setInt(9, obj.getId_endereco().getId());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Cadastro feito com Sucesso!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer Cadastro!" + err.getMessage());
        }
    }

    public ResultSet buscarEnderecoPorCep(String cep) {
        sql = "SELECT * FROM ENDERECO WHERE CEP in (?)";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setString(1, cep);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Endereco!" + err.getMessage());
            return null;
        }
    }
    public ResultSet buscarEnderecoPorId(int id) {
        sql = "SELECT * FROM ENDERECO WHERE id_endereco in (?)";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Endereco!" + err.getMessage());
            return null;
        }
    }
    public ResultSet buscarHospede(String cpf) {
        sql = "SELECT * FROM ENDERECO WHERE CEP in (?)";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setString(1, cpf);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Endereco!" + err.getMessage());
            return null;
        }
    }

    public void incluirEndereco(Endereco obj) {
        sql = "INSERT INTO ENDERECO (CEP, Cidade, Bairro) VALUES (?,?,?)";
        try {
            ps = mycon.prepareStatement(sql);
            ps.setString(1, obj.getCEP());
            ps.setString(2, obj.getCidade());
            ps.setString(3, obj.getBairro());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Endereco incluido com Sucesso!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir Endereco!" + err.getMessage());
        }
    }

    public void incluirQuarto(Quartos obj) {
        sql = "INSERT INTO Quartos (Banheiro , Disponibilidade,Cozinha,Id_avaliacao, Tipo, Capacidade, Preco_por_noite) VALUES (?,?,?,?,?,?,?)";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setBoolean(1, obj.isBanheiro());
            ps.setBoolean(2, obj.isDisponibilidade());
            ps.setBoolean(3, obj.isCozinha());
            ps.setInt(4, obj.getId_avaliacao());
            ps.setString(5, obj.getTipo().getDescricao());
            ps.setInt(6, obj.getCapacidade());
            ps.setDouble(7, obj.getPreco_por_noite());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Quarto incluido com Sucesso!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir Quarto!" + err.getMessage());
        }
    }

    public ResultSet buscarQuartos() {
        sql = "Select * from Quartos ORDER BY id_quarto";

        try {
            ps = mycon.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Quarto!" + err.getMessage());
            return null;
        }

    }

    public ResultSet buscarQuartoPorId(int id) {
        sql = "Select * from Quartos where id_quarto = ?";

        try {
            ps = mycon.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar '!" + err.getMessage());
            return null;
        }

    }

    public ResultSet buscarQuartosDisponiveis() {
        sql = "SELECT * FROM Quartos WHERE Disponibilidade = true ORDER BY id_quarto";

        try {
            ps = mycon.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar quartos disponíveis: " + err.getMessage());
            return null;
        }
    }

    public ResultSet buscarQuartosIndisponiveis() {
        sql = "SELECT * FROM Quartos WHERE Disponibilidade = false ORDER BY id_quarto";

        try {
            ps = mycon.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar quartos disponíveis: " + err.getMessage());
            return null;
        }
    }

    public void alterarDisponibilidadeQuarto(int idQuarto, boolean disponibilidade) {
        sql = "UPDATE Quartos SET Disponibilidade = ? WHERE id_quarto = ?";
        try {
            ps = mycon.prepareStatement(sql);
            ps.setBoolean(1, disponibilidade);
            ps.setInt(2, idQuarto);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Disponibilidade do quarto alterada com sucesso!");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a disponibilidade do quarto: " + err.getMessage());
        }
    }

}
