package br.edu.infnet.ProjetoFinal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@Builder@AllArgsConstructor@NoArgsConstructor
public class Produto{

    private String nome;
    private float valor;
    private int codigo;

}
