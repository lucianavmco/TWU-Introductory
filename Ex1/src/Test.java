public class Test {
    public static void main(String[] args){

        ImpressaoCaracteres impressaoCaracteres = new ImpressaoCaracteres();

        System.out.println("1 - Print one asterisk to the console.");
        System.out.print("*");
        System.out.println();

        System.out.println("2 - Given a number n, print n asterisks on one line.");
        impressaoCaracteres.impressaoCaracteresNaMesmaLinha(5);


        System.out.println("3 - Given a number n, print n lines, each with one asterisks");
        impressaoCaracteres.impressaoCaracteresEmlinhas(5);

        System.out.println("4 - Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)");
        impressaoCaracteres.impressaoPiramideEsquerda(4);

        System.out.println("5 -  Given a number n, print a centered triangle.");
        impressaoCaracteres.impressaoPiramide(3);

        System.out.println("6 -  Given a number n, print a centered diamond");
        impressaoCaracteres.impressaoDiamante(3);

        System.out.println("7 -  Given a number n, print a centered diamond with your name in place of the middle line");
        impressaoCaracteres.impressaoDiamanteNome(3, "Luciana");


        System.out.println("8 -  Create a FizzBuzz() method that prints out the numbers 1 through 100.");
        System.out.println("Instead of numbers divisible by three print \"Fizz\".");
        System.out.println("Instead of numbers divisible by five print \"Buzz\".");
        System.out.println("IInstead of numbers divisible by three and five print \"FizzBuzz\".");
        impressaoCaracteres.fizzBuzz(100);


        System.out.println("9 -  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.");
        System.out.println("Ex.: generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.");
        impressaoCaracteres.generate(30);

    }

}
