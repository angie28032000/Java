package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public MaquinaDulces() {
		celda1 = new Celda("A1");
		celda2 = new Celda("A2");
		celda3 = new Celda("A3");
		celda4 = new Celda("A4");
		saldo = 0.0;
	}

	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		celda1.setCodigo(cod1);
		celda2.setCodigo(cod2);
		celda3.setCodigo(cod3);
		celda4.setCodigo(cod4);
	}

	public void mostrarConfiguracion() {
		System.out.println("celda1 : " + celda1.getCodigo());
		System.out.println("celda2 : " + celda2.getCodigo());
		System.out.println("celda3 : " + celda3.getCodigo());
		System.out.println("celda4 : " + celda4.getCodigo());

	}

	public Celda buscarCelda(String codigoCelda) {
		if (celda1.getCodigo().equals(codigoCelda)) {
			return celda1;
		} else if (celda2.getCodigo().equals(codigoCelda)) {
			return celda2;
		} else if (celda3.getCodigo().equals(codigoCelda)) {
			return celda3;
		} else if (celda4.getCodigo().equals(codigoCelda)) {
			return celda4;
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);
		} else {
			System.out.println(" No se encontró la celda con código: " + codigoCelda);
		}

	}

	public void mostrarProductos() {
		System.out.println("===== Productos en la máquina =====");
		mostrarCelda(celda1);
		mostrarCelda(celda2);
		mostrarCelda(celda3);
		mostrarCelda(celda4);
		System.out.println("Saldo actual: $" + saldo);

	}

	private void mostrarCelda(Celda celda) {
		if (celda.getProducto() != null) {
			System.out.println("Celda: " + celda.getCodigo() + " | Producto: " + celda.getProducto().getNombre()
					+ " | Precio: $" + celda.getProducto().getPrecio() + " | Stock: " + celda.getStock());
		} else {
			System.out.println("Celda: " + celda.getCodigo() + " | (vacía)");
		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			return celda.getProducto();
		}
		return null;
	}
	
	public double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getProducto() != null) {
			return celda.getProducto().getPrecio();
		}
		return 0.0;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto))
			return celda1;
		if (celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto))
			return celda2;
		if (celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto))
			return celda3;
		if (celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto))
			return celda4;
		return null;
	}
	
	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
		} else {
			System.out.println("❌ No se encontró el producto con código: " + codigoProducto);
		}
	}
	
	public void vender(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
			celda.setStock(celda.getStock() - 1);
			saldo += celda.getProducto().getPrecio();
			System.out.println("✅ Venta realizada del producto: " + celda.getProducto().getNombre());
		} else {
			System.out.println("❌ No se pudo vender. Celda vacía o sin stock.");
		}
		mostrarProductos();
	}
	
	
	public void venderConCambio(String codigoCelda, double valorIngresado) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
			double precio = celda.getProducto().getPrecio();
			if (valorIngresado >= precio) {
				double cambio = valorIngresado - precio;
				celda.setStock(celda.getStock() - 1);
				saldo += precio;
				System.out.println(" Venta realizada. Cambio a entregar: $" + cambio);
			} else {
				System.out.println(" Dinero insuficiente. Precio: $" + precio);
			}
		} else {
			System.out.println(" Celda vacía o sin stock.");
		}
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
