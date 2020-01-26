package kalkulator;
 
public class Main {
 
  /* Prosty kalkulator wykonujący operacje dodawania, odejmowania, mnożenia
   * dzielenia oraz operację modulo w zależności od wyboru użytkownika
   */
 
    public static void main(String[] args) 
    {
       int pierwsza_l;  // dwie liczby, na których będziemy wykonywać operację
       int druga_l;
       char znak;      // zmienna przechowująca symbol operacji do wykonania
       Scanner wej = new Scanner(System.in);   // wczytywanie zmiennych 
       System.out.println("Podaj pierwszą liczbę:"); // przy pomocy Scanner
       pierwsza_l = wej.nextInt();
       System.out.println("Podaj drugą liczbę:");
       druga_l = wej.nextInt();
 
       System.out.println("Dodawanie dwóch liczb - wciśnij +");
 
       znak = wej.next().charAt(0);  // pobieramy symbol operacji od użytkownika
       switch(znak)     // w zależności od wyboru wykonujemy daną operację
       {
           case '+':    // dodawanie dwóch zmiennych
           {
               System.out.println(pierwsza_l + druga_l);
               break;
           }
               else
               {
                   System.out.println("Nie dzielimy przez zero!!");
               }
           }
 
       }
 
    }
}
