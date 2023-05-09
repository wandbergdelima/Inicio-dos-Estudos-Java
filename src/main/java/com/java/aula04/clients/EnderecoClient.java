package com.java.aula04.clients;

import com.java.aula04.responses.EnderecoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EnderecoClient {

    private RestTemplate restTemplate = new RestTemplate();

    public EnderecoResponse buscarPorCep(String cep)throws Exception{
        ResponseEntity<EnderecoResponse> response =
                restTemplate.getForEntity("https://viacep.com.br/ws/"+cep+"/json/", EnderecoResponse.class);
        return response.getBody();
    }

}
