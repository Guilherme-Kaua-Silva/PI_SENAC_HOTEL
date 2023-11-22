package model;

public enum StatusPagamento {
    PAGO("pago"),
    PENDENTE("pendente"),
    CANCELADO("cancelado");

    private String descricao;

    StatusPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}