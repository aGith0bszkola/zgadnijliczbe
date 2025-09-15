import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        // typy proste
        //zmienne nie obikety - pisane małymiu listerami
        //typy całkowite
        byte liczba1 = 120;
        short liczba2 = 300;
        int liczba3 = 1234321;
        long lczba4 = 1235435;
        System.out.println("liczba całkowita"+liczba3);
        //typy zmienne
        float liczba5  = 12.456f;
        double liczba6 = 23.456789;
        //typ logiczny
        boolean czyfalse = true;
        //typ znakowy
        char znak = 'a';


        /*
         * napisz program w którytm zgadniesz liczbe   wylosowaną z zakresu od 0 do 100
         * */
        // losowawniue liczby

        int wylosowanaLiczba = (int)(Math.random()*100+1); //rzutowanie
        System.out.println("Wylosowane liczbe"+wylosowanaLiczba);

        //wpisywanie z kalwiaury
        Scanner scanner = new Scanner(System.in);
        int wpisanaLiczba = scanner.nextInt();
        System.out.println("wpisono" +wpisanaLiczba);
    }
}