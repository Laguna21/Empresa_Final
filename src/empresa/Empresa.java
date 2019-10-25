package empresa;

import java.util.Date;
import java.util.LinkedList;

public class Empresa {
	
	private String nom;
	private LinkedList<Venta>listaVentas;
	private LinkedList<Vendedor>listaVendedores;
	
	public Empresa(String nom) {
		
		this.nom = nom;
		this.listaVentas = new LinkedList();
		this.listaVendedores = new LinkedList();
	}

public boolean agregarVendedor(Vendedor nuevoVendedor) {
	if (!this.listaVendedores.contains(nuevoVendedor)) {
		this.listaVendedores.add(nuevoVendedor);
		return true;
	}else {
		return false;
	}
}
public boolean agregarVenta(Venta nuevoVenta) {
	if (!this.listaVentas.contains(nuevoVenta)) {
		this.listaVentas.add(nuevoVenta);
		return true;
	}else {
		return false;
	}
}
public Double obtenerComisionDeLosProductosVendidosPorUnVendedor(String nom, String ape) {
	Double tot = 0d;
	for (Venta venta : listaVentas) {
		if (venta.getVendedor().getApe().equals(ape) && venta.getVendedor().getNom().equals(nom) && venta.getItemVendido() instanceof Producto) {
			tot += venta.getVendedor().getPorComision();
		}
	}
	return tot;
}
public LinkedList<Venta> obtenerListaDeServicios(Date fecha, Vendedor vendedor) {
	LinkedList<Venta> listaServicios = new LinkedList();
	for (Venta venta : listaVentas) {
		if (venta.getItemVendido() instanceof Servicio 
				&& venta.getFecha().equals(fecha) 
				&& venta.getVendedor().equals(vendedor)) 
		{
			listaServicios.add(venta);
		}
	}
	return listaServicios;
}

}
