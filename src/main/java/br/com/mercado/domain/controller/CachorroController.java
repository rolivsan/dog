package br.com.mercado.domain.controller;


import br.com.mercado.domain.model.Cachorro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cachorro")
public class CachorroController {

    List<Cachorro> cachorro;

    @GetMapping
    public ResponseEntity<List<Cachorro>> listarCachorros() {
        cachorro = new ArrayList<>();
        cachorro.add(new Cachorro(1L, "Border Collie ","agiu ",46 ,56,13 ,20,5));
        cachorro.add(new Cachorro(2L,"Pitbull ","muito apegada ",13,27,10,35,4));
        cachorro.add(new Cachorro(3L,"Doberman ","utilizado como cão de guarda",65,69,30,40,5));
        cachorro.add(new Cachorro(4L,"Husky siberiano ","Husky siberiano surgiu na Sibéria ",51,60,26,44,5));
        cachorro.add(new Cachorro(5L,"Beagle ","conhecidos por serem muito alegres e brincalhões",33,41,9,35,5));
        cachorro.add(new Cachorro(6L,"Poodle ","raças mais conhecidas no mundo ",25,52,2,23,4));
        cachorro.add(new Cachorro(7L,"Pug ","Essa raça é uma das mais antigas",20,30,6,8,4));
        cachorro.add(new Cachorro(8L,"Rottweiler ","São grandes e fortes ",56,69,35,60,4));
        cachorro.add(new Cachorro(9L,"Boxer ","são grandes, brincalhões ",53,63,25,32,5));
        cachorro.add(new Cachorro(10L,"Shih Tzu ","Focinho achatado ",25,27,4,8,3));

        return ResponseEntity.ok(cachorro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cachorro> listarCachorros(@PathVariable Long id) {
        Cachorro dogToReturn = new Cachorro();
        for(Cachorro dog : cachorro){
            if(dog.getId() == id){
                dogToReturn =  dog;
            }
        }
        return ResponseEntity.ok(dogToReturn);
    }



}
