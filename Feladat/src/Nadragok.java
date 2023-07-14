import java.util.ArrayList;
import java.util.List;

public class Nadragok extends Ruhak {
    private final String hosszusag;
    private List<Nadragok> nadragokList = new ArrayList<>();

    public Nadragok(String kiHordhatja, Integer allapot, String hosszusag) {
        super(kiHordhatja, allapot);
        this.hosszusag = hosszusag;
    }

    public void addNadrag(Nadragok nadrag) {
        nadragokList.add(nadrag);
    }

    public void removeNadrag(Nadragok nadrag) {
        nadragokList.remove(nadrag);
    }


    public static class AjandekNadrag extends Nadragok {

        public AjandekNadrag(String kiHordhatja, Integer allapot, String hosszusag) {
            super(kiHordhatja, allapot, hosszusag);
        }
    }

    public static class KukaNadrag extends Nadragok {
        public KukaNadrag(String kiHordhatja, Integer allapot, String hosszusag) {
            super(kiHordhatja, allapot, hosszusag);
        }
    }

    @Override
    public String toString() {
        return "Nadrágok{" + super.toString() +
                "hosszusag='" + hosszusag + '\'' +'}';
    }
}