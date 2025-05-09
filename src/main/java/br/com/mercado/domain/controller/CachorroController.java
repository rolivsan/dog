package br.com.mercado.domain.controller;


import br.com.mercado.domain.model.Cachorro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cachorro")
public class CachorroController {

    @GetMapping
    public ResponseEntity<List<Cachorro>> listarCachorros() {
        List<Cachorro> cachorro = new ArrayList<>();
        cachorro.add(new Cachorro("Border Collie ","agiu ",46 ,56,13 ,20,5));
        cachorro.add(new Cachorro("Pitbull ","muito apegada ",13,27,10,35,4));
        cachorro.add(new Cachorro("Doberman ","utilizado como cão de guarda",65,69,30,40,5));
        cachorro.add(new Cachorro("Husky siberiano ","Husky siberiano surgiu na Sibéria ",51,60,26,44,5));
        cachorro.add(new Cachorro("Beagle ","conhecidos por serem muito alegres e brincalhões",33,41,9,35,5));
        cachorro.add(new Cachorro("Poodle ","raças mais conhecidas no mundo ",25,52,2,23,4));
        cachorro.add(new Cachorro("Pug ","Essa raça é uma das mais antigas",20,30,6,8,4));
        cachorro.add(new Cachorro("Rottweiler ","São grandes e fortes ",56,69,35,60,4));
        cachorro.add(new Cachorro("Boxer ","são grandes, brincalhões ",53,63,25,32,5));
        cachorro.add(new Cachorro("Shih Tzu ","Focinho achatado ",25,27,4,8,3));

        return ResponseEntity.ok(cachorro);
    }

}
