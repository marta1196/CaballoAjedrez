package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

public class Caballo {
	
	private Color color;
	private Posicion posicion;
	
	
	public Caballo() {
		
		this.color=Color.NEGRO;
		this.posicion=new Posicion(8,'b');	
	}
	
	public Caballo(Color color) {
		this.color=color;
		if(color==null) {
			throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
		}else {
		if (color==Color.BLANCO) {
			posicion=new Posicion(1,'b');
		}if (color==Color.NEGRO) {
			this.posicion=new Posicion(8,'b');
		}
		}
	}
	
	public Caballo(Color color,char columna) {
		this.color=color;
		if(color==null) {
			throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
		}else { 
		if(columna=='b' || columna =='g') {	
				if(color==color.BLANCO) {
					this.posicion=new Posicion(1,columna);
				}else {
					this.posicion=new Posicion(8,columna);
				}
					
			}else {
				throw new IllegalArgumentException("ERROR: Columna inicial no válida.");
			}
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caballo other = (Caballo) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Caballo [posición=[fila=8, columna=b], color=NEGRO]";
	}
	
	
}


	

