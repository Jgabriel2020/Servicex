package br.com.joaogabriel.servicex.servico.services;


import br.com.joaogabriel.servicex.servico.domain.Servico;
import br.com.joaogabriel.servicex.servico.repositores.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServicoService {
    @Autowired
    private ServicoRepository ServicoRepository;

    public Servico criarServico(Servico servico) { return ServicoRepository.save(servico); }

    public List<Servico> listarServico() { return  ServicoRepository.findAll(); }

    public Optional<Servico> buscarServico(Integer idServico) { return ServicoRepository.findById(idServico); }

    public Servico atualizarServico(Servico servico) { return ServicoRepository.save(servico); }

    public void deletarServico(Integer idServico) { ServicoRepository.deleteById(idServico);}
}