package session5;

public class IfStatement {

    static void main() {

        int currentYear = 2026;
        int birthYear = 1995;
        int age = currentYear - birthYear;

        if (age > 18) {
            System.out.println("sunt major");
        }

         currentYear = 2026;
         birthYear = 2015;
         age = currentYear - birthYear;

         if(age > 18){
             System.out.println("sunt major");
         } else {
             System.out.println("sunt minor");

             currentYear = 2026;
             birthYear = 2008;
             age = currentYear - birthYear;

             if(age > 18) {
                 System.out.println("major");
             }else if(age == 18) {
                 System.out.println("la limita");
             }else {
                 System.out.println("minor");
             }

             if (age > 18){
                 System.out.println("major");
             }
             if (age == 18){
                 System.out.println("la limita");
             }

             if (age < 18){
                 System.out.println("minor");
             }

             int greutate = 113;

             if (greutate > 100){

                 System.out.println("mai mare decat 100");

                 if(greutate > 150){
                     System.out.println("mai mare decat 150");
                 } else {
                     System.out.println("mai mic toptusi decat 150");
                 }

                 if (greutate > 130) {
                     System.out.println("mai mare decat 130");
                 }else {
                     System.out.println("mai mic totusi decat 130");
                 }

                 if (greutate > 110){
                     System.out.println("mai mare decat 110");
                 }else {
                     System.out.println("mai mic totusi decat 110");
                 }
             }

         }

         int temp = 35;

         if(temp > 30){
             System.out.println("imi iau doar tricou");
         }else if(temp <20) {
             System.out.println("imi iau plover");
         }else if(temp >= 10) {
             System.out.println("imi iau geaca");
         }else {
             System.out.println("mai bine stau acasa");
         }
    }
}
