package com.java.aula03.services;

import com.java.aula03.dto.EnderecoDTO;
import com.java.aula03.entities.Endereco;
import com.java.aula03.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    // mapper converter to Object
    private Endereco convertDTOtoObject(EnderecoDTO enderecoDTO) {
        Endereco endereco = new Endereco();
        endereco.setId(enderecoDTO.getId());
        endereco.setLogradouro(enderecoDTO.getLogradouro());
        endereco.setBairro(enderecoDTO.getBairro());
        endereco.setCidade(enderecoDTO.getCidade());
        endereco.setUf(enderecoDTO.getUf());
        return endereco;
    }

    // mapper converter to DTO
    private EnderecoDTO convertObjectToDTO(Endereco endereco) {
        EnderecoDTO enderecoDTO = new EnderecoDTO();
        enderecoDTO.setId(endereco.getId());
        enderecoDTO.setLogradouro(endereco.getLogradouro());
        enderecoDTO.setBairro(endereco.getBairro());
        enderecoDTO.setCidade(endereco.getCidade());
        enderecoDTO.setUf(endereco.getUf());
        return enderecoDTO;
    }

    public void salvar(EnderecoDTO enderecoDTO) throws Exception {
        Endereco endereco = convertDTOtoObject(enderecoDTO);
        enderecoRepository.save(endereco);
    }

    public void atualizar(EnderecoDTO enderecoDTO) throws Exception {
        Endereco endereco = convertDTOtoObject(enderecoDTO);
        enderecoRepository.save(endereco);
    }

    public EnderecoDTO buscarPorId(Long id) {
        return convertObjectToDTO(enderecoRepository.findById(id).get());
    }

    public void excluir(Long id) {
        Endereco endereco = enderecoRepository.findById(id).get();
        if (endereco != null) {
            enderecoRepository.delete(endereco);
        }
    }

    public List<EnderecoDTO> listarTodos() {
        List<Endereco> enderecos = enderecoRepository.findAll();
        List<EnderecoDTO> enderecoDTOS = new ArrayList<>();
        for (Endereco endereco : enderecos) {
            enderecoDTOS.add(convertObjectToDTO(endereco));
        }
        return enderecoDTOS;
    }

    public List<EnderecoDTO> listarTodos2() {
        return enderecoRepository.findAll().stream().map(endereco -> {
            return convertObjectToDTO(endereco);
        }).collect(Collectors.toList());
    }

}
