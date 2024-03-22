package CC2;

public class Paquet implements Comparable<Paquet> {
    private final String element;
    private final  int poid;
    public Importance importance;

    public Paquet(String elt,int p,Importance imp){
        element=elt;
        poid=p;
        importance= imp;
    }
    public Paquet(String elt,int p){
        this(elt,p,Importance.NORMALE);
    }

    public int poids(){
        return poid;
    }


    @Override
    public String toString(){
        return element +"("+ poid +","+importance.toString() +")";
    }
    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Paquet)) return false;
        Paquet p=(Paquet)o;
        return this.importance.equals(p.importance)&& p.poid==this.poid && this.element.equals(p.element);
    }

    public String getImportance(){
        return importance.toString();
    }

    public int getPriorite(){
        return  poid +importance.getValeur();
    }

    @Override
    public int compareTo(Paquet o) {
        int b= o.getPriorite()-this.getPriorite();
        if(b==0) {
            b= o.importance.getValeur() - this.importance.getValeur();
            if(b==0){
              b= o.element.compareTo(this.element);
            }
        }
      return b;
    }
}
