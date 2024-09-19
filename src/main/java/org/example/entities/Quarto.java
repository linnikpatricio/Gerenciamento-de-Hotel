package org.example.entities;

import org.example.entities.enums.StatusDoQuarto;
import org.example.entities.enums.TipoDeQuarto;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Quarto {
    private Integer numeroDoQuarto;
    private TipoDeQuarto tipoDeQuarto;
    private Integer capacidade;
    private Double preco;
    private StatusDoQuarto statusDoQuarto;

    public Quarto(){

    }
    public Quarto(int numeroDoQuarto){
        this.numeroDoQuarto = numeroDoQuarto;

    }

    public Quarto(Integer numeroDoQuarto, TipoDeQuarto tipoDeQuarto, Integer capacidade, Double preco, StatusDoQuarto statusDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
        this.tipoDeQuarto = tipoDeQuarto;
        this.capacidade = capacidade;
        this.preco = preco;
        this.statusDoQuarto = statusDoQuarto;
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(Integer numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public TipoDeQuarto getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(TipoDeQuarto tipoDeQuarto) {
        this.tipoDeQuarto = tipoDeQuarto;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public StatusDoQuarto getStatusDoQuarto() {
        return statusDoQuarto;
    }

    public void setStatusDoQuarto(StatusDoQuarto statusDoQuarto) {
        this.statusDoQuarto = statusDoQuarto;
    }

    public static Boolean verSeNumeroDeQuartoExiste(int numeroQuarto, List<Quarto> listaQuarto) {

        for(Quarto quarto : listaQuarto){
            if(quarto.getNumeroDoQuarto() == numeroQuarto){
                quarto.setStatusDoQuarto(StatusDoQuarto.OCUPADO);
                return true;
            }
        }
        return false;
    }
    public static Boolean verSeTipoExiste(TipoDeQuarto tipoDeQuarto,List<Quarto> quartoList) {

        for(Quarto quarto : quartoList) {
            if(quarto.getTipoDeQuarto() == tipoDeQuarto) {
                return true;
            }
        }
        return false;
    }
    public static Boolean verSeNumeroDeQuartoExiste2(int id,List<Quarto> quartoList) {
        for (Quarto quarto : quartoList) {
            if(quarto.getNumeroDoQuarto() == id) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Numero: "
                +numeroDoQuarto
                +" - Tipo: "
                +tipoDeQuarto
                +" - Capacidade: "
                +capacidade
                +" - Preço: "
                +preco
                +" - Status: "
                +statusDoQuarto;
    }
	public static void atualizarStatusQuarto(int numeroDoQuarto, List<Quarto> listQuarto) {
		for(Quarto quarto: listQuarto) {
    		if(numeroDoQuarto == quarto.getNumeroDoQuarto()) {
    			quarto.setStatusDoQuarto(StatusDoQuarto.DISPONIVEL);
    		}
    	}
		
	}

}
