package br.com.mercado.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Cachorro {

    private String raca;
    private String discricao;
    double tamanhoMin;
    double tamanhoMax;
    int pesoMin;
    int pesoMax;
    private int energia;

}
