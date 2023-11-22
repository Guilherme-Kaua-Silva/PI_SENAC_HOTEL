package model;

public enum Tipo {
    CASAL("Casal"),
    SOLTEIRO("Solteiro"),
    FAMILIA("Familia");

    private String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}