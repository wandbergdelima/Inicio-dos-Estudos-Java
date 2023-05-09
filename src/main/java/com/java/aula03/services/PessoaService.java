package com.java.aula03.services;

import com.java.aula03.dto.PessoaDTO;
import com.java.aula03.entities.Pessoa;
import com.java.aula03.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    //conversor
    private Pessoa convertDTOtoObject(PessoaDTO pessoaDTO){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(pessoaDTO.getIdPessoa());
        pessoa.setNome(pessoaDTO.getNomePessoa());
        pessoa.setDataAlteracao(pessoaDTO.getAlteradoEm());
        pessoa.setDataInsercao(pessoaDTO.getCadastradoEm());
        return pessoa;
    }

    private PessoaDTO convertObjectToDTO(Pessoa pessoa){
        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setIdPessoa(pessoa.getId());
        pessoaDTO.setNomePessoa(pessoa.getNome());
        pessoaDTO.setAlteradoEm(pessoa.getDataAlteracao());
        pessoaDTO.setCadastradoEm(pessoa.getDataInsercao());
        return pessoaDTO;
    }

    public void salvar(PessoaDTO pessoaDTO)throws Exception {
        Pessoa pessoa = convertDTOtoObject(pessoaDTO);
        pessoaRepository.save(pessoa);
    }

    public void atualizar(PessoaDTO pessoaDTO)throws Exception {
        Pessoa pessoa = convertDTOtoObject(pessoaDTO);
        pessoaRepository.save(pessoa);
    }

    public PessoaDTO buscarPorId(Long id){
        return convertObjectToDTO(pessoaRepository.findById(id).get());
    }

    public void excluir(Long id){
        Pessoa pessoa = pessoaRepository.findById(id).get();
        if(pessoa != null){
            pessoaRepository.delete(pessoa);
        }
    }

    public List<PessoaDTO> listarTodos(){
        List<Pessoa> pessoas = pessoaRepository.findAll();
        List<PessoaDTO> pessoaDTOS = new ArrayList<>();
        for (Pessoa pessoa: pessoas){
            pessoaDTOS.add(convertObjectToDTO(pessoa));
        }
        return pessoaDTOS;
    }

    public List<PessoaDTO> listarTodos2(){
        return pessoaRepository.findAll().stream().map(pessoa -> {
            return convertObjectToDTO(pessoa);
        }).collect(Collectors.toList());
    }
}
