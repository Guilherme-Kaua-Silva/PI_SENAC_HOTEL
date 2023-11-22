/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author guilherme.ksilva4
 */
public class Reserva_Servicos {
    private int id_reserva_servico;
    private Reserva id_reserva;
    private Servicos id_servico;

    public int getIdReservaServico() {
        return id_reserva_servico;
    }

    public void setIdReservaServico(int id_reserva_servico) {
        this.id_reserva_servico = id_reserva_servico;
    }

    public Servicos getIdServico() {
        return id_servico;
    }

    public void setIdServico(Servicos id_servico) {
        this.id_servico = id_servico;
    }

    public Reserva getIdReserva() {
        return id_reserva;
    }

    public void setIdReserva(Reserva id_reserva) {
        this.id_reserva = id_reserva;
    }
}
