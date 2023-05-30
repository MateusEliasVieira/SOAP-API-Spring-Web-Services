package br.com.aprendendo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aprendendo.model.PessoaModel;
import br.com.aprendendo.repository.PessoaRepository;
import br.com.aprendendo.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Override
	public PessoaModel inserirPessoaModel(PessoaModel pessoaModel) {
		return pessoaRepository.save(pessoaModel);
	}

	@Override
	public PessoaModel atualizarPessoaModel(PessoaModel pessoaModel) {
		return pessoaRepository.save(pessoaModel);
	}

	@Override
	public List<PessoaModel> listarTodasPessoasModel() {
		return pessoaRepository.findAll();
	}

	@Override
	public void deletarPessoaModelPorId(Long id) {
		pessoaRepository.deleteById(id);
	}

}
