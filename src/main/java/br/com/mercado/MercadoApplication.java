package br.com.mercado;


import br.com.mercado.domain.model.Cachorro;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
public class MercadoApplication {


	public static void main(String[] args) {
		SpringApplication.run(MercadoApplication.class, args);
	}

	@Bean
	public List<Cachorro> cachorroList (){
		List<Cachorro> cachorroList = new ArrayList<>();
		cachorroList.add(new Cachorro(1L, "Border Collie ", "agiu ", 46, 56, 13, 20, 5));
		cachorroList.add(new Cachorro(2L, "Pitbull ", "muito apegada ", 13, 27, 10, 35, 4));
		cachorroList.add(new Cachorro(3L, "Doberman ", "utilizado como cão de guarda", 65, 69, 30, 40, 5));
		cachorroList.add(new Cachorro(4L, "Husky siberiano ", "Husky siberiano surgiu na Sibéria ", 51, 60, 26, 44, 5));
		cachorroList.add(new Cachorro(5L, "Beagle ", "conhecidos por serem muito alegres e brincalhões", 33, 41, 9, 35, 5));
		cachorroList.add(new Cachorro(6L, "Poodle ", "raças mais conhecidas no mundo ", 25, 52, 2, 23, 4));
		cachorroList.add(new Cachorro(7L, "Pug ", "Essa raça é uma das mais antigas", 20, 30, 6, 8, 4));
		cachorroList.add(new Cachorro(8L, "Rottweiler ", "São grandes e fortes ", 56, 69, 35, 60, 4));
		cachorroList.add(new Cachorro(9L, "Boxer ", "são grandes, brincalhões ", 53, 63, 25, 32, 5));
		cachorroList.add(new Cachorro(10L, "Shih Tzu ", "Focinho achatado ", 25, 27, 4, 8, 3));

		return cachorroList;
	}

}
