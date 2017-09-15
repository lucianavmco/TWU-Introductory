import java.util.ArrayList;
import java.util.Collections;

public class ImpressaoCaracteres {

    int quantidadePontos;
    int quantidadePontosCadaLado;
    int quantidadeAsteriscos;

    public void imprimeAsterisco(int quantidade){
        for (int i = 1; i <= quantidade; i++){
            System.out.print("*");
        }
    }

    public void imprimeEspacoEmBranco(int quantidade){
        for (int i = 1; i <= quantidade; i++){
            System.out.print(" ");
        }
    }

    public void impressaoCaracteresNaMesmaLinha(int n){
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void impressaoCaracteresEmlinhas(int n){
        for (int i = 0; i < n; i++){
            System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    public void impressaoPiramideEsquerda(int n){
        for (int i = 0; i <= n; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void impressaoPiramide(int n){

        quantidadePontos= n + n - 1;
        quantidadePontosCadaLado = (quantidadePontos-1)/2;
        quantidadeAsteriscos = 1;

        for (int i = 1; i <= n; i++){
            this.imprimeEspacoEmBranco(quantidadePontosCadaLado);
            this.imprimeAsterisco(quantidadeAsteriscos);
            this.imprimeEspacoEmBranco(quantidadePontosCadaLado);
            quantidadePontosCadaLado--;
            quantidadeAsteriscos+=2;
            System.out.println();
        }
    }

    public void impressaoDiamante(int n){

        System.out.println();
        this.impressaoPiramide(n);

        quantidadePontos= n + n - 3;
        quantidadePontosCadaLado = 1;
        quantidadeAsteriscos = quantidadePontos;

        for (int i = 1; i <= n; i++){
            this.imprimeEspacoEmBranco(quantidadePontosCadaLado);
            this.imprimeAsterisco(quantidadeAsteriscos);
            this.imprimeEspacoEmBranco(quantidadePontosCadaLado);
            quantidadePontosCadaLado++;
            quantidadeAsteriscos-=2;
            System.out.println();
        }
        System.out.println();
    }

    public void impressaoDiamanteNome(int n, String nome){

        System.out.println();

        quantidadePontos= n + n - 1;
        quantidadePontosCadaLado = (quantidadePontos-1)/2;
        quantidadeAsteriscos = 1;

        for (int i = 1; i < n; i++){
            this.imprimeEspacoEmBranco(quantidadePontosCadaLado);
            this.imprimeAsterisco(quantidadeAsteriscos);
            this.imprimeEspacoEmBranco(quantidadePontosCadaLado);
            quantidadePontosCadaLado--;
            quantidadeAsteriscos+=2;
            System.out.println();
        }

        System.out.println(nome);

        quantidadePontos= n + n - 3;
        quantidadePontosCadaLado = 1;
        quantidadeAsteriscos = quantidadePontos;

        for (int i = 1; i <= n; i++){
            this.imprimeEspacoEmBranco(quantidadePontosCadaLado);
            this.imprimeAsterisco(quantidadeAsteriscos);
            this.imprimeEspacoEmBranco(quantidadePontosCadaLado);
            quantidadePontosCadaLado++;
            quantidadeAsteriscos-=2;
            System.out.println();
        }
        System.out.println();
    }

    public void fizzBuzz(int n){
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            } else if((i % 5 == 0) && (i % 3 == 0)){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }

    }

    public ArrayList<Integer> generate(int n){

        ArrayList<Integer> primeNumbers = new  ArrayList<Integer>();

        for (int i = 1; i <=n; i++) {
            if(isPrime(i)){
                if(!isFatorialCompleto(primeNumbers, n)){
                    primeNumbers.add(i);
                }
            }
        }
        Collections.sort(primeNumbers);

        printArraylist(primeNumbers);

        return primeNumbers;
    }

    public boolean isPrime(int number){

        if(((number%2!=0) && (number%3!=0) && (number%5!=0) && (number%7!=0) && (number > 1))
                || (number==3 || number==2 || number==5 || number==7)){
            return true;
        }

        return false;
    }

    public boolean isFatorialCompleto(ArrayList<Integer> fatoriais, int n){
        int totalFatorial = 1;
        for (Integer fatorial : fatoriais) {
            totalFatorial = totalFatorial * fatorial;
        }

        if(totalFatorial >= n){
            return true;
        }

        return false;
    }

    public void printArraylist(ArrayList<Integer> fatoriais){
        for (Integer fatorial : fatoriais) {
            System.out.print(fatorial + ",");
        }
    }

}
