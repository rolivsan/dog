package br.com.mercado.domain.dto;

import lombok.Getter;

@Getter
public class CachorroRequest {

    private String raca;
    private String discricao;
    double tamanhoMin;
    double tamanhoMax;
    int pesoMin;
    int pesoMax;
    private int energia;
}
