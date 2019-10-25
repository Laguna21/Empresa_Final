package empresaTest;

import java.util.LinkedList;

import org.junit.Test;

import empresa.*;

public class EmpresaTest {
@Test
public void probarEmpresa()
{
	LinkedList<Item> listaItems = new LinkedList<>();
	Producto p = new Producto(123, "lava culo", 22d);
	Producto p1 = new Producto(3123, "lava lopi", 24d);
	Producto p2 = new Producto(1523, "lava pp", 23d);
	Servicio s = new Servicio(1238, "arregla pp", 3, 42d);
	Servicio s1 = new Servicio(1263, "arregla cho", 3, 422d);
	Servicio s2 = new Servicio(1323, "arregla gff", 3, 425d);
	
	listaItems.add(p);
	listaItems.add(p1);
	listaItems.add(p2);
	listaItems.add(s);
	listaItems.add(s1);
	listaItems.add(s2);
	int contSer = 0;
	LinkedList<Servicio> listaServicios = new LinkedList<>();
	for (Item item : listaItems) {
		if (item instanceof Servicio) {
			contSer++;
			listaServicios.add((Servicio) item);
		}
	}
	
		System.out.println("Cantidad de servicios: " + contSer + ". Lista: ");
	for (Servicio servicio : listaServicios) {
		System.out.println(servicio.getPrecio());
	}
		
	
	
}
}
