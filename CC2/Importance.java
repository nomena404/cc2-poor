package CC2;

public enum Importance {
    NORMALE("NORMALE",0),MOYENNE("MOYENNE",10),HAUTE("HAUTE",30);

    String s;
    int v;

    private Importance(String str,int i){
        s=str;
        v=i;
    }

    @Override
    public String toString(){
        return s;

    }
    public int getValeur(){
        return v;
    }
}
