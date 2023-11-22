package controller;

import java.sql.DriverManager; // Driver para abrir Conexão
import java.sql.SQLException; // Tratamento de Erros SQL
import java.sql.Connection; // Armazena a Conexão Aberta
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



public class ConectarDao {
    public Connection mycon = null;
    public String sql = null;
    PreparedStatement ps;
    
    public void criarBanco() {
        try {
            sql = "CREATE TABLE IF NOT EXISTS FUNCIONARIO (id_funcionario INT,"
                    + "login varchar(14) not null ,"
                    + "senha varchar(14) not null ,"
                    + "primary key(id_funcionario))";
            ps = mycon.prepareStatement(sql);
            ps.execute();
            
            sql = "CREATE TABLE IF NOT EXISTS HOSPEDES (avaliacao INT,"
                    + "cpf varchar(11) not null ,"
                    + "comentario TEXT,"
                    + "nome varchar(255) not null ,"
                    + "data_de_nasc DATE,"
                    + "sexo ENUM('Masculino', 'Feminino', 'Outro'),"
                    + "email varchar(50) not null ,"
                    + "telefone varchar(15) not null ,"
                    + "id_endereco  int, "
                    + "primary key (cpf),"
                    + "FOREIGN KEY (id_endereco) REFERENCES Endereco(id_endereco))";
            ps = mycon.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL

            sql = "CREATE TABLE IF NOT EXISTS HOTEL (id_hotel INT AUTO_INCREMENT,"
                    + "nome VARCHAR(255) NOT NULL, "
                    + "localizacao VARCHAR(255) NOT NULL,"
                    + "descricao TEXT,"
                    + "classificacao INT,"
                    + "foto VARCHAR(255),"
                    + "primary key(id_hotel) ) ";
            ps = mycon.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL

            sql = "CREATE TABLE IF NOT EXISTS ENDERECO (id_endereco INT AUTO_INCREMENT,"
                    + "CEP VARCHAR(8),"
                    + "cidade VARCHAR(255) NOT NULL,"
                    + "bairro VARCHAR(255) NOT NULL,"
                    + "primary key(id_endereco) ) ";
            ps = mycon.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL
            
            sql = "CREATE TABLE IF NOT EXISTS Quartos (id_quarto INT AUTO_INCREMENT,"
                + "cozinha BOOLEAN,"
                + "banheiro BOOLEAN,"
                + "id_avaliacao INT,"
                + "tipo ENUM('Casal', 'Solteiro', 'Familia'),"
                + "capacidade INT,"
                + "preco_por_noite DECIMAL(10, 2),"
                + "disponibilidade BOOLEAN,"
                + "primary key(id_quarto));";
            ps = mycon.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL

            sql = "CREATE TABLE IF NOT EXISTS SERVICOS (id_servico INT AUTO_INCREMENT,"
                    + "nome VARCHAR(255) NOT NULL, "
                    + "descricao TEXT,"
                    + "preco_adicional DECIMAL(10, 2),"
                    + "primary key(id_servico) ) ";
            ps = mycon.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL
            
            sql = "CREATE TABLE IF NOT EXISTS RESERVA (id_reserva INT AUTO_INCREMENT,"
                    + "id_hospede VARCHAR(11), "
                    + "id_quarto INT,"
                    + "check_in INT,"
                    + "check_out INT,"
                    + "status_pagamento ENUM('Pago', 'Pendente', 'Cancelado'),"
                    + "estado ENUM('Pendente', 'Confirmada', 'Cancelada'),"
                    + "primary key(id_reserva)," 
                    + "FOREIGN KEY (id_hospede) REFERENCES Hospedes(Cpf),"
                    + "FOREIGN KEY (id_quarto) REFERENCES Quartos(id_quarto)) ";
            ps = mycon.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL

            sql = "CREATE TABLE IF NOT EXISTS RESERVA_SERVICOS (id_reserva_servico INT AUTO_INCREMENT,"
                    + "id_reserva INT,"
                    + "id_servico INT," 
                    + "primary key(id_reserva_servico),"
                    + "FOREIGN KEY (id_reserva) REFERENCES Reserva(id_reserva),"
                    + "FOREIGN KEY (id_servico) REFERENCES Servico(id_servico)) ";
            ps = mycon.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL

            
            
            sql = "CREATE TABLE IF NOT EXISTS Avaliacao (id_avaliacao INT AUTO_INCREMENT,"
                + "avaliacao INT,"
                + "comentario TEXT,"
                + "id_quarto INT,"
                + "FOREIGN KEY (id_quarto) REFERENCES Quarto(id_quarto)) ";
            ps = mycon.prepareStatement(sql); // prepara o objeto que irá executar o comando SQL
            ps.execute(); // Executa o comando SQL

    
            JOptionPane.showMessageDialog(null, "Banco criado com sucesso...");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao criar banco de dados " + err.getMessage());
        }
    }
    
    public ConectarDao () { 
        Connection mycon;
        try { // Código que abre e armazena a
            this.mycon = DriverManager.getConnection (
            "jdbc:mysql://localhost:3306/hotel_furacao", "root" ,
            "");
            this.criarBanco();
        }
        catch ( SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão com o MySQL ...\n" + err.getMessage());
        }
        
    }
    
    
}