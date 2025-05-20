package br.com.mercado.domain.controller;


import br.com.mercado.domain.dto.CachorroRequest;
import br.com.mercado.domain.model.Cachorro;
import br.com.mercado.domain.service.CachorroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cachorro")
public class CachorroController {

    @Autowired
    CachorroService cachorroService;

    @GetMapping
    public ResponseEntity<List<Cachorro>> listarCachorros() {
        return ResponseEntity.ok(cachorroService.listarCachorros());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Cachorro> listarCachorros(@PathVariable Long id) {
//        Cachorro dogToReturn = new Cachorro();
//        for(Cachorro dog : cachorroList){
//            if(dog.getId() == id){
//                dogToReturn =  dog;
//            }
//        }
//        return ResponseEntity.ok(dogToReturn);
//    }
//
//
//    @PostMapping
//    public ResponseEntity<Cachorro> criaCachorro(@RequestBody CachorroRequest request) {
//        Cachorro cachorro = new Cachorro((long) (cachorroList.size() + 1),
//                request.getRaca(), request.getDiscricao(), request.getTamanhoMin()
//                , request.getTamanhoMax(), request.getPesoMin(), request.getPesoMax(), request.getEnergia());
//        cachorroList.add(cachorro);
//
//        return ResponseEntity.status(201).body(cachorro);
//    }


    //TODO denivaldo, criar corretamente o metodo de delete e testar atraves do postman
    // ao inves de apenas apagar o registro pela posicao, vc precisa percorrer a lista e o registro que tiver o id q vc passou
    // vc precisa peggar o ide e se fpr igual, pegar a posicao e apagar
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> listarCachorros(@PathVariable int id) {
//        return ResponseEntity.noContent().build();
//    }


    //TODO de acordo com a ultima aula, implementar tudo o que fizemos para os metodos de get by id, e delete que vc vai fazer
    // aplicar a questao dos container do spring boot



}
