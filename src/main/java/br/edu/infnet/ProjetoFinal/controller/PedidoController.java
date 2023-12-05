package br.edu.infnet.ProjetoFinal.controller;

import br.edu.infnet.ProjetoFinal.model.Pedido;
import br.edu.infnet.ProjetoFinal.model.Produto;
import br.edu.infnet.ProjetoFinal.model.Solicitante;
import br.edu.infnet.ProjetoFinal.services.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Pedido")
public class PedidoController {
    @Autowired
    PedidoService pedidoService;

    Logger logger = LoggerFactory.getLogger(PedidoController.class);
@GetMapping
    public List<ArrayList<Pedido>> findAll() {
        logger.info("Metodo findAll iniciado");
        List<ArrayList<Pedido>> pedido = pedidoService.findAll();
        return pedido;
    }
@DeleteMapping
    public void delete() {
        logger.info("Metodo delete iniciado");

        pedidoService.delete(2);
    }
@PostMapping
    public void create(@RequestBody Produto produto, Solicitante solicitante) {

        logger.info("Metodo create iniciado");
     //   pedidoService.create(pedido);

    }
@PutMapping
    public void update() {
        logger.info("Metodo update iniciado");
    }

}
