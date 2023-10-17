package edu.ifmt.cobrancaifmt2.model.titulo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import jakarta.persistence.*;

@Entity
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String descricao;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @NumberFormat(pattern = "#,##0.00")
    private BigDecimal valor;
    @Enumerated(EnumType.STRING)
    private StatusTitulo status;

    public Long getCodigo() {
        return codigo;
    }
    
    
    public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public StatusTitulo getStatus() {
        return status;
    }
    public void setStatus(StatusTitulo status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Titulo other = (Titulo) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Titulo [codigo=" + codigo + ", descricao=" + descricao + ", dataVencimento=" + dataVencimento
                + ", valor=" + valor + ", status=" + status + "]";
    }
}
