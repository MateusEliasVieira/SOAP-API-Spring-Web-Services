package br.com.aprendendo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.aprendendo.model.PessoaModel;
import br.com.aprendendo.service.PessoaService;

@Endpoint
public class PessoaController {
	
	private static final String NAMESPACE_URI = "http://localhost/soap";

	@Autowired
	private PessoaService pessoaService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "mensagemPessoaEntrada")
	@ResponsePayload
	public PessoaModel inserirPessoaModel(@RequestPayload PessoaModel pessoaModel) {
		return pessoaService.inserirPessoaModel(pessoaModel);
	}
	
}
