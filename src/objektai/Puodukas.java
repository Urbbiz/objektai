
package objektai;

public class Puodukas {
    
    private char spalva;
    private int turis;
    private int kiekis;
    
    public Puodukas(char spalva, int turis) {
    this.spalva = spalva;
    this.turis = turis;
    this.kiekis = 0;
    }
//Geteris
    public int getTuris() {
    return this.turis;
    }
    
    public char getSpalva(){
        return this.spalva;
    }
    
//    SETERIAI
    public void setSpalva(char spalva){
    this.spalva = spalva;
    }
    
//    Boolean  tipo geteris:
    public boolean getPilnas(){
    return this.kiekis == this.turis;
    }
    
    public void ipilk(int kiek) {
        this.kiekis += kiek;
        if (this.kiekis > this.turis){
            this.kiekis = this.turis;
        
        }
    }

    public void isgerk(int kiekis) {
        this.kiekis -= kiekis;
        if (this.kiekis < 0){
        this.kiekis = 0;
        }
        }
    }

