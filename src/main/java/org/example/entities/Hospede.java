package org.example.entities;

import java.text.SimpleDateFormat;
import java.util.*;

public class Hospede extends Pessoas {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataDeNascimento;
    private String endereco;
    private Long numeroDeContato;

    public Hospede(){

    }
    public Hospede(int id){
        super(id);
    }



    public Hospede(int id,String nome, long cpf, Date dataDeNascimento, String endereço, Long numeroDeContate) {
        super(id,nome, cpf);
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereço;
        this.numeroDeContato = numeroDeContate;
    }


    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getNumero() {
        return numeroDeContato;
    }

    public void setNumero(Long numero) {
        this.numeroDeContato = numero;
    }
    public static Boolean verSeHospedeExiste(int id,List<Hospede> hospedeList){

        for(Hospede hospede : hospedeList) {
            if(hospede.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return   "Id: "
                + getId()
                + " - Nome: "
                +getNome()
                +" - CPF: "
                +getCpf()
                +" - Data De Nascimento: "
                +sdf.format(dataDeNascimento)
                +" - Endereço: "
                +endereco
                +" - Número de Contato: "
                +numeroDeContato;
    }
}
