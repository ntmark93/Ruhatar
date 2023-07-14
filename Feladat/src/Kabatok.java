import java.util.ArrayList;
import java.util.List;

public class Kabatok extends Ruhak {
    private final String tipus;
    private List<Kabatok> kabatokList = new ArrayList<>();

    public Kabatok(String kiHordhatja, Integer allapot, String tipus) {
        super(kiHordhatja, allapot);
        this.tipus = tipus;
    }

    public void addKabat(Kabatok kabat) {
        kabatokList.add(kabat);
    }

    public void removeKabat(Kabatok kabat) {
        kabatokList.remove(kabat);
    }

    @Override
    public String toString() {
        return  "Kabátok{" + super.toString() + "típus= '" +tipus +
                '}';
    }
    public static class AjandekKabatok extends Kabatok{
        public AjandekKabatok(String kiHordhatja, Integer allapot, String tipus) {
            super(kiHordhatja, allapot, tipus);
        }
    }
    public static class kukaKabatok extends Kabatok{
        public kukaKabatok(String kiHordhatja, Integer allapot, String tipus) {
            super(kiHordhatja, allapot, tipus);
        }
    }
}
