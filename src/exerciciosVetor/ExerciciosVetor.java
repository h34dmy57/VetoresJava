package exerciciosVetor;

import java.util.Scanner;

/**
 *
 * @author Ícaro
 */
public class ExerciciosVetor {

    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4};

        System.out.println(soma(v));
        System.out.println(achou(v));
        System.out.println(media(v));
        System.out.println(somaPares(v));
        System.out.println(somaIImpar(v));
        System.out.println(retornaMenor(v));
        System.out.println(retornaIndice(v));
        //System.out.println(removeIndice(v));
    }

    // Escreva uma função que receba um vetor como parâmetro e calcula e retorna a soma dos elementos no vetor. 
    public static int soma(int v[]) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }
        return soma;
    }

    // Escreva uma função que receba um vetor como parâmetro e um valor inteiro para ser procurado no vetor. 
    // Sua função retorna true se o valor inteiro informado consta no vetor e false caso contrário.
    public static boolean achou(int v[]) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número que deseja procurar:");
        int n = ler.nextInt();

        for (int i = 0; i < v.length; i++) {
            if (n == v[i]) {
                return true;
            } else {
            }
        }
        return false;
    }

    // Escreva uma função que receba um vetor como parâmetro e calcula e retorna a média dos elementos no vetor.
    public static int media(int v[]) {
        int soma = 0;
        int media = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
            media = soma / 3;
        }
        return media;
    }

    // Escreva uma função que receba um vetor como parâmetro e calcula e retorna a soma dos elementos pares no vetor. 
    public static int somaPares(int v[]) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                soma += v[i];
            }
        }
        return soma;
    }

    // Escreva uma função que receba um vetor como parâmetro e calcula e retorna a soma dos elementos com índices ímpares no vetor. 
    public static int somaIImpar(int v[]) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            if (i % 2 != 0) {
                soma += v[i];
            }
        }
        return soma;
    }

    // Escreva uma função que receba um vetor como parâmetro sua função retorna o menor elemento no vetor. 
    public static int retornaMenor(int v[]) {
        int menor = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return menor;
    }

    // Faça uma função que receba um vetor como parâmetro e um valor inteiro para ser procurado no vetor. 
    // Sua função retorna o índice da última ocorrência do valor procurado no vetor, caso o número não esteja no vetor é devolvido -1
    public static int retornaIndice(int v[]) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor que quer procurar:");
        int n = ler.nextInt();

        for (int i = 0; i < v.length; i++) {
            if (n == v[i]) {
                return i;
            } else {
            }
        }
        return -1;
    }

    // Faça uma função que remove um elemento em um certo índice do vetor. 
    // Por exemplo, o resultado da remoção do elemento que está no índice 2 do vetor 1, 2, 3, 4 é o vetor 1, 2, 4 
    public static void removeIndice(int v[]) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual indice deseja remover?");
        int n = ler.nextInt();

        int[] vAux = new int[v.length - 1];
        int j = 0;
        for (int i = 0; i < v.length; i++) {
            if (i == n) {
                vAux[i] = v[i];
                j++;
            }
        }
        v = vAux;
    }
}
