package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		
		//Usamos HashMap para crear el diccionario
	    HashMap<String, String> Diccionario = new HashMap<>();

	    // Agregamos algunas palabras al diccionario
	    Diccionario.put("cat", "gato");
	    Diccionario.put("perro", "dog");
	    Diccionario.put("map", "mapa");
	    Diccionario.put("sea", "oceano");
	    Diccionario.put("library", "libreria");
	    Diccionario.put("bottle", "botella");
	    Diccionario.put("water", "agua");
	    Diccionario.put("hand", "mano");
	    Diccionario.put("foot", "pie");
	    Diccionario.put("arm", "brazo");
	    Diccionario.put("green", "verde");
	    Diccionario.put("white", "blanco");
	    Diccionario.put("yellow", "amarillo");
	    Diccionario.put("book", "libro");
	    Diccionario.put("old", "viejo");
	    Diccionario.put("boat", "barco");
	    Diccionario.put("mirror", "espejo");
	    Diccionario.put("orange", "naranja");
	    Diccionario.put("door", "puerta");
	    
	    Scanner usuario = new Scanner(System.in);
	    
        // se crea un scanner para leer lo que el usuario introduzca
	    System.out.println("Ingresa tu palabra en español: ");
	    String palabra = usuario.nextLine();

	    if (Diccionario.containsKey(palabra)) {
	      //mensaje para mostrar traduccion
	      System.out.println("El resultado que buscas es: " + Diccionario.get(palabra));
	    } 
	    else {
	      //mensaje que aparece si no se encuentra la palabra
	      System.out.println("No encontramos una traducción para esa palabra.");
	    }
	  }

}
