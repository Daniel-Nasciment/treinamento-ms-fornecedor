package br.com.alura.microservice.fornecedor.request;

public class ReservaRequest {

	public Integer idReserva;
	
	public Integer tempoDePreparo;

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}
	
}
