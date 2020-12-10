

import java.util.*;
import java.lang.*;

public class Orque {
    int id;
    Arene arene;
   private static int nbOrques=0;
    private static Orque [] tabOrques = new Orque [1000];
    public Orque( Arene arene){
        arene=arene;
        id=nbOrques;
        tabOrques[id]=this ;
        nbOrques++;
    }
   int getId(){
        return this.id;
   }
    static Orque getOrqueById
            (int ident){
        return tabOrques[ident];
    }

public int combat (Orque O2){
        int random=Ut.randomMinMax(0,1);
        if(random==0){
            return this.id ;
        }
        else return O2.id ;
}
}
