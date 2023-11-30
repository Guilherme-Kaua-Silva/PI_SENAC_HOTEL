package model;

public class Quartos {
    private boolean cozinha;
    private boolean banheiro;
    private Avaliacao id_avaliacao;
    private int id_quarto;
    private Tipo tipo;
    private int capacidade;
    private double preco_por_noite;
    private boolean disponibilidade;

    public boolean isCozinha() {
        return cozinha;
    }

    public void setCozinha(boolean cozinha) {
        this.cozinha = cozinha;
    }

    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    public Avaliacao getId_avaliacao() {
        return id_avaliacao;
    }

    public void setId_avaliacao(Avaliacao id_avaliacao) {
        this.id_avaliacao = id_avaliacao;
    }

    public int getId_quarto() {
        return id_quarto;
    }

    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getPreco_por_noite() {
        return preco_por_noite;
    }

    public void setPreco_por_noite(double preco_por_noite) {
        this.preco_por_noite = preco_por_noite;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public void addQuarto(boolean pCozinha, boolean pBanheiro, int pId_quarto,int pCapacidade,double pPreco_por_noite,boolean pDisponibilidade){
        this.setBanheiro(pBanheiro);
        this.setCozinha(pCozinha);
        this.setId_quarto(pId_quarto);
        this.setCapacidade(pCapacidade);
        this.setPreco_por_noite(pPreco_por_noite);
        this.setDisponibilidade(    pDisponibilidade);
    } 
}