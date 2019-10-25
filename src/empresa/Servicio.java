package empresa;

public class Servicio extends Item{

	private Integer cantHoras;
	private Double precioHora;
	
	public Servicio(Long id, String descripcion, Integer cantHoras,
			Double precioHora) {
		super(id, descripcion);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	public Integer getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(Integer cantHoras) {
		this.cantHoras = cantHoras;
	}

	public Double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(Double precioHora) {
		this.precioHora = precioHora;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.precioHora * this.cantHoras;
	}
	
	
}
