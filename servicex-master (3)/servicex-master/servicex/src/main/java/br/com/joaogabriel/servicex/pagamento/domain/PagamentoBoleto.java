package br.com.joaogabriel.servicex.pagamento.domain;

import br.com.joaogabriel.servicex.ordemServico.domain.OrdemServico;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@JsonTypeName("pagamentoBoleto")
public class PagamentoBoleto extends Pagamento {

    @Column(name = "DATA_VENCIMENTO")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;
    @Column(name = "DATA_PAGAMENTO")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;

    public PagamentoBoleto(Integer idPagamento, StatusPagamento statusPagamento, OrdemServico ordemServico, Date dataVencimento, Date dataPagamento) {
        super(idPagamento, statusPagamento, ordemServico);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoBoleto(Date dataVencimento, Date dataPagamento) {
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }
}