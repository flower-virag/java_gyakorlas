/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;


public class Gyakorlas {

    
    public static void main(String[] args) {
        //vizsgaeredmenyek();
        //homerseklet();
        mozijegy();
    }

    public static void vizsgaeredmenyek() {
        int szazalek = 11;
        
        if (szazalek == 100) {
            System.out.println("Kivaloan teljesitettel! Gratulalok!");
        } 
        else if (szazalek >= 85 && szazalek < 100) {
            System.out.println("Jeles");
        }
        else if (szazalek >= 65 && szazalek <= 84) {
            System.out.println("Jo");
        }
        else if (szazalek >= 51 && szazalek <= 66) {
            System.out.println("Kozepes");
        }
        else if (szazalek >= 40 && szazalek <= 50) {
            System.out.println("Elegseges");
        }
        else{
            System.out.println("Elegtelen");
        }
    }
    
    public static void homerseklet(){
        int hofok = 22;
        
        if (hofok == 0) {
            System.out.println("Pontosan 0 fok van");
        }
        else if(hofok < 0) {
            System.out.println("Fagy");
        }
        else if(hofok >= 0 && hofok <= 7 ) {
            System.out.println("Hideg");
        }
        else if(hofok >= 8 && hofok <= 15 ) {
            System.out.println("Kellemes");
        }
        else if(hofok >= 16 && hofok <= 25 ) {
            System.out.println("Meleg");
        }
        else{
            System.out.println("Forro");
        }
    }
    
    public static void mozijegy(){
        int kor = 20;
        boolean diakig = true;
        
        int jegyAr = 0;
        String jegyTipus = "";
        
        if (kor >= 0 && kor <= 5) {
            jegyTipus = "Ingyenes Jegy";
            jegyAr = 0;
        }
    }
    
}
