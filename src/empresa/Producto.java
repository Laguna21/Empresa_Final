package empresa;

public class Producto extends Item{

	private Double precio;
	
	
	public Producto(Long id, String descripcion, Double precio, String descripcion2) {
		super(id, descripcion);
		this.precio = precio;
	}
	
	@Override
	public Double getPrecio() {
		
		return this.precio;
	}

	
	
}
