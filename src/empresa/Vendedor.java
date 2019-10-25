package empresa;

import java.util.LinkedList;

public class Vendedor {

	private String nom;
	private String ape;
	private Double porComision;
	private LinkedList<Venta> listaVentasRealizadas;
	
	
	public Vendedor(String nom, String ape, Double porComision) {
		
		this.nom = nom;
		this.ape = ape;
		this.porComision = porComision;
		this.listaVentasRealizadas = new LinkedList();
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getApe() {
		return ape;
	}


	public void setApe(String ape) {
		this.ape = ape;
	}


	public Double getPorComision() {
		return porComision;
	}


	public void setPorComision(Double porComision) {
		this.porComision = porComision;
	}
	
	
}
