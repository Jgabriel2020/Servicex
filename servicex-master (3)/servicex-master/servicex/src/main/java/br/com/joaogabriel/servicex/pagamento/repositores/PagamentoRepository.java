package br.com.joaogabriel.servicex.pagamento.repositores;

import br.com.joaogabriel.servicex.pagamento.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {
}