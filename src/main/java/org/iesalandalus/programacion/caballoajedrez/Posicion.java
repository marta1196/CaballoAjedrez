package org.iesalandalus.programacion.caballoajedrez;

public class Posicion {
	
	private int fila;
	private char columna;
	

	public Posicion() {
	
	}
	
	public Posicion(int fila,char columna) {
		
		if (fila<1 || fila>8) {
			throw new IllegalArgumentException("la fila no existe");
			}else {
				this.fila=fila;
			}
			if (columna< 'a'|| columna>'h') {
				throw new IllegalArgumentException("la columna no existe");
			}else {
				this.columna=columna;
			}
	}
	
	public Posicion(Posicion posicion) {
		
		this.fila=posicion.fila;
		this.columna=posicion.columna;
	}
	
	public int getFila() {
		return fila;
	}

	
	public void setFila(int fila) {
		if (fila<1 || fila>8) {
			throw new IllegalArgumentException("la fila no existe");
			}else {
				this.fila=fila;
			}
	}

	
	public char getColumna() {
		return columna;
	}

	
	public void setColumna(char columna) {

		if (columna<'a' || columna>'h') {
		throw new IllegalArgumentException("la columna no existe");
		}else {
			this.columna=columna;
		}
	}
	
}
