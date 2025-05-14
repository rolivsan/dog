package br.com.mercado.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Cachorro {


    private Long id;
    private String raca;
    private String discricao;
    double tamanhoMin;
    double tamanhoMax;
    int pesoMin;
    int pesoMax;
    private int energia;

}
