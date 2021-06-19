/* Objetivo: Sua missão é fazer um programa para mostrar que a Andrea é muito mais esperta que o Marcelo e
o Carlos, no início o seu programa gera uma sequência de números aleatórios e armazenar em um
vetor de tamanho N, onde o N é informado pelo usuário, em seguida, antes até do Marcelo e o
Carlos começarem a jogar, o seu programa irá dizer quem ganhará a partida dada a sequência
gerada, lembrando que quem sempre começa a jogar é o Marcelo.*/

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bsantosdias
 */

public class Piscina_Bolhas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int contador = 0;
        int auxiliar = 0;
        int tamanho = 0;
        boolean organizar = false;
        boolean loop = true;

        //Define o tamanho do vetor.
        System.out.println("Defina o tamanho do vetor: ");
        tamanho = entrada.nextInt();

        //Cria o vetor.
        int[] vetor = new int[tamanho];

        //Preenche vetor com numeros aleatorios de 1 a 9.
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 1 + aleatorio.nextInt(8);
        }
        //Imprime o vetor.
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Loop para verificação de posições.
        while (loop) {
            // Verifica se necessita organizar vetores. 
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    organizar = true;
                }
            }
            // Vetor não necessita de organização.
            if (organizar == false) {
                loop = false;
            } else {
                //Organiza vetores
                for (int i = 0; i < vetor.length - 1; i++) {
                    if (vetor[i] > vetor[i + 1]) {
                        auxiliar = vetor[i + 1];
                        vetor[i + 1] = vetor[i];
                        vetor[i] = auxiliar;
                        //Adiciona troca para contador. 
                        contador++;
                    }
                }
            }
            organizar = false;
        }
        // Se contador for par, vencedor será Carlos. Caso contador, vencedor será Marcelo. 
        if (contador % 2 == 0) {
            System.out.println("\n" + "Ganhador: Carlos");
        } else {
            System.out.println("\n" + "Ganhador: Marcelo");
        }
    }

}