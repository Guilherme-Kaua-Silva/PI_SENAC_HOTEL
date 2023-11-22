package model;

public class Avaliacao {
    private int id_avaliacao;
    private int avaliacao;
    private String comentario;
    private Quartos id_quarto;
    public int getId_avaliacao() {
        return id_avaliacao;
    }
    public void setId_avaliacao(int id_avaliacao) {
        this.id_avaliacao = id_avaliacao;
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
    public Quartos getId_quarto() {
        return id_quarto;
    }
    public void setId_quarto(Quartos id_quarto) {
        this.id_quarto = id_quarto;
    } 
}
