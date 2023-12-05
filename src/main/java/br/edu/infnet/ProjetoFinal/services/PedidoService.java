package br.edu.infnet.ProjetoFinal.services;

import br.edu.infnet.ProjetoFinal.model.Pedido;
import br.edu.infnet.ProjetoFinal.model.Produto;
import br.edu.infnet.ProjetoFinal.model.Solicitante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PedidoService {

    private static int num;

    SolicitanteService solicitanteService;
    Map<Integer, ArrayList<Pedido>> pedidos = startPedido();

    Map<Integer, ArrayList<Pedido>> startPedido() {

        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("produto1",10.0f,1);


        produtos.add(produto1);


        Pedido pedido1 = new Pedido(true,"Pedido 1",produtos);
        //Solicitante s1 = new Solicitante(1,"Jones","11111111","jones@Teste1.com");
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);


        Map<Integer, ArrayList<Pedido>> listaPedido = new HashMap<>();
        listaPedido.put(0,pedidos);

        return listaPedido;
    }


    public List<ArrayList<Pedido>> findAll() {

    return pedidos.values().stream().toList();
    }


    public void delete(int num) {

        pedidos.remove(num);
    }


    public void create(Produto produto, Solicitante atualizaPedidoSolicitante) {

        SolicitanteService solicitanteService = new SolicitanteService();
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("produto1",10.0f,1);


        produtos.add(produto1);


        Pedido pedido1 = new Pedido(true,"Pedido 1",produtos);
        //Solicitante s1 = new Solicitante(1,"Jones","11111111","jones@Teste1.com");
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);


        Map<Integer, ArrayList<Pedido>> listaPedido = new HashMap<>();
        listaPedido.put(0,pedidos);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto);
        atualizaPedidoSolicitante.setPedidos(pedidos);
        solicitanteService.update(2,atualizaPedidoSolicitante);



     //   ArrayList<Pedido> listaDePedidos = new ArrayList<>();
        //listaDePedidos.setPedidos(listaDeProdutos);

       // pedidos.put(num, listaDePedidos);


        num++;

    }


    public void update(int num,Pedido pedidoAtualizado) {

       // pedidos.replace(num,pedidoAtualizado);

    }

}
