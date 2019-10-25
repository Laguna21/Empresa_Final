package empresa;

public class Producto extends Item{

	private Double precio;
	
	
	public Producto(Integer id, String descripcion, Double precio) {
		super(id, descripcion);
		this.precio = precio;
	}
	
	@Override
	public Double getPrecio() {
		
		return this.precio;
	}

	
	
}
