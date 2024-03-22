package CC2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Chariot extends ArrayList {

    public final static int POID_MAX=100;

    public void ajoute(Paquet paque) throws PoidsMaxException {
    if(poidsTotal()+paque.poids()>=POID_MAX) {
    throw new PoidsMaxException();
    }
    add(paque);
    }


    public int poidsTotal() {
    int s=0;
        for (Object o : this) {
            Paquet paquet=(Paquet) o;
            s+=paquet.poids();
        }
        return s;
    }

    public void enleve(Paquet p){
    this.remove(p);
    }
    }


