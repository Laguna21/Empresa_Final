package empresa;

public interface TipoDeActivo{
	public Integer id = (int) (Math.random()*3000);
	public Integer getId();
	public String getDescripcion();
	public Double getPrecio();
}
