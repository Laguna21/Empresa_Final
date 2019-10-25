package empresaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.LineNumberInputStream;
import java.util.Date;
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
	/*
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
	*/
}

@Test
public void TestearEmpresa() {
	Empresa lechera = new Empresa("Empresa Lechera!");
	Producto p = new Producto(123, "lava culo", 22d);
	Producto p1 = new Producto(3123, "lava lopi", 24d);
	Producto p2 = new Producto(1523, "lava pp", 23d);
	Servicio s = new Servicio(1238, "arregla pp", 3, 42d);
	Servicio s1 = new Servicio(1263, "arregla cho", 3, 422d);
	Servicio s2 = new Servicio(1323, "arregla gff", 3, 425d);
	Vendedor ven1 = new Vendedor("laguna", "lang", 3d);
	Vendedor ven2 = new Vendedor("nadia", "nad", 2d);
	Vendedor ven3 = new Vendedor("carla", "car", 1d);
	
	Date fecha = new Date(21, 7, 1990);
	Venta v = new Venta(333,fecha , 3, s, ven1);
	Venta v2 = new Venta(3113,fecha , 1, p1, ven2);
	Venta v3 = new Venta(323,fecha , 6, s1, ven2);
	Venta v4 = new Venta(33543,fecha , 5, s2, ven1);
	Venta v5 = new Venta(33553,fecha , 2, s2, ven3);
	
	
		assertTrue(lechera.agregarVendedor(ven1));
		assertTrue(lechera.agregarVendedor(ven2));
		assertTrue(lechera.agregarVendedor(ven3));
		assertTrue(lechera.agregarVenta(v));
		assertTrue(lechera.agregarVenta(v2));
		assertTrue(lechera.agregarVenta(v3));
		assertTrue(lechera.agregarVenta(v4));
		assertTrue(lechera.agregarVenta(v5));
		
		LinkedList<Servicio> listaServicios = new LinkedList<>();
		
		listaServicios = lechera.obtenerListaDeServicios(fecha, ven1);
		
		assertEquals(2, listaServicios.size());
		
		System.out.println(lechera.obtenerComisionDeLosProductosVendidosPorUnVendedor("nadia", "nad"));
		
}

}
