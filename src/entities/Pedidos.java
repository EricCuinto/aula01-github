package entities;

import java.util.Date;

import entities.enums.OrdemStatus;

public class Pedidos {

	private Integer id;
	private Date instante;
	private OrdemStatus status;

	public Pedidos() {

	}

	public Pedidos(Integer id, Date instante, OrdemStatus status) {
		this.id = id;
		this.instante = instante;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", instante=" + instante + ", status=" + status + "]";
	}
	
	

}
