package br.com.mercado.domain.usecase;

import br.com.mercado.domain.model.Cachorro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CachorroUseCase {

    @Autowired
    List<Cachorro> cachorroList;

    public List<Cachorro> listarCachorros() {
        return  cachorroList;
    }

    //TODO é aqui que voce vai fazer as alteracoes de código
}
