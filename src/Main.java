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
        System.out.println("wpisono " +wpisanaLiczba);
        if (wylosowanaLiczba == wpisanaLiczba){
            System.out.println("zgadłeś");
        }else{
            System.out.println("nie zgadles1");
        }
        int roznica;
        if(wylosowanaLiczba>wpisanaLiczba){
            roznica = wylosowanaLiczba - wpisanaLiczba;
        }else{
            roznica = wpisanaLiczba - wylosowanaLiczba;
        }
        //wyrażenie warunkowe-> zwraca wartość
//        roznica = wpisanaLiczba>wylosowanaLiczba?wpisanaLiczba - wylosowanaLiczba:wylosowanaLiczba>wpisanaLiczba?wylosowanaLiczba - wpisanaLiczba;
//        System.out.println(roznica);

        //dzielenie całkowiete
        roznica = roznica/10;// bo dzielimyt przez liczby całkowite

        //instrukcja wyboru



        switch(roznica){
            case 0:
                System.out.println("prawie sie udało");
            break;
            case 1:
                System.out.println("blisko");
                break;
            case 2:
                 System.out.println("nie najgorzej");
                 break;
            default:
                System.out.println("sproboj innym razem");
        }

        //wyrazenie switch
        System.out.println(
                switch (roznica){
                    case 0->"prawie sie udało";
                    case 1->"blisko";
                    case 2->"nie najgorzej";
                    default -> "sproboj innym razem";
                }
        );
    }
}