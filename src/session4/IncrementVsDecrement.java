package session4;

public class IncrementVsDecrement {

    static void main() {

        int a = 1;
        int rezultat = a++ +2;

        //rezultat = 1 (a = a +1 ) +2;
        //rezultat = 1 + 2; // paralel dupa ce am citit deja ca a = 1 se face asignarea: a = a +1 -> a = 2
        //rezultat = 3 dar si A se face intre timp 2;

        int b = 1;
        int rezultat2 = ++b +2;
        //rezultat2 = (b = b+ 1) restul ecuatiei
        //in memorie b=2 so rezultatul 2 = 2 + 2 care e 4

    }
}
