package br.com.aprendendo.service;

import java.util.List;

import br.com.aprendendo.model.PessoaModel;

public interface PessoaService {

	public PessoaModel inserirPessoaModel(PessoaModel pessoaModel);
	public PessoaModel atualizarPessoaModel(PessoaModel pessoaModel);
	public List<PessoaModel> listarTodasPessoasModel();
	public void deletarPessoaModelPorId(Long id);
}
