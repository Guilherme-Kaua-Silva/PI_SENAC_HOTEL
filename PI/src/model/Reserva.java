package model;

public class Reserva{
    private int id_reserva;
    private Hospedes id_hospede;
    private Quartos id_quarto;
    private boolean check_in;
    private boolean check_out;
    private String status_pagamento;
    private String estado;
    public int getId_reserva() {
        return id_reserva;
    }
    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }
    public Hospedes getId_hospede() {
        return id_hospede;
    }
    public void setId_hospede(Hospedes id_hospede) {
        this.id_hospede = id_hospede;
    }
    public Quartos getId_quarto() {
        return id_quarto;
    }
    public void setId_quarto(Quartos id_quarto) {
        this.id_quarto = id_quarto;
    }
    public boolean getCheck_in() {
        return check_in;
    }
    public void setCheck_in(boolean check_in) {
        this.check_in = check_in;
    }
    public boolean getCheck_out() {
        return check_out;
    }
    public void setCheck_out(boolean check_out) {
        this.check_out = check_out;
    }
    public String getStatus_pagamento() {
        return status_pagamento;
    }
    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }   
}