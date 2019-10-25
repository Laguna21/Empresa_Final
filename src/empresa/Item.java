package empresa;

public abstract class Item {

	private Integer id;
	private String descripcion;
	
	
	public Item(Integer id, String descripcion) {
		
		this.id = id;
		this.descripcion = descripcion;
	}


	public Integer getId() {
		return this.id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescripcion() {
		return this.descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract Double getPrecio();
	
	
}
