package org.example.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoas {
    private String cargo;
    private Double salario = 0.0;
    private String turno;

    private Scanner sc = new Scanner(System.in);

    public Funcionario(){

    }
    public Funcionario(Double salario){
        this.salario = salario;
    }

    public Funcionario(int id,String nome, long cpf, String cargo, String turno) {
        super(id,nome,cpf);
        this.cargo = cargo;
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public static Boolean verSeFuncionarioExiste(int id,List<Funcionario>list) {
        for (Funcionario funcionario : list) {
            if(funcionario.getId() == id) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Id: " + getId()
                +" - Nome: " + getNome()
                +" - Cpf: " + getCpf()
                +" - Cargo: " + getCargo()
                +" - Sálario: " + String.format("%.2f",getSalario())
                +" - Turno: " + getTurno();

    }
}
