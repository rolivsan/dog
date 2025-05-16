package br.com.mercado.domain.controller;


import br.com.mercado.domain.dto.CachorroRequest;
import br.com.mercado.domain.model.Cachorro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cachorro")
public class CachorroController {

    List<Cachorro> cachorroList =  new ArrayList<>();
    int contador =0;

    @GetMapping
    public ResponseEntity<List<Cachorro>> listarCachorros() {
        if(contador == 0) {
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

            this.contador ++;
        }
        return ResponseEntity.ok(cachorroList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cachorro> listarCachorros(@PathVariable Long id) {
        Cachorro dogToReturn = new Cachorro();
        for(Cachorro dog : cachorroList){
            if(dog.getId() == id){
                dogToReturn =  dog;
            }
        }
        return ResponseEntity.ok(dogToReturn);
    }


    @PostMapping
    public ResponseEntity<Cachorro> criaCachorro(@RequestBody CachorroRequest request) {
        Cachorro cachorro = new Cachorro((long) (cachorroList.size() + 1),
                request.getRaca(), request.getDiscricao(), request.getTamanhoMin()
                , request.getTamanhoMax(), request.getPesoMin(), request.getPesoMax(), request.getEnergia());
        cachorroList.add(cachorro);

        return ResponseEntity.status(201).body(cachorro);
    }


    //TODO denivaldo, criar corretamente o metodo de delete e testar atraves do postman
    // ao inves de apenas apagar o registro pela posicao, vc precisa percorrer a lista e o registro que tiver o id q vc passou
    //vc precisa peggar o ide e se fpr igual, pegar a posicao e apagar
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> listarCachorros(@PathVariable int id) {
//        return ResponseEntity.noContent().build();
//    }



}
