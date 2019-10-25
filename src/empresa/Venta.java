package empresa;

import java.util.Date;
import java.util.LinkedList;

public class Venta {
	
	private Long IdVenta;
	private Date Fecha;
	private Integer cantidad;
	private Item itemVendido;
	
	public Venta(Long idVenta, Date fecha, Integer cantidad, Item item) {
		
		IdVenta = idVenta;
		Fecha = fecha;
		this.cantidad = cantidad;
		this.itemVendido = item;
	}

	public Long getIdVenta() {
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
	

	
	
	

}
