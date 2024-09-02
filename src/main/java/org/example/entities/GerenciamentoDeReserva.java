package org.example.entities;

import org.example.entities.enums.StatusDoQuarto;
import org.example.entities.enums.TipoDeQuarto;

import java.text.SimpleDateFormat;
import java.util.List;

public class GerenciamentoDeReserva {
    private static SimpleDateFormat sdf = new SimpleDateFormat();
    private int id;
    private SaidaEntrada saidaEntrada;
    private TipoDeQuarto tipoDeQuarto;
    private Integer numeroDeHospedes;
    private Quarto quarto;
    private Hospede hospede;

    public GerenciamentoDeReserva(){

    }

    public GerenciamentoDeReserva(int id, SaidaEntrada saidaEntrada, TipoDeQuarto tipoDeQuarto, Integer numeroDeHospedes, Quarto quarto, Hospede hospede) {
        this.id = id;
        this.saidaEntrada = saidaEntrada;
        this.tipoDeQuarto = tipoDeQuarto;
        this.numeroDeHospedes = numeroDeHospedes;
        this.quarto = quarto;
        this.hospede = hospede;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SaidaEntrada getSaidaEntrada() {
        return saidaEntrada;
    }

    public void setSaidaEntrada(SaidaEntrada saidaEntrada) {
        this.saidaEntrada = saidaEntrada;
    }

    public TipoDeQuarto getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(TipoDeQuarto tipoDeQuarto) {
        this.tipoDeQuarto = tipoDeQuarto;
    }

    public Integer getNumeroDeHospedes() {
        return numeroDeHospedes;
    }

    public void setNumeroDeHospedes(Integer numeroDeHospedes) {
        this.numeroDeHospedes = numeroDeHospedes;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    @Override
    public String toString() {
        return "Reserva: " +
                " Id: " + id +
                " - CheckIn: " + sdf.format(saidaEntrada.getCheckIn()) + " - CheckOut: " + sdf.format(saidaEntrada.getCheckOut()) +
                " - Tipo de Quarto: " + tipoDeQuarto +
                " - Quantidade de Hóspedes: " + numeroDeHospedes +
                " - Número do Quarto: " + quarto.getNumeroDoQuarto() +
                " - Id do Hóspede: " + hospede.getId();
    }

	public static void removerReserva(int id, List<GerenciamentoDeReserva> reservaList, List<Quarto> listQuarto) {
		 for (GerenciamentoDeReserva reserva : reservaList) {
	            if (reserva.getId() == id) {
	                reservaList.remove(reserva);
	                Quarto.atualizarStatusQuarto(reserva.getQuarto().getNumeroDoQuarto(), listQuarto);
	                System.out.println("Reserva removida com sucesso! ");
	                break;
	            }
	            else {
	            	System.out.println("Reserva não existe!");
	            }
	        }
		
	}

}
