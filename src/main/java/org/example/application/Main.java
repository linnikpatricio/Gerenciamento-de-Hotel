package org.example.application;

import org.example.entities.*;
import org.example.entities.opcoes.Opcoes;
import org.example.entities.enums.StatusDoQuarto;
import org.example.entities.enums.TipoDeQuarto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Opcoes opcoes = new Opcoes();
        List<GerenciamentoDeReserva> listGdr = new ArrayList<>();
        List<Quarto> listQuarto = new ArrayList<>();
        List<Hospede> listHospede = new ArrayList<>();
        List<Funcionario> listFuncionario = new ArrayList<>();
        Date date1;
        Date date2;



        int opcao = 0;

        while(opcao != 5) {
            opcoes.opcoes();
            System.out.print("Escolha uma Opção: ");
            opcao = sc.nextInt();

            if(opcao == 1) {
                int subOption = 0;
                while (subOption != 5) {
                    opcoes.opcoesQuartos();
                    System.out.print("Escolha uma opção: ");
                    subOption = sc.nextInt();
                    
                    if(subOption == 1) {
                        System.out.println("Quantos quartos serão cadastrados? ");
                        int n = sc.nextInt();

                        for (int i = 1; i <= n; i++) {

                            System.out.print("Numero Do Quarto: ");
                            int numero = sc.nextInt();
                            System.out.print("Tipo de Quarto: ");
                            sc.nextLine();
                            String tipoDeQuarto = sc.nextLine();
                            System.out.print("Capacidade do Quarto: ");
                            int capacidade = sc.nextInt();
                            System.out.print("Preço do Quarto: ");
                            double preco = sc.nextDouble();

                            listQuarto.add(new Quarto(numero, TipoDeQuarto.valueOf(tipoDeQuarto.toUpperCase()),capacidade,preco,StatusDoQuarto.DISPONIVEL));
                            System.out.println();
                            System.out.println("Quarto cadastrado com sucesso!");
                            System.out.println();
                        }
                        
                    } else if (subOption == 2) {
                        System.out.println();
                        for (Quarto quart : listQuarto) {
                            if(quart.getStatusDoQuarto() == StatusDoQuarto.DISPONIVEL) {
                                System.out.println(quart);
                            }else {
                                System.out.println("Não existe quartos disponiveis!");
                            }
                        }
                        System.out.println();

                    } else if (subOption == 3) {
                        for (Quarto quarto : listQuarto) {
                            System.out.println(quarto);
                        }


                    } else if (subOption == 4) {
                        System.out.println("Digite o numero do quarto: ");
                        int n = sc.nextInt();
                        for(Quarto quarto1 : listQuarto) {
                            if(quarto1.getNumeroDoQuarto() == n) {

                                System.out.print("Atualize o status do Quarto: ");
                                String statusAtualizado = sc.next();
                                quarto1.setStatusDoQuarto(StatusDoQuarto.valueOf(statusAtualizado.toUpperCase()));
                                System.out.println("Status atualizado com sucesso!");

                            } else {
                                System.out.println("Não existe quarto com esse numero! ");
                            }
                        }

                    }else if (subOption == 5) {
                        System.out.println();
                        System.out.println("Voltando ao Menu");
                        System.out.println();

                    }else {
                        System.out.println();
                        System.out.println("Opção Inválida, Por favor insira uma opção válida");
                        System.out.println();
                    }


                }
                
            } else if (opcao == 2) {
                int subOption = 0;
                while (subOption != 4) {
                    opcoes.opcoesHospedes();
                    System.out.println("Escolha uma opção: ");
                    subOption = sc.nextInt();

                    if(subOption == 1) {
                        System.out.println("Quantos Hóspedes serão cadastrados? ");
                        int n = sc.nextInt();

                        for (int i = 1; i <= n; i++) {
                            System.out.print("Id: ");
                            int id = sc.nextInt();
                            System.out.print("Nome: ");
                            sc.nextLine();
                            String nome = sc.nextLine();
                            System.out.print("CPF: ");
                            Long cpf = sc.nextLong();
                            System.out.print("Data de Nascimento: ");
                            Date dataDenascimento = sdf.parse(sc.next());
                            System.out.print("Endereço: ");
                            sc.nextLine();
                            String endereco = sc.nextLine();
                            System.out.print("Numero de Contato: ");
                            Long numeroDeContato = sc.nextLong();

                            listHospede.add(new Hospede(id,nome,cpf,dataDenascimento,endereco,numeroDeContato));

                            System.out.println();
                            System.out.println("Hóspede cadastrado com sucesso!");
                            System.out.println();

                        }

                    } else if (subOption == 2) {
                        for(Hospede hospede1 : listHospede) {
                            System.out.println(hospede1);
                        }



                    } else if (subOption == 3) {
                        System.out.println("Editar Informações do Hóspede");
                        System.out.println("Digite o Id: ");
                        int id = sc.nextInt();
                        System.out.print("Novo Nome: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.print("Novo Cpf: ");
                        long cpf = sc.nextLong();
                        System.out.print("Data de Nascimento (DD/MM/YYYY): ");
                        Date dataDenascimento = sdf.parse(sc.next());
                        System.out.print("Novo Endereço: ");
                        sc.nextLine();
                        String endereco = sc.nextLine();
                        System.out.print("Numero de Contato: ");
                        long numeroDeContato = sc.nextLong();

                        Hospede hospede2 = new Hospede(id,nome,cpf,dataDenascimento,endereco,numeroDeContato);

                        for(Hospede hospede1 : listHospede) {
                            if(hospede1.getId() == id) {
                                hospede1.setNome(hospede2.getNome());
                                hospede1.setCpf(hospede2.getCpf());
                                hospede1.setDataDeNascimento(hospede2.getDataDeNascimento());
                                hospede1.setEndereco(hospede2.getNome());
                                hospede1.setNumero(hospede2.getNumero());

                            }

                        }


                    } else if (subOption == 4) {
                        System.out.println();
                        System.out.println("Voltando ao Menu");
                        System.out.println();

                    }else {
                        System.out.println();
                        System.out.println("Opcão Inválida, Por favor insira uma opção válida");
                        System.out.println();
                    }


                }


            } else if (opcao == 3) {
                int subOption = 0;
                while (subOption != 5) {
                    opcoes.opcoesReserva();
                    System.out.println("Digite uma opção: ");
                    subOption = sc.nextInt();

                    if(subOption == 1){
                        System.out.println("Quantas reservas serão cadastradas? ");
                        int n = sc.nextInt();

                        for (int i = 1; i <= n; i++) {
                            System.out.print("Id: ");
                            int id = sc.nextInt();
                            System.out.print("Data de entrada (DD/MM/YYYY) : ");
                            date1 = sdf.parse(sc.next());
                            System.out.print("Data de Saída (DD/MM/YYYY) : ");
                            date2 = sdf.parse(sc.next());
                            while (date1.after(date2)) {
                                System.out.println("A data de entrada tem que ser anterior a data de saída!");
                                System.out.println();
                                System.out.print("Data de entrada (DD/MM/YYYY) : ");
                                date1 = sdf.parse(sc.next());
                                System.out.print("Data de Saída (DD/MM/YYYY) : ");
                                date2 = sdf.parse(sc.next());
                            }

                            System.out.print("Insira o tipo de Quarto: ");
                            sc.nextLine();
                            String tipoQuarto = sc.nextLine();
                            while (!Quarto.verSeTipoExiste(TipoDeQuarto.valueOf(tipoQuarto.toUpperCase()),listQuarto)) {
                                System.out.print("Tipo de quarto inválido!, por favor insira um tipo de quarto válido: ");
                                tipoQuarto = sc.nextLine();
                            }

                            System.out.print("Insira o id do Hospede: ");
                            int idHospede = sc.nextInt();
                            while (!Hospede.verSeHospedeExiste(idHospede,listHospede)) {
                                System.out.print("Id de hospede inválido!, por favor insira um id válido: ");
                                idHospede = sc.nextInt();
                            }


                            System.out.print("Insira o numero do quarto: ");
                            int numeroDoQuarto = sc.nextInt();
                            while(!Quarto.verSeNumeroDeQuartoExiste(numeroDoQuarto,listQuarto)){
                                System.out.print("Número de quarto inválido!, por favor insira um numero de quarto válido: ");
                                numeroDoQuarto = sc.nextInt();
                            }


                            System.out.print("Numero de Hóspedes: ");
                            int quantidadeDeHospedes = sc.nextInt();

                            SaidaEntrada saidaEntrada = new SaidaEntrada(date1,date2);
                            Quarto quarto = new Quarto(numeroDoQuarto);
                            Hospede hospede = new Hospede(id);
                            GerenciamentoDeReserva obj = new GerenciamentoDeReserva(id,saidaEntrada,TipoDeQuarto.valueOf(tipoQuarto.toUpperCase()),quantidadeDeHospedes,quarto,hospede);
                            listGdr.add(obj);
                            System.out.println();
                            System.out.println("Reserva adicionada com sucesso! ");
                            System.out.println();

                        }


                    } else if (subOption == 2) {
                        System.out.print("Insira o id da reserva que será removida: ");
                        int n = sc.nextInt();
                        for (int i = 0; i < listGdr.size(); i++) {
                            GerenciamentoDeReserva gdr = listGdr.get(i);
                            if(gdr.getId() == n) {
                                gdr.getQuarto().setStatusDoQuarto(StatusDoQuarto.DISPONIVEL);
                                listGdr.remove(i);
                                System.out.println("Reserva removida com sucesso!");
                                break;

                            }else {
                                System.out.println("Essa reserva não existe!");
                            }
                        }





                    } else if (subOption == 3) {

                    } else if (subOption == 4) {

                    } else if (subOption == 5) {
                        System.out.println();
                        System.out.println("Voltando ao Menu");
                        System.out.println();
                    }else {
                        System.out.println("Opção Inválida, por favor insira uma opção válida! ");
                    }


                }
            } else if (opcao == 4) {
                int subOption = 0;
                while (subOption != 5) {
                    opcoes.opcoesFuncionario();
                    System.out.println("Digite uma opção: ");
                    subOption = sc.nextInt();

                    if(subOption == 1) {
                        System.out.print("Quantos funcionários serão cadastrados? ");
                        int n = sc.nextInt();

                        for (int i = 0; i < n; i++) {
                            System.out.print("Id: ");
                            int id = sc.nextInt();
                            System.out.print("Nome: ");
                            sc.nextLine();
                            String nome = sc.nextLine();
                            System.out.print("Cpf: ");
                            Long cpf = sc.nextLong();
                            System.out.print("Cargo: ");
                            sc.nextLine();
                            String cargo = sc.nextLine();
                            System.out.print("Turno de Trabalho: ");
                            String turno = sc.nextLine();

                            listFuncionario.add(new Funcionario(id,nome,cpf,cargo,turno));
                            System.out.println();
                            System.out.println("Funcionário Cadastrado com Sucesso!");
                            System.out.println();

                        }




                    } else if (subOption == 2) {
                        for(Funcionario funcionario1 : listFuncionario) {
                            System.out.println(funcionario1);
                        }

                    } else if (subOption == 3) {
                        System.out.println("Editar Informações");
                        System.out.print("Id: ");
                        int id = sc.nextInt();
                        System.out.print("Novo Nome: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.print("Novo Cpf: ");
                        Long cpf = sc.nextLong();
                        System.out.print("Novo Cargo: ");
                        sc.nextLine();
                        String cargo = sc.nextLine();
                        System.out.print("Novo Turno de Trabalho: ");
                        sc.nextLine();
                        String turno = sc.nextLine();

                        Funcionario funcionario = new Funcionario(id,nome,cpf,cargo,turno);


                        for (Funcionario funcionario1 : listFuncionario) {
                            if(funcionario1.getId() == id) {
                                funcionario1.setId(funcionario.getId());
                                funcionario1.setNome(funcionario.getNome());
                                funcionario1.setCpf(funcionario.getCpf());
                                funcionario1.setCargo(funcionario.getCargo());
                                funcionario1.setTurno(funcionario.getTurno());

                            }else {
                                System.out.println("Não existe funcionário com esse id!");
                            }
                        }


                    } else if (subOption == 4) {
                        System.out.print("Insira o id do funcionario: ");
                        int id = sc.nextInt();
                        System.out.print("Quantas horas de trabalho? ");
                        int horas = sc.nextInt();
                        System.out.print("Valor por Hora: ");
                        double valorHora = sc.nextDouble();

                        double salario = horas * valorHora;

                        Funcionario funcionario =  new Funcionario(salario);

                        for (Funcionario funcionario1 : listFuncionario) {
                            if(funcionario1.getId() == id) {
                                funcionario1.setSalario(funcionario.getSalario());
                            }else {
                                System.out.println("Não existe funcionário com esse id!");
                            }
                        }


                    }else if (subOption == 5){
                        System.out.println();
                        System.out.println("Voltando ao Menu");
                        System.out.println();

                    }else {
                        System.out.println("Opção Inválida, por favor insira uma opção válida! ");
                    }

                }

            } else if (opcao == 5) {
                System.out.println();
                System.out.println("Saindo do Programa...");

            }else {
                System.out.println();
                System.out.println("Opção inválida! Por favor digite uma opção válida.");
                System.out.println();
            }
        }
        sc.close();
    }
}