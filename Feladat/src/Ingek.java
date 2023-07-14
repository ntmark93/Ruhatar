import java.util.ArrayList;
import java.util.List;

public class Ingek extends Ruhak {
    private final String hosszuUjju;
    private List<Ingek> ingekList = new ArrayList<>();

    public Ingek(String kiHordhatja, Integer allapot, String hosszuUjju) {
        super(kiHordhatja, allapot);
        this.hosszuUjju = hosszuUjju;
    }

    public void addIng(Ingek ing) {
        ingekList.add(ing);
    }

    public void removeIng(Ingek ing) {
        ingekList.remove(ing);
    }

    @Override
    public String toString() {
        return "Ingek{" + super.toString() +
                "hosszú ujjú='" + hosszuUjju + '\'' +
                '}';
    }


    public static class AjandekIng extends Ingek {
        public AjandekIng(String kiHordhatja, Integer allapot, String hosszuUjju) {
            super(kiHordhatja, allapot, hosszuUjju);
        }
    }

    public static class KukaIng extends Ingek {
        public KukaIng(String kiHordhatja, Integer allapot, String hosszuUjju) {
            super(kiHordhatja, allapot, hosszuUjju);
        }
    }
}