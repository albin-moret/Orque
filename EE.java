
public class EE {
    private int[] ensTab;
    private int cardinal;
    public EE(int max) {
        ensTab = new int[max];
        cardinal = 0;
    }

    public EE(int max, int[] tab) {
        this(max);
        this.cardinal = tab.length;
        for (int i = 0; i < cardinal; i++) {
            this.ensTab[i] = tab[i];
        }
    }


    public EE(EE aCopier) {
        this(aCopier.ensTab.length);
        this.cardinal = aCopier.cardinal;
        for (int i = 0; i < this.cardinal; i++) {
            this.ensTab[i] = aCopier.ensTab[i];
        }
    }

    public String toString() {
        if (cardinal == 0) {
            return "{ }";
        }
        String res = "{";
        for (int i = 0; i < cardinal - 1; i++) {
            res += ensTab[i] + ",";
        }
        res += ensTab[cardinal - 1] + "}";
        return res;
    }

    public int getCardinal() {
        return cardinal;
    }

    private int contientPratique(int n) {
        for (int i = 0; i < cardinal; i++) {
            if (ensTab[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public boolean contient(int n) {
        return (contientPratique(n) != -1);
    }

    private void ajoutPratique(int e) {
        ensTab[cardinal] = e;
        cardinal++;
    }

    private int retraitPratique(int i) {
        int res = ensTab[i];
        ensTab[i] = ensTab[cardinal - 1];
        cardinal--;
        return res;
    }

    public boolean estVide() {
        return (cardinal == 0);
    }

    private boolean deborde() {
        return (cardinal == ensTab.length);
    }

    public boolean retraitElt(int elt) {
        if (contient(elt)) {
            retraitPratique(contientPratique(elt));
            return true;
        }
        return false;
    }

    public int ajoutElt(int elt) {
        if (deborde()) {
            return -1;
        }
        if (contient(elt)) {
            return 0;
        }
        ajoutPratique(elt);
        return 1;
    }
    public int retraitEltAleatoirement() {
// Pr´e-requis : ensemble this est non vide
// R´esultat/action : enl`eve un ´el´ement de this (al´eatoirement) et le renvoie
        int i = Ut.randomMinMax (0, this.cardinal - 1);
        int select = retraitPratique(i);
        return select;
    }
    public int selectionUnElt() {
// Pr´e-requis : ensemble this est non vide
// R´esultat : un ´el´ement quelconque de this (le dernier, par commodit´e)
        return this.ensTab[this.cardinal - 1];
    }

}