public class Arene {
    int nbo ;
    private EE EEOrque ;
    public Arene(int nbo){
        EEOrque=new EE(nbo);
        for(int i = 0; i<nbo ;i++){
            Orque o1 = new Orque(this);
            EEOrque.ajoutElt(o1.getId());
        }
    }

public Orque bataille(){
int a = EEOrque.retraitEltAleatoirement();
    int b = EEOrque.retraitEltAleatoirement();
combat(a);
}
}
