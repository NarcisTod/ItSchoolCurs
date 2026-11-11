package session5;

public class Memory {

    static void main() {

        int age = 30;
        int age2 = 31;
        int age3 = 30;

        System.out.println(age == age2);
        System.out.println(age == age3);

        String hello1 = new String("hello");
        String hello2 = new String("Hello");
        String hello3 = hello1;
        String hello4 = new String("hello");

        System.out.println(hello1 == hello2);
        System.out.println(hello1 == hello4);
        System.out.println(hello1 == hello3);

        System.out.println(hello1.equals(hello2));
        System.out.println(hello1.equals(hello4));

    }
}
