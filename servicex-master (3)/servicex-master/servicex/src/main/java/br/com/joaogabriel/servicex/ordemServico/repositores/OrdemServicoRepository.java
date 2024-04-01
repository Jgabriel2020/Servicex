package br.com.joaogabriel.servicex.ordemServico.repositores;

import br.com.joaogabriel.servicex.ordemServico.domain.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico,Integer> {
}
