package com.clearmins;

import java.util.ArrayList;

import com.clearmins.componentes.Celda;
import com.clearmins.componentes.Producto;

public class MaquinaDulces {
	
	private ArrayList<Celda> celdas;
	private double saldo;

	// 🔹 Constructor por defecto
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
		saldo = 0.0;
	}

	// 🔹 Agregar una nueva celda a la máquina
	public void agregarCelda(Celda nuevaCelda) {
		celdas.add(nuevaCelda);
	}


	// 🔹 Mostrar la configuración actual de las celdas
	public void mostrarConfiguracion() {
		System.out.println("===== CONFIGURACIÓN DE LA MÁQUINA =====");
		if (celdas.isEmpty()) {
			System.out.println("No hay celdas configuradas.");
		} else {
			for (Celda celda : celdas) {
				System.out.println("Celda: " + celda.getCodigo());
			}
		}
	}

	// 🔹 Buscar una celda por su código
	public Celda buscarCelda(String codigoCelda) {
		for (Celda celda : celdas) {
			if (celda.getCodigo().equals(codigoCelda)) {
				return celda;
			}
		}
		return null;
	}

	// 🔹 Cargar producto en una celda específica
	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			celda.ingresarProducto(producto, cantidad);
		} else {
			System.out.println("⚠ No existe la celda con código: " + codigoCelda);
		}
	}

	// 🔹 Mostrar todos los productos disponibles
	public void mostrarProductos() {
		System.out.println("===== PRODUCTOS EN LA MÁQUINA =====");
		if (celdas.isEmpty()) {
			System.out.println("No hay celdas configuradas.");
			return;
		}
		for (Celda celda : celdas) {
			if (celda.getProducto() != null) {
				System.out.println("Celda: " + celda.getCodigo() + 
						" | Producto: " + celda.getProducto().getNombre() +
						" | Precio: $" + celda.getProducto().getPrecio() +
						" | Stock: " + celda.getStock());
			} else {
				System.out.println("Celda: " + celda.getCodigo() + " | (Vacía)");
			}
		}
		System.out.println("Saldo actual: $" + saldo);
	}

	// 🔹 Buscar un producto en una celda
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			return celda.getProducto();
		}
		return null;
	}

	// 🔹 Consultar precio del producto en una celda
	public double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getProducto() != null) {
			return celda.getProducto().getPrecio();
		}
		return 0.0;
	}

	// 🔹 Buscar celda que contenga un producto específico
	public Celda buscarCeldaProducto(String codigoProducto) {
		for (Celda celda : celdas) {
			if (celda.getProducto() != null &&
				celda.getProducto().getCodigo().equals(codigoProducto)) {
				return celda;
			}
		}
		return null;
	}
	
	

	// 🔹 Incrementar stock de un producto existente
	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
			System.out.println("✅ Stock actualizado para " + celdaEncontrada.getProducto().getNombre() + 
					": " + celdaEncontrada.getStock());
		} else {
			System.out.println("⚠ No se encontró el producto con código: " + codigoProducto);
		}
	}

	// 🔹 Vender producto sin cambio
	public void vender(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
			celda.setStock(celda.getStock() - 1);
			saldo += celda.getProducto().getPrecio();
			System.out.println("✅ Venta realizada de: " + celda.getProducto().getNombre());
		} else {
			System.out.println("❌ No se pudo realizar la venta (celda vacía o sin stock).");
		}
	}

	// 🔹 Vender producto con cambio
	public double venderConCambio(String codigoCelda, double valorIngresado) {
	    Celda celda = buscarCelda(codigoCelda);

	    if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
	        double precio = celda.getProducto().getPrecio();

	        if (valorIngresado >= precio) {
	            double cambio = valorIngresado - precio;
	            celda.setStock(celda.getStock() - 1);
	            saldo += precio;

	            System.out.println(" Venta realizada de: " + celda.getProducto().getNombre() +
	                    " | Cambio: $" + cambio);

	            return cambio; // ✅ DEVUELVE EL CAMBIO CALCULADO
	        } else {
	            System.out.println(" Dinero insuficiente. Precio del producto: $" + precio);
	            return valorIngresado; // ✅ DEVUELVE EL DINERO SIN CAMBIO
	        }
	    } else {
	        System.out.println(" Celda vacía o sin stock.");
	        return valorIngresado; // ✅ DEVUELVE EL MISMO VALOR PARA EVITAR ERROR
	    }
	}
	
	public void configurarMaquina(String c1, String c2, String c3, String c4) {
	    agregarCelda(new Celda(c1));
	    agregarCelda(new Celda(c2));
	    agregarCelda(new Celda(c3));
	    agregarCelda(new Celda(c4));
	}

	// 🔹 Getters y Setters
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
