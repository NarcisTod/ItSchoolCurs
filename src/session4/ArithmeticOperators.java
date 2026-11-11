package session4;

public class ArithmeticOperators {

    static void main() {

        int nr1 = 21;
        int nr2 = 6;
        int nr3 = 3;
        int nr4 = 1;

        int rez1 = nr1 - nr2 / nr3;
        System.out.println(rez1);

        int rez2 = (nr1 - nr2) / nr3;
        System.out.println(rez2);

        int rez3 = nr1 / nr2 * nr3 - nr4;
        System.out.println(rez3);

        int rez4 = nr1 / (nr2 * nr3) - nr4;
        System.out.println(rez4);

        double rez5 = (double)nr1 / (nr2 * nr3) - nr4;
        System.out.println(rez5);

        int a = 2;
        int b = 3;
        int c = 4;

        System.out.println(a += 2); // a = a + 2
        //a = 4
        System.out.println(a += b); //a = a+b;
        System.out.println(a);

        System.out.println(a +=b + 10); // a=a+b+10 // a = 7 + 3 + 10 // a = 20
        System.out.println(a);

        System.out.println(a /= c - 2); // a = a /(c-2)  // a = 20 / (2)  // a =10
        System.out.println(a);

        System.out.println(b /= c-1); // b = b/(c-1)
        //b=1

        System.out.println(c *= b+1); // c = c* (b+1)

        int x = 2;
        int y = 3;
        System.out.println(x++); // 2  x = 3
        System.out.println(x);  // 3
        System.out.println(++y); // 4

        //x=3
        System.out.println( x++ + 2);
        // 2 (-> x=3 dupa ce ii ia valoare) +2 =4

        //x++ = x= x+1;

        // x++ =   x= x+1;
        // x++ + 2    sout: 2+2 -> x=x+1

        // y=2  ++y + 2   sout y=y+1   y+2

        // x++ +2
        // x =2
        // 2 (x=x+1) +2

        // ++x +2
        // x=x+1 3+2

        x=2;
        System.out.println(++x); // x=x+1 si apoi il folosim
        x=2;
        System.out.println(x++); // il folosim pe x si apoi x=x+1
        System.out.println(x);

        y=4;
        System.out.println(y++ + y++);
        //y = 4
        //4 (y=y+1) -> y=5
        //4 + 5  y = y+1
        //y = 6

        y+=2;
        y-=2;
        y=y+2;

        a=2;
        b=3;
        System.out.println( a > b);
        System.out.println( a >=b);
        System.out.println( a < b);
        System.out.println( a <=b);





    }


}
