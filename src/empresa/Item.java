package empresa;

public abstract class Item {

	private Long id;
	private String descripcion;
	
	
	public Item(Long id, String descripcion) {
		
		this.id = id;
		this.descripcion = descripcion;
	}


	public Long getId() {
		return this.id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescripcion() {
		return this.descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
