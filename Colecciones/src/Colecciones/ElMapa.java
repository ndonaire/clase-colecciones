package Colecciones;

import java.util.HashMap;

public class ElMapa {
	
	public static void main(String[] args) {
		
		//New
		HashMap<Integer,String> personas = new HashMap<>();
		
		//Agregar Elemento
		personas.put(4444, "Juanita");
		personas.put(1111, "Juancito");
		personas.put(2222, "Pepito");
		personas.put(3333, "Pepita");
		personas.put(5555, "Juanita");

		//Ver si esta un elemento
		System.out.println("Está DNI 1111? " + personas.containsKey(1111));
		System.out.println("Está Nombre Pepito? " + personas.containsValue("Pepito"));
		
		//Recuperar por posicion
		//NO TIENE SENTIDO
		
		//Rescuperar por elemento
		System.out.println("Buscar por DNI 1111:" + personas.get(1111));
		
		//Eliminar un elemento
		personas.remove(1111);
		personas.remove(2222,"Pepito");
		
		//Eliminar por posicion
		//NO TIENE SENTIDO XD
		
		//Buscar posicion de elemento
		//NO TIENE SENTIDO XD
		
		//Imprimir
		System.out.println("Hash Map completo " + personas);
		
		//Vaciar
		personas.clear(); //comentar esta linea para poder probar el resto
		
		//Ver si esta vacio
		personas.isEmpty();
		
		//Tamaño
		System.out.println("Hash Map Vacio? " + personas.size());
		
		//Recorrer
		System.out.println("Recorrer Hash Map"); 
		for (Integer clave:personas.keySet()) {
		    String valor = personas.get(clave);
		    System.out.println("DNI: " + clave + ", Nombre: " + valor);
		}
		
		
		//Orden
		//NO TIENE ORDEN, NI TIENE SENTIDO ORDENARLO XD

	}
}


