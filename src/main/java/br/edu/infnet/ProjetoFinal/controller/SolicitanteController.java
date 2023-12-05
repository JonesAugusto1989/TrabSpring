package br.edu.infnet.ProjetoFinal.controller;

import br.edu.infnet.ProjetoFinal.model.Pedido;
import br.edu.infnet.ProjetoFinal.model.Solicitante;
import br.edu.infnet.ProjetoFinal.services.PedidoService;
import br.edu.infnet.ProjetoFinal.services.SolicitanteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Solicitante")
public class SolicitanteController {
    @Autowired
    SolicitanteService solicitanteService;
    @Autowired
    PedidoService pedidoService;

Logger logger = LoggerFactory.getLogger(SolicitanteController.class);
@GetMapping
    public List<Solicitante> getAll(){
        logger.info("Metodo getAll iniciado: ");
    List<Solicitante> listaSolicitantes =  solicitanteService.getAll();
    return listaSolicitantes;
    }
@PutMapping
    public void update(){
        logger.info("Metodo update iniciado: ");

    Solicitante Marcos = Solicitante.builder().nome("MarcosAlterando").cpf("alterado").email("alterado@hotmail.com").build();
    solicitanteService.update(2,Marcos);


    //solicitanteService.update();
    }
    //public void update(Integer id,Solicitante solicitante){
@DeleteMapping
    public void delete(){
        logger.info("Metodo delete iniciado: ");
    solicitanteService.delete(4);

    }
@PostMapping
    public void create(@RequestBody Solicitante solicitante){
        logger.info("Metodo create iniciado: ");
        solicitanteService.create(solicitante);

    }
@GetMapping("/{id}")
    public Solicitante findById(@PathVariable("id") int identificador){
   return  solicitanteService.findById(identificador);
    }

/*
    @PostMapping("/{id}/pedido")
    public void addPedido(@PathVariable("id") int id, @RequestBody Pedido pedido) {

        // Obtenha o solicitante pelo id
        Solicitante solicitante = solicitanteService.findById(id);

        // Adicione o pedido ao solicitante
        //solicitanteService.addPedido(solicitante.getId(), pedido);
    }
*/
}
