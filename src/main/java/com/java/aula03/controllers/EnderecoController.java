package com.java.aula03.controllers;


import com.java.aula03.dto.EnderecoDTO;
import com.java.aula03.enums.MensagemEnum;
import com.java.aula03.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/listar")
    public ResponseEntity listarTodos() {
        return ResponseEntity.ok(enderecoService.listarTodos());
    }

    @GetMapping("/buscar/id/{id}")
    public ResponseEntity buscarPorId(@PathVariable Long id){
        try{
            return ResponseEntity.ok(enderecoService.buscarPorId(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/salvar")
    public ResponseEntity salvar(@RequestBody EnderecoDTO enderecoDTO){
        try{
            enderecoService.salvar(enderecoDTO);
            return ResponseEntity.ok(MensagemEnum.CADASTRO.getValue());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/atualizar")
    public ResponseEntity atualizar(@RequestBody EnderecoDTO enderecoDTO){
        try{
            enderecoService.atualizar(enderecoDTO);
            return ResponseEntity.ok(MensagemEnum.ALTERACAO.getValue());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("excluir/id/{id}")
    public ResponseEntity excluir(@PathVariable Long id){
        try {
            enderecoService.excluir(id);
            return ResponseEntity.ok(MensagemEnum.EXCLUSAO.getValue());
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
