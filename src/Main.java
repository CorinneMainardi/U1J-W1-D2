import java.sql.SQLOutput;

import esercizio3.classe_es3.Es3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari("blue"));
        System.out.println("---------------------------------------------------------------");
        System.out.println(annoBisestile(2012));
        System.out.println("---------------------------------------------------------------");
        System.out.println(es2(3));

     Es3 es3 = new Es3();

     es3.es3();

    }



    public static boolean stringaPariDispari(String string){
     if(string.length() %2 == 0) return true;
     else return false;
     }

     public static boolean annoBisestile (int data){

        if(data%4 ==0 || (data%100 == 0 && data%400 ==0)) return true;
        else return false;
     }

     public static String es2(int nr){
        switch (nr){
            case 1: return "uno";

            case 2: return "due";

            case 3: return "tre";

            default: throw new Error("errore, numero non valido");

        }
     }


}