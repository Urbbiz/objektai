/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektai;

/**
 *
 * @author Andrius
 */
public class Objektai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Object, learning purpose
        Puodukas p1 = new Puodukas('z', 300);

        p1.setSpalva('G');
        p1.ipilk(40);
        p1.isgerk(30);

//       Namas a1 = new Namas();
//       a1.aukstai = 9;
//       a1.liftas = true;
//       a1.energetineKlase = 'c';
//      a1.nupirkoButu(120);
        Termosas t1 = new Termosas('b', 1000);
        System.out.println(t1);
        t1.pasildyk(50);
        t1.ipilk(50);
     
//Polimorfizmas
        Puodukas p3 = new Termosas('R', 1500);

//      class casting
//    Termosas t2 = p1; BLOGAI
//        Termosas t2 = (Termosas) p1;

        Object o = t1;
        if (o instanceof Puodukas) {
            System.out.println("Puodukas");
        }
//        STRINGAS JAM NEREIKIA new
        String s  = "Labas pasauli!!!";
        s = s +" ar tikrai?";
        
        System.out.println(s);

        
        System.out.println(t1.getTemp());
        System.out.println(t1.getTuris());
        System.out.println(t1.getKiekis());
    }
    
}
