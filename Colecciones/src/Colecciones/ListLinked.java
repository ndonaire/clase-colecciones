package Colecciones;

import java.util.LinkedList;
import java.util.Comparator;

public class ListLinked {

	public static void main(String[] args) {
		// LINKED LIST AGREGA ELEMENTOS SIN ORDENARLOS

		// Crear (new)
		LinkedList<Integer> numeros = new LinkedList<Integer>(); // siempre setear con Object

		// Agregar elemento
		numeros.add(51);
		numeros.add(42);
		numeros.add(2);
		numeros.add(37);
		numeros.add(59);
		numeros.add(58);

		// Agregar en posición
		numeros.add(2, 5);

		// Ver si está un elemento
		System.out.println("Hay numero 4? " + numeros.contains(4));

		// Recuperar por posicion
		System.out.println("Recuperar por posicion 2: " + numeros.get(2));

		// Recuperar por elemento
		// NO TIENE SENTIDO XD

		// Eliminar un elemento
		numeros.remove(2);

		// Eliminar por posicion
		numeros.remove(0);

		// Bucar posicion de elemento
		System.out.println("Posicion de elemento 59: " + numeros.indexOf(59));

		// Imprimir
		System.out.println("LinkedList completo:" + numeros);

		// Vaciar
		//numeros.clear(); // comentar esta linea para poder probar el resto

		// Ver si está vacío
		System.out.println("LinkedList vacio?:" + numeros.isEmpty());

		// Tamaño
		System.out.println("Tamaño LinkedList?: " + numeros.size());

		// Recorrer
		System.out.println("Recorrer LinkedList");

		numeros.forEach((n) -> System.out.println(n));

		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}

		// Orden
		// NO ESTÁ ORDENADO, PARA ORDENAR:
		System.out.println("LinkedList Ordenado");
		numeros.sort(Comparator.naturalOrder());
		System.out.println(numeros);

	}

}
