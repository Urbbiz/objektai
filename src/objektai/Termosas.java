package objektai;

public class Termosas extends Puodukas {

    private int temp;

    public Termosas(char spalva, int turis) {
        super(spalva, turis);
        this.temp = 20;
    }
    public int getTemp() {
    return this.temp;
    }
    public int getKiekis() {
    return this.kiekis;
    }
    
    public void pasildyk(int kiek){
    if (kiek <=0){
    return;
    }
        this.temp += kiek;
    }
    
    public void atvesink(int kiek){
    if (kiek <=0){
    return;
    }
        this.temp -= kiek;
    }
    
    public void ipilk( int kiek){
        super.ipilk(kiek);
//    if (kiek <= 0) {
//        return;
//        }
//        this.kiekis += kiek;
//        if (this.kiekis > this.turis){
//            this.kiekis = this.turis;
//        }
        this.temp -= 5;
        }
    
    public String toString (){
        return "Mano termosas";
    }



}
