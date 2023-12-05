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
public class SolicitanteService {

@Autowired
    PedidoService pedidoService;
    Map<Integer, Solicitante> solicitantes = startSolicitacao();

 private static int id = 3;

    public Map<Integer, Solicitante> startSolicitacao(){



        Produto produto1 = new Produto("produto1",10.0f,1);
        Produto produto2 = new Produto("produto2",10.0f,1);
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Produto> produtos2 = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        Pedido pedido1 = new Pedido(true,"Pedido 1",produtos);
        Pedido pedido2 = new Pedido(true,"Pedido 2",produtos);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        Solicitante s1 = new Solicitante(1,"Jones","11111111","jones@Teste1.com");
        s1.setPedidos(pedidos);

        //pedidoService.create();
        Solicitante s2 = new Solicitante(2,"Marcos","222222222222222","Marcos@Teste2.com");
        Map<Integer, Solicitante> Solicitante = new HashMap<>();
        Solicitante.put(1,s1);
        Solicitante.put(2,s2);
        return Solicitante;
    }
public List<Solicitante> getAll(){
       return solicitantes.values().stream().toList();
}

public void update(int id,Solicitante atualizaSolicitante){

        solicitantes.replace(id,atualizaSolicitante);

}
/*
    public void update(Integer id, Solicitante atualizaSolicitante) {

        for (Map.Entry<Integer, Solicitante> entrada : solicitantes.entrySet()) {
            Solicitante solicitanteExistente = entrada.getValue();

            if (solicitanteExistente.getCpf().equals(atualizaSolicitante.getCpf())) {
                // Encontrou o solicitante pelo CPF
                solicitantes.replace(entrada.getKey(), atualizaSolicitante);
                return; // Sai do loop após encontrar o solicitante
            }
        }

        // Não encontrou o solicitante pelo CPF
        // ... (tratamento para solicitante não encontrado)
    }
*/
    public void delete(Integer id){

        solicitantes.remove(id);
    }

    public void create(Solicitante solicitante){

        //Solicitante solicitante = new Solicitante();

        solicitante.setId(id);
      solicitantes.put(id,solicitante);
        id++;
    }

    public Solicitante findById(int id) {

        for (Solicitante solicitante : solicitantes.values()) {
            if (solicitante.getId() == id) {
                return solicitante;
            }
        }

        return null;
    }


}
