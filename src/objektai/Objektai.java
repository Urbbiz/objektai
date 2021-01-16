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
//        p1.spalva = 'r';
//        p1.turis = 300;
//        p1.kiekis = 0;
        
//        Puodukas p2 = new Puodukas('b', 150);
//        p2.spalva = 'b';
//        p2.turis = 150;
//        p2.kiekis = 0;
        p1.setSpalva('G');
       p1.ipilk(40);
       p1.isgerk(30);
       
       
//       Namas a1 = new Namas();
//       a1.aukstai = 9;
//       a1.liftas = true;
//       a1.energetineKlase = 'c';
//      a1.nupirkoButu(120);
      
      
        System.out.println(p1.getSpalva());
        System.out.println(p1.getPilnas());
    }
  
}
