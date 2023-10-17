package edu.ifmt.cobrancaifmt2.model.titulo;

public enum StatusTitulo {
    PENDENTE("Pendente"),
    RECEBIDO("Recebido"),
    TESTE("Teste"),
    EXEMPLO("Exemplo");

    private String descricao;

    StatusTitulo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
