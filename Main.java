/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author tracy
 */
public class Main {
    static int counter = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numeros = crearListaNumeros();
        List<Integer> potenciasPares = convertirACuadrados(numeros);
        imprimirLista(potenciasPares);
    }

    public static List<Integer> crearListaNumeros() {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(random.nextInt(100));
        }

        return lista;
    }

    public static List<Integer> obtenerPares(List<Integer> lista) {
        List<Integer> pares = new ArrayList<>();

        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        return pares;
    }

    public static List<Integer> convertirACuadrados(List<Integer> lista) {
        List<Integer> cuadrados = new ArrayList<>();

        for (int num : lista) {
            cuadrados.add(num * num);
        }

        return cuadrados;
    }

    public static void imprimirLista(List<Integer> Lista) {

        for (Integer i : Lista) {
            System.out.println(i);
        }

    

       }
    
   
    public static int sumaPowPares(List<Integer> pows){
        for (int i =0; i < pows.size(); i++){
            counter = counter + (int)pows.get(i);
        }
        return counter;
    }
}

