package br.com.mercado.domain.service;

import br.com.mercado.domain.model.Cachorro;
import br.com.mercado.domain.usecase.CachorroUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CachorroService {

    @Autowired
    CachorroUseCase cachorroUseCase;

    public List<Cachorro> listarCachorros() {
        return cachorroUseCase.listarCachorros();
    }
}
