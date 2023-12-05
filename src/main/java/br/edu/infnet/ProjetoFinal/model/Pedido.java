package br.edu.infnet.ProjetoFinal.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;


public class Pedido{

    private static int num = 1;
    private String descricao;
    private LocalDate dataInicial;
    private boolean web;
    private ArrayList<Produto> produtos;



public Pedido(boolean web,String descricao,ArrayList<Produto> produtos) {
    this.num = num++;
    this.produtos =  produtos;
    this.dataInicial = dataInicial.now();
    this.descricao = descricao;
    this.web = web;
}


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Pedido.num = num;
    }

    //private final int NUMPEDIDO;


    /*
    public Pedido() {
        super();
        this.num = num++;
    }
*/

}
