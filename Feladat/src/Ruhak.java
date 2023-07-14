import java.util.ArrayList;
import java.util.List;

public class Ruhak {
    private String kiHordhatja;
    private Integer allapot;

    public Ruhak(String kiHordhatja, Integer allapot) {
        this.kiHordhatja = kiHordhatja;
        this.allapot = allapot;
    }

    @Override
    public String toString() {
        return "nem= '" + kiHordhatja + '\'' +
                ", állapot= " + allapot  + ", ";
    }
}
