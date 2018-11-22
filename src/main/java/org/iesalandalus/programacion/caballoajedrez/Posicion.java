package org.iesalandalus.programacion.caballoajedrez;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
		if (posicion == null) {
			throw new IllegalArgumentException("ERROR: No es posible copiar una posición nula.");
		}else {
		
			this.fila=posicion.getFila();
			this.columna=posicion.getColumna();
		}
	}
	
	public int getFila() {
		return fila;
	}

	
	public void setFila(int fila) {

		if (fila<1 || fila>8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
			}else {
				this.fila=fila;
			}
	}

	
	public char getColumna() {
		return columna;
	}

	
	public void setColumna(char columna) {

		if (columna<'a' || columna>'h') {
		throw new IllegalArgumentException("ERROR: Columna no válida.");
		}else {
			this.columna=columna;
		}
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}

	
	public String toString() {
		return "[fila="+fila+", columna="+columna+"]";
	}
	
	
}
