package com.java.aula03.controllers;

import com.java.aula03.dto.PessoaDTO;
import com.java.aula03.enums.MensagemEnum;
import com.java.aula03.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/listar")
    public ResponseEntity listarTodos(){

        return ResponseEntity.ok(pessoaService.listarTodos());
    }

    @GetMapping("/buscar/id/{id}")
    public ResponseEntity buscarPorId(@PathVariable Long id) {
        //tratamento de exceção
        try {
            return ResponseEntity.ok(pessoaService.buscarPorId(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/salvar")
    public ResponseEntity salvar(@RequestBody PessoaDTO pessoaDTO){
        try {
            pessoaService.salvar(pessoaDTO);
            return ResponseEntity.ok(MensagemEnum.CADASTRO.getValue());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/atualizar")
    public ResponseEntity atualizar(@RequestBody PessoaDTO pessoaDTO){
        try {
            pessoaService.atualizar(pessoaDTO);
            return ResponseEntity.ok(MensagemEnum.ALTERACAO.getValue());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/excluir/id/{id}")
    public ResponseEntity excluir(@PathVariable Long id){
        try {
            pessoaService.excluir(id);
            return ResponseEntity.ok(MensagemEnum.EXCLUSAO.getValue());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
