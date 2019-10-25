package empresa;

import java.util.Date;


public class Venta {
	
	private Integer IdVenta;
	private Date Fecha;
	private Integer cantidad;
	private Item itemVendido;
	private Vendedor vendedor;
	
	public Venta(Integer idVenta, Date fecha, Integer cantidad, Item item, Vendedor vendedor) {
		
		IdVenta = idVenta;
		Fecha = fecha;
		this.cantidad = cantidad;
		this.itemVendido = item;
		this.vendedor = vendedor;
	}

	public Integer getIdVenta() {
		return IdVenta;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public Item getItemVendido() {
		return itemVendido;
	}

	public void setItemVendido(Item itemVendido) {
		this.itemVendido = itemVendido;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}
