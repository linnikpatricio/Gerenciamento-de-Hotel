package org.example.entities.opcoes;

public class Opcoes {

    public void opcoes(){
        System.out.println("1. Gerenciamento de Quartos");
        System.out.println("2. Gerenciamento de Hóspedes");
        System.out.println("3. Gerenciamento de Reservas");
        System.out.println("4. Gerenciamento de Funcionários");
        System.out.println("5. Sair");
    }

    public void opcoesQuartos(){
        System.out.println("1. Cadastrar Quartos");
        System.out.println("2. Visualizar Quartos Disponiveis");
        System.out.println("3. Visualizar todos os Quartos");
        System.out.println("4. Atualizar Status do Quarto");
        System.out.println("5. Voltar");
    }
    public void opcoesHospedes(){
        System.out.println("1. Cadastrar Hóspedes");
        System.out.println("2. Visualizar Histórico");
        System.out.println("3. Editar informações do Hóspede");
        System.out.println("4. Voltar");
    }
    public void opcoesReserva(){
        System.out.println("1. Criar Reserva");
        System.out.println("2. Cancelar Reservas e Atualizar a Disponibilidade do Quarto");
        System.out.println("3. Visualizar Reserva");
        System.out.println("4. Voltar");
    }
    public void opcoesFuncionario(){
        System.out.println("1. Cadastrar Funcionário");
        System.out.println("2. Visualizar Funcionário");
        System.out.println("3. Editar Informações");
        System.out.println("4. Registrar Horas de Trabalho");
        System.out.println("5. Voltar");
    }

}
