import java.util.ArrayList;
import java.util.List;

public class Polok extends Ruhak {
    private final String szin;
    private final String minta;
    private List<Polok>polokList =  new ArrayList<>();

    public Polok(String kiHordhatja, Integer allapot, String szin, String minta) {
        super(kiHordhatja, allapot);
        this.szin = szin;
        this.minta = minta;
    }
    public void addPolo (Polok polo){
        polokList.add(polo);
    }
    public void removePolo (Polok polo){
        polokList.remove(polo);
    }

    @Override
    public String toString() {
        return   "Pólók{" + super.toString() +
                "szin='" + szin + '\'' +
                ", minta='" + minta + '\'' +
                '}' ;
    }

    public static class AjandekPolo extends Polok{

        public AjandekPolo(String kiHordhatja, Integer allapot, String szin, String minta) {
            super(kiHordhatja, allapot, szin, minta);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static class KukaPolo extends Polok  {


        public KukaPolo(String kiHordhatja, Integer allapot, String szin, String minta) {
            super(kiHordhatja, allapot, szin, minta);
        }
    }
}
