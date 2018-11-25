package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	
	private static Color color;
	static Caballo caballo;
	private static Direccion direccion;
	public static int numMenu,colorMenu,moverMenu;
	public static char columna;
	
	
	
	public static void main(String[] args) {
		
		//llamamos al metodo que nos muestrara el menu
		MainApp.mostrarMenu();
		
	}
	
	//método para mostrar el menu
	public static void mostrarMenu() {
		MainApp.elegirOpcion();
	}
	
	//método para elegir la opción que se quiera hacer 
	public static int elegirOpcion() {
		
		//se pide el númeroque se quiere introducir y se repetira hasta que el número ya no sea 0
		do{
		//se pide el número que se quiere introducir y se repetira hasta que el número ya no sea menor que 0 ni mayor que 4
		do {
		System.out.println("escriba la opción deseada: 1.crear un caballo por defecto, 2.crear un caballo de un color, "
				+ "3.crear un caballo de un color en una columna inicial válida, 4.mover el caballo y 0.salir.");
		numMenu=Entrada.entero();
		}while(numMenu<0 || numMenu>3);
		
		//llamamos al método que nos muesta las opciones del menu
		MainApp.ejecutarOpcion(numMenu);
		
		
		}while(numMenu!=0);
		
		return numMenu;
		
		
}
	
	//método que nos muestra las opciones del menu
	public static void ejecutarOpcion(int numMenu) {
		
		//llamamos a los métodos para cada opción
		
		switch(numMenu){
			
		case 1:
			MainApp.crearCaballoDefecto();
			break;
		case 2:
			MainApp.crearCaballoDefectoColor();
			break;
		case 3:
			CrearCaballoColorPosicion();
			break;
		/*case 4:
			MainApp.mover();
			break;*/
		default:
			System.out.println("Adios");
			break;
		}
	}
	
	//método para crear un caballo por defecto
	public static void crearCaballoDefecto() {
			
		//se llama al constructor por defecto de la clase Caballo
		caballo=new Caballo();
		System.out.println("caballo por defecto: "+caballo);
	}
	
		//método para crear un caballo por defeto y que se le asigne un color
	public static void crearCaballoDefectoColor() {
		
		//llamaremos al color que hemos introducido en el método elegirColor
		Color color=MainApp.elegirColor();
		
		//se le asigna el color al caballo llamando al constructor con el parametro color creado en la clase Caballo
		caballo=new Caballo(color);
		
		//mensaje por pantalla con el método toString creado en la clase Caballo para ver los cambios
		System.out.println("nuevo caballo: "+caballo.toString());
	}
	
	//método para elegir el color al caballo
	public static Color elegirColor() {
		//ponemos el color a nulo
		Color color=null;
		
	//se pide el número que se quiere introducir y se repetira hasta que el número ya no sea menor que 1 ni mayor que 2
	do {	
	System.out.println("¿de que color quiere el caballo,escriba un número,1.BLANCO o 2.NEGRO?");
	colorMenu=Entrada.entero();
	}while(colorMenu<1 || colorMenu>2);
	
	//se hara un switch para elegir el color que se quiere
	switch(colorMenu) {
	
	case 1:
		color=Color.BLANCO;
		break;
	case 2:
		color=Color.NEGRO;
		break;
	
	}
	return color;
	}
	
	//método para crear un caballo con el color y la posicion(columna) que queramos
	public static void CrearCaballoColorPosicion() {
		
		//llamamos al color del método elegirColor y la columna del método elegirColumnaIncial
		Color color = MainApp.elegirColor();
		char columna=MainApp.elegirColumnaInicial();
		
		//se le asigna el color y la columna al caballo llamando al constructor con el parametro color y columna creado en la clase Caballo
		Caballo caballo=new Caballo(color,columna);
		
		//mensaje por pantalla con el método toString creado en la clase Caballo para ver los cambios
		System.out.println("nuevo caballo: "+caballo.toString());
	}
	
	//método para elegir la columna en la que queremos que este el caballo
	public static char elegirColumnaInicial() {
		
		//se pregunta que columna quiere estar
		System.out.println("¿cuál es su columna inicial,b o g?");
		columna=Entrada.caracter();
		
		//se hara un switch para elegir la que se quiere
		switch(columna) {
		case 1:
		columna='b';
		break;
		case 2:
		columna='g';
		break;
		}
		
		
		return columna;
	}
	
	//no funciona, no realiza el movimiento y sale un error no se resolverlo
	
	/*
	public static void mover() {
		
		
		MainApp.mostrarMenuDirecciones();
		
	}
	
	public static void mostrarMenuDirecciones() {	
	
	caballo=new Caballo();
	
		
		
		try {
			Direccion direccion=MainApp.elegirDireccion();
			caballo.mover(direccion);
		} catch (OperationNotSupportedException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	
	
	
	System.out.println("movimiento:"+caballo.getPosicion());
		
	}
	
	public static Direccion elegirDireccion() {
		
		
		System.out.println("¿Dónde quiere mover el caballo?,escriba un número,1.ARRIBA_IZQUIERDA, 2.ARRIBA_DERECHA, "
				+ "3.DERECHA_ARRIBA, 4.DERECHA_ABAJO, 5.ABAJO_DERECHA, "
				+ "6.ABAJO_IZQUIERDA, 7.IZQUIERDA_ARRIBA, 8.IZQUIERDA_ABAJO");
		moverMenu=Entrada.entero();
		
		switch(moverMenu){
			
		case 1:
			direccion=Direccion.ARRIBA_IZQUIERDA;
			break;
			
		case 2:
			direccion=Direccion.ARRIBA_DERECHA;
			break;
		
		case 3:
			direccion=Direccion.DERECHA_ARRIBA;
		    break;
		    
		case 4:
			direccion=Direccion.DERECHA_ABAJO;
			break;
			
		case 5:
			direccion=Direccion.ABAJO_DERECHA;
			break;
		
		case 6:
			direccion=Direccion.ABAJO_IZQUIERDA;
			break;
		
		case 7:
			direccion=Direccion.IZQUIERDA_ARRIBA;
			break;
		
		case 8:
			direccion=Direccion.IZQUIERDA_ABAJO;
			break;
		}
		
		
		return direccion;
	}*/

}
		
			
		
		