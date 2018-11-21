package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

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
	
	
	public void mover(Direccion direccion) throws OperationNotSupportedException {
		switch (direccion) {
		
		case ARRIBA_IZQUIERDA:
				if (this.posicion.getFila() >= 1 && this.posicion.getFila() < 8 && this.posicion.getColumna() >= 'a' && this.posicion.getColumna() <'h') {
					this.posicion.setFila(this.posicion.getFila() + 2);
					this.posicion.setColumna((char)(this.posicion.getColumna() - 1));
				}else {
				throw new OperationNotSupportedException("no se puede mover arriba a la izquierda");
			}
			break;
		
		case ARRIBA_DERECHA:
			if (this.posicion.getFila() >= 1 && this.posicion.getFila() < 8 && this.posicion.getColumna() >= 'a' && this.posicion.getColumna() <'h') {
				this.posicion.setFila(this.posicion.getFila() + 2);
				this.posicion.setColumna((char)(this.posicion.getColumna() + 1));
			} else {
				throw new OperationNotSupportedException("no se puede mover arriba a la derecha");
			}
			break;
		case  DERECHA_ARRIBA:
			if (this.posicion.getFila() >= 1 && this.posicion.getFila() < 8 && this.posicion.getColumna() >= 'a' && this.posicion.getColumna() <'h') {
				this.posicion.setColumna((char)(this.posicion.getColumna() + 2));
				this.posicion.setFila(this.posicion.getFila() + 1);
			} else {
				throw new OperationNotSupportedException("no se puede mover por la derecha arriba");
			}
			break;
		case DERECHA_ABAJO:
			if (this.posicion.getFila() >= 1 && this.posicion.getFila() < 8 && this.posicion.getColumna() >= 'a' && this.posicion.getColumna() <'h') {
				this.posicion.setColumna((char)(this.posicion.getColumna() + 2));
				this.posicion.setFila(this.posicion.getFila() - 1);
			} else {
				throw new OperationNotSupportedException("no se puede mover por la derecha abajo");
			}
			break;
		case ABAJO_DERECHA:
			if (this.posicion.getFila() >= 1 && this.posicion.getFila() < 8 && this.posicion.getColumna() >= 'a' && this.posicion.getColumna() <'h') {
				this.posicion.setFila(this.posicion.getFila() - 2);
				this.posicion.setColumna((char)(this.posicion.getColumna() + 1));
			} else {
				throw new OperationNotSupportedException("no se puede mover abajo a la derecha");
			}
			break;
		case ABAJO_IZQUIERDA :
			if (this.posicion.getFila() >= 1 && this.posicion.getFila() < 8 && this.posicion.getColumna() >= 'a' && this.posicion.getColumna() <'h') {
				this.posicion.setFila(this.posicion.getFila() - 2);
				this.posicion.setColumna((char)(this.posicion.getColumna() -1));
			} else {
				throw new OperationNotSupportedException("no se puede mover abajo a la izquierda");
			}
		break;
		case IZQUIERDA_ARRIBA :
			if (this.posicion.getFila() >= 1 && this.posicion.getFila() < 8 && this.posicion.getColumna() >= 'a' && this.posicion.getColumna() <'h') {
				this.posicion.setColumna((char)(this.posicion.getColumna() - 2));
				this.posicion.setFila(this.posicion.getFila() + 1);
			} else {
				throw new OperationNotSupportedException("no se puede mover por la izquierda arriba");
			}
		break;
		case IZQUIERDA_ABAJO :
			if (this.posicion.getFila() >= 1 && this.posicion.getFila() < 8 && this.posicion.getColumna() >= 'a' && this.posicion.getColumna() <'h') {
				this.posicion.setColumna((char)(this.posicion.getColumna() - 2));
				this.posicion.setFila(this.posicion.getFila() - 1);
			} else {
				throw new OperationNotSupportedException("no se puede mover por la izquierda abajo");
			}
		break;
	
		}
		
}
}


	

