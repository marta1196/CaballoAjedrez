package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

public class Caballo {
	
	private Color color;
	private Posicion posicion;
	
	private static final Color caballoBlanco=Color.BLANCO;
	private static final Color caballoNegro=Color.NEGRO;
	
	public Caballo() {
		
		this.color=caballoNegro;
		this.posicion=new Posicion(8,'b');	
	}
	
	public Caballo(Color color) {
		
		if(caballoBlanco==null) {
			throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
		}else {
		if (color==caballoBlanco) {
			this.posicion=new Posicion(1,'b');
		}else
			this.posicion=new Posicion(8,'b');
		}
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
		this.color=caballo.getColor();
		this.posicion=caballo.posicion;
	}
	
	public Color getColor() {
		return color;
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
				try {
					posicion = new Posicion(posicion.getFila() + 2, (char)(posicion.getColumna() - 1));
				}catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
				}
			break;
		
		case ARRIBA_DERECHA:
			try {
				posicion = new Posicion(posicion.getFila() + 2, (char)(posicion.getColumna() + 1));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;
		case  DERECHA_ARRIBA:
			try {
				posicion = new Posicion(posicion.getFila() + 1, (char)(posicion.getColumna() + 2));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;
		case DERECHA_ABAJO:
			try
			{
				posicion = new Posicion(posicion.getFila() - 1, (char)(posicion.getColumna() + 2));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;
		case ABAJO_DERECHA:
			try{
				posicion = new Posicion(posicion.getFila() - 2, (char)(posicion.getColumna() + 1));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
			break;
		case ABAJO_IZQUIERDA :
			try{
				posicion = new Posicion(posicion.getFila() - 2, (char)(posicion.getColumna() - 1));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
		break;
		case IZQUIERDA_ARRIBA :
			try{
				posicion = new Posicion(posicion.getFila() + 1, (char)(posicion.getColumna() - 2));
			}catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
		break;
		case IZQUIERDA_ABAJO :
			try{
				posicion = new Posicion(posicion.getFila() - 1, (char)(posicion.getColumna() - 2));
			} catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
			}
		break;
	
		}
		
}
}


	

