package br.com.joaogabriel.servicex.pagamento.domain;
import br.com.joaogabriel.servicex.pagamento.domain.Pagamento;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonTypeName("pagamentoPix")
public class PagamentoPix extends Pagamento {
}