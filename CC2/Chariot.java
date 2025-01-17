package CC2;

import java.util.*;

public class Chariot  extends ArrayList<Paquet> {

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


    @Override
public String toString(){
    return toString();
    }

    @Override
    public Iterator<Paquet> iterator() {
        return this.iterator();
    }
    public void trier(){
        Collections.sort(this);
    }

    public void trierParPoids(){
        Collections.sort(this,new Comparator<Paquet>(){
            @Override
            public int compare(Paquet p1,Paquet p2){
                return p2.poids()-p1.poids();
            }
        });
    }

}


