package org.iesalandalus.programacion.caballoajedrez;

public class Caballo {
	
	private Color color;
	private Posicion posicion;
	
	public Caballo() {
		
		this.color=color.NEGRO;
		this.posicion=new Posicion(8,'b');	
	}
	
	public Caballo(Color color) {
		color=color.BLANCO;
		if (color==color.BLANCO) {
			this.posicion=new Posicion(1,'b');
		}else
			this.posicion=new Posicion(8,'b');
	}
	
	public Caballo(Color color,char columna) {
		color=color.BLANCO;
		
		if(columna=='b' || columna =='g') {	
				if(color==color.BLANCO) {
					this.posicion=new Posicion(1,columna);
				}else {
					this.posicion=new Posicion(8,columna);
				}
					
			}else {
				throw new IllegalArgumentException("la columna no es la inicial");
			}
	}
	public Caballo(Caballo caballo) {
		this.color=caballo.color;
		this.posicion=caballo.posicion;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Posicion getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	

}
