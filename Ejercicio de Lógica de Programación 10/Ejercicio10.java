package ejercicios;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	    // Creamos el diccionario con algunas palabras y sus traducciones
	    HashMap<String, String> Diccionario = new HashMap<>();
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

	 // se crea un scanner para leer lo que el usuario introduzca
	    Scanner scanner = new Scanner(System.in);

	 
	    Random random = new Random();

	    int incorrectas = 0;
	    int correctas = 0;
	    

	    for (int i = 0; i < 5; i++) {
	      // Se busca una palabra random
	      String palabra = (String) Diccionario.keySet().toArray()[random.nextInt(Diccionario.size())];

	      // El usuario debe escribir la traduccion al ingles 
	      System.out.println("Resultado de la palabra en ingles '" + palabra + "':");
	      String respuesta = scanner.nextLine();

	      // Se comprueba la respuesta de usuario
	      if (respuesta.equals(Diccionario.get(palabra))) {
	        //aumentamos el contador de respuestas incorrectas
	        incorrectas++;
	      } else {
	        // aumenta contador de respuestas correctas
	        correctas++;
	      }
	    }
	    
	    System.out.println("Respuestas correctas: " + incorrectas);
	    System.out.println("Respuestas incorrectas: " + correctas);
	  }
	
}
