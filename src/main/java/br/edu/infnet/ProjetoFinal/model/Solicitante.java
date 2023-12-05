package br.edu.infnet.ProjetoFinal.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data@Builder@AllArgsConstructor
public class Solicitante {

    private  int id;
    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Pedido> pedidos;


    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Solicitante(){

    }


    public  Solicitante(int id,String nome,String cpf,String email) {
        this.id=id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public  Solicitante(String nome,String cpf,String email) {

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        id++;
    }


    public void setId(int id){
        this.id = id;
    }


}
