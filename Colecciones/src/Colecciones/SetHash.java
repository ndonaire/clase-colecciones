package Colecciones;

import java.util.HashSet;

public class SetHash {

	public static void main(String[] args) {
		// HASH SET AGREGA ELEMENTOS SIN ORDENARLOS

		// Crear (new)
		HashSet<Integer> numeros = new HashSet<Integer>(); // siempre setear con Object

		// Agregar elemento
		numeros.add(51);
		numeros.add(42);
		numeros.add(2);
		numeros.add(37);
		numeros.add(59);
		numeros.add(58);

		// Agregar en posición
		// NO TIENE SENTIDO XD

		// Ver si está un elemento
		System.out.println("Hay numero 4? " + numeros.contains(4));

		// Recuperar por posicion
		// NO TIENE SENTIDO XD

		// Recuperar por elemento
		// NO TIENE SENTIDO XD

		// Eliminar un elemento
		numeros.remove(2);

		// Eliminar por posicion
		// NO TIENE SENTIDO XD

		// Bucar posicion de elemento
		// NO TIENE SENTIDO XD

		// Imprimir
		System.out.println("HashSet completo:" + numeros);

		// Vaciar
		// numeros.clear(); // comentar esta linea para poder probar el resto

		// Ver si está vacío
		System.out.println("HashSet vacio?:" + numeros.isEmpty());

		// Tamaño
		System.out.println("Tamaño HashSet?: " + numeros.size());

		// Recorrer
		System.out.println("Recorrer ArrayList");

		numeros.forEach((n) -> System.out.println(n));

		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}

		// Orden
		// NO ESTÁ ORDENADO, NO SE PUEDE ORDENAR (EXCPETO USANDO UNA LIST)

	}

}
