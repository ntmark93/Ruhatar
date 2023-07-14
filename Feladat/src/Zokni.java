import java.util.ArrayList;
import java.util.List;

public class Zokni extends Ruhak {
    private final String tipusa;
    private List<Zokni> zokniList = new ArrayList<>();

    public Zokni(String kiHordhatja, Integer allapot, String tipusa) {
        super(kiHordhatja, allapot);
        this.tipusa = tipusa;
    }

    public void addZokni(Zokni zokni) {
        zokniList.add(zokni);
    }

    public static class AjandekZokni extends Zokni {
        public AjandekZokni(String kiHordhatja, Integer allapot, String tipusa) {
            super(kiHordhatja, allapot, tipusa);
        }
    }

    public static class KukaZokni extends Zokni {
        public KukaZokni(String kiHordhatja, Integer allapot, String tipusa) {
            super(kiHordhatja, allapot, tipusa);
        }
    }

    @Override
    public String toString() {
        return "Zokni{" + super.toString() +
                "tipusa='" + tipusa + '\'' +
                '}';
    }
}