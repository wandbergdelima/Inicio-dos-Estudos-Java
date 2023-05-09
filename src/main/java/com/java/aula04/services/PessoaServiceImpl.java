package com.java.aula04.services;

import com.java.aula04.entities.Endereco;
import com.java.aula04.entities.Pessoa;
import com.java.aula04.repositories.PessoaRepository;
import com.java.aula04.requests.PessoaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements IPessoaService{

    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private IEnderecoService enderecoService;

    @Override
    public void salvar(PessoaRequest pessoaRequest) {
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(pessoaRequest.getNome());
            pessoa.setTelefone(pessoaRequest.getTelefone());
            pessoa.setDataNascimento(pessoaRequest.getDataNascimento());
            Endereco endereco = enderecoService.salvar(pessoaRequest.getCep());
            pessoa.setEndereco(endereco);
            pessoaRepository.save(pessoa);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }

}
