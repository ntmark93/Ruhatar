import java.util.ArrayList;
import java.util.List;

public class Cipok extends Ruhak {
    private final Integer meret;
    private List<Cipok> cipokList = new ArrayList<>();

    public Cipok(String kiHordhatja, Integer allapot, Integer meret) {
        super(kiHordhatja, allapot);
        this.meret = meret;
    }

    public void addCipo(Cipok cipo) {
        cipokList.add(cipo);
    }

    public void removeCipo(Cipok cipo) {
        cipokList.remove(cipo);
    }


    public static class AjandekCipo extends Cipok {
        public AjandekCipo(String kiHordhatja, Integer allapot, Integer meret) {
            super(kiHordhatja, allapot, meret);
        }
    }

    public static class KukaCipo extends Cipok {
        public KukaCipo(String kiHordhatja, Integer allapot, Integer meret) {
            super(kiHordhatja, allapot, meret);
        }
    }

    @Override
    public String toString() {
        return "Cipők{" + super.toString() +
                "méret=" + meret +
                '}';
    }
}