import java.util.ArrayList;
import java.util.List;

public class Szekreny {
    static List<String> allCount = FileInputHandler.getLinesOfTextFile("src/clothes.txt");
    static List<Polok> polokList = new ArrayList<>();
    static List<Ingek> ingekList = new ArrayList<>();
    static List<Nadragok> nadragokList = new ArrayList<>();
    static List<Kabatok> kabatokList = new ArrayList<>();
    static List<Cipok> cipokList = new ArrayList<>();
    static List<Zokni> zokniList = new ArrayList<>();
    static List<Polok.AjandekPolo> ajandekba = new ArrayList<>();
    static List<Ingek.AjandekIng> ajandeking = new ArrayList<>();
    static List<Nadragok.AjandekNadrag> ajandekNadrag = new ArrayList<>();
    static List<Kabatok.AjandekKabatok> ajandekKabatok = new ArrayList<>();
    static List<Cipok.AjandekCipo> ajandekCipok = new ArrayList<>();
    static List<Zokni.AjandekZokni> ajandekZoknik = new ArrayList<>();
    static List<Polok.KukaPolo> kuka = new ArrayList<>();
    static List<Ingek.KukaIng> kukaIng = new ArrayList<>();
    static List<Nadragok.KukaNadrag> kukaNagrag = new ArrayList<>();
    static List<Kabatok.kukaKabatok> kukaKabatok = new ArrayList<>();
    static List<Cipok.KukaCipo> kukaCipok = new ArrayList<>();
    static List<Zokni.KukaZokni> kukaZoknik = new ArrayList<>();


    public static void main(String[] args) {
        countAll();
        createPolok();
        createIngek();
        createNadragok();
        createKabatok();
        createCipok();
        createZoknik();
    }

    public static void createPolok() {
        int countUsable = 0;
        int countGift = 0;
        int countTrash = 0;

        for (String polok : allCount) {
            String[] polokData = polok.split(",");
            if (polokData[0].equals("póló") && Integer.parseInt(polokData[2]) >= 4) {
                polokList.add(new Polok(
                        polokData[1],
                        Integer.parseInt(polokData[2]),
                        polokData[3],
                        polokData[4]));
                countUsable++;
            } else if (polokData[0].equals("póló") && Integer.parseInt(polokData[2]) < 4 && Integer.parseInt(polokData[2]) > 1) {
                ajandekba.add(new Polok.AjandekPolo(
                        polokData[1],
                        Integer.parseInt(polokData[2]),
                        polokData[3],
                        polokData[4]));
                countGift++;
            } else if (polokData[0].equals("póló") && Integer.parseInt(polokData[2]) < 2) {
                kuka.add(new Polok.KukaPolo(
                        polokData[1],
                        Integer.parseInt(polokData[2]),
                        polokData[3],
                        polokData[4]));
                countTrash++;
            }
        }
        System.out.println("Használható pólók száma: " + countUsable + " db");
        System.out.println("Elajándékozott pólók száma: " + countGift + " db");
        System.out.println("Hordásra nem alkalmas pólók száma: " + countTrash + " db");
        int poloTotal = countUsable + countGift + countTrash;
        System.out.println("Összes póló: " + poloTotal + " db");
        for (Polok polok : polokList) {
            System.out.println(polok);
        }
        for (Polok.AjandekPolo aji : ajandekba) {
            System.out.println(aji);
        }
        for (Polok.KukaPolo kukaPolo : kuka) {
            System.out.println(kukaPolo);
        }
    }

    public static void createIngek() {
        int countUsable = 0;
        int countGift = 0;
        int countTrash = 0;

        for (String ingek : allCount) {
            String[] ingekData = ingek.split(",");
            if (ingekData[0].equals("ing") && Integer.parseInt(ingekData[2]) >= 4) {
                ingekList.add(new Ingek(
                        ingekData[1],
                        Integer.parseInt(ingekData[2]),
                        ingekData[3]));
                countUsable++;
            } else if (ingekData[0].equals("ing") && Integer.parseInt(ingekData[2]) < 4 && Integer.parseInt(ingekData[2]) > 1) {
                ajandeking.add(new Ingek.AjandekIng(
                        ingekData[1],
                        Integer.parseInt(ingekData[2]),
                        ingekData[3]));
                countGift++;
            } else if (ingekData[0].equals("ing") && Integer.parseInt(ingekData[2]) < 2) {
                kukaIng.add(new Ingek.KukaIng(
                        ingekData[1],
                        Integer.parseInt(ingekData[2]),
                        ingekData[3]));
                countTrash++;
            }
        }
        System.out.println("Használható ingek száma: " + countUsable + " db");
        System.out.println("Elajándékozott ingek száma: " + countGift + " db");
        System.out.println("Hordásra nem alkalmas ingek száma: " + countTrash + " db");
        int Total = countUsable + countGift + countTrash;
        System.out.println("Összes ing: " + Total + " db");
        for (Ingek ingek : ingekList) {
            System.out.println(ingek);
        }
        for (Ingek.AjandekIng ingek : ajandeking) {
            System.out.println(ingek);
        }
        for (Ingek.KukaIng ingek : kukaIng) {
            System.out.println(ingek);
        }
    }

    public static void createNadragok() {
        int countUsable = 0;
        int countGift = 0;
        int countTrash = 0;

        for (String nadragok : allCount) {
            String[] nadragokData = nadragok.split(",");
            if (nadragokData[0].equals("nadrág") && Integer.parseInt(nadragokData[2]) >= 4) {
                nadragokList.add(new Nadragok(
                        nadragokData[1],
                        Integer.parseInt(nadragokData[2]),
                        nadragokData[3]));
                countUsable++;
            } else if (nadragokData[0].equals("nadrág") && Integer.parseInt(nadragokData[2]) < 4 && Integer.parseInt(nadragokData[2]) > 1) {
                ajandekNadrag.add(new Nadragok.AjandekNadrag(
                        nadragokData[1],
                        Integer.parseInt(nadragokData[2]),
                        nadragokData[3]));
                countGift++;
            } else if (nadragokData[0].equals("nadrág") && Integer.parseInt(nadragokData[2]) < 2) {
                kukaNagrag.add(new Nadragok.KukaNadrag(
                        nadragokData[1],
                        Integer.parseInt(nadragokData[2]),
                        nadragokData[3]));
                countTrash++;
            }
        }
        System.out.println("Használható nadrágok száma: " + countUsable + " db");
        System.out.println("Elajándékozott nadrágok száma: " + countGift + " db");
        System.out.println("Hordásra nem alkalmas nadrágok száma: " + countTrash + " db");
        int Total = countUsable + countGift + countTrash;
        System.out.println("Összes nadrág: " + Total + " db");
        for (Nadragok nadragok : nadragokList) {
            System.out.println(nadragok);
        }
        for (Nadragok.AjandekNadrag nadragok : ajandekNadrag) {
            System.out.println(nadragok);
        }
        for (Nadragok.KukaNadrag nadragok : kukaNagrag) {
            System.out.println(nadragok);
        }
    }

    public static void createKabatok() {
        int countUsable = 0;
        int countGift = 0;
        int countTrash = 0;

        for (String kabatok : allCount) {
            String[] kabatokData = kabatok.split(",");
            if (kabatokData[0].equals("kabát") && Integer.parseInt(kabatokData[2]) >= 4) {
                kabatokList.add(new Kabatok(
                        kabatokData[1],
                        Integer.parseInt(kabatokData[2]),
                        kabatokData[3]));
                countUsable++;
            } else if (kabatokData[0].equals("kabát") && Integer.parseInt(kabatokData[2]) < 4 && Integer.parseInt(kabatokData[2]) > 1) {
                ajandekKabatok.add(new Kabatok.AjandekKabatok(
                        kabatokData[1],
                        Integer.parseInt(kabatokData[2]),
                        kabatokData[3]));
                countGift++;
            } else if (kabatokData[0].equals("kabát") && Integer.parseInt(kabatokData[2]) < 2) {
                kukaKabatok.add(new Kabatok.kukaKabatok(
                        kabatokData[1],
                        Integer.parseInt(kabatokData[2]),
                        kabatokData[3]));
                countTrash++;
            }
        }
        System.out.println("Használható kabátok száma: " + countUsable + " db");
        System.out.println("Elajándékozott kabátok száma: " + countGift + " db");
        System.out.println("Hordásra nem alkalmas kabátok száma: " + countTrash + " db");
        int Total = countUsable + countGift + countTrash;
        System.out.println("Összes kabát: " + Total + " db");
        for (Kabatok kabatok : kabatokList) {
            System.out.println(kabatok);
        }
        for (Kabatok.AjandekKabatok kabatok : ajandekKabatok) {
            System.out.println(kabatok);
        }
        for (Kabatok.kukaKabatok kabatok : kukaKabatok) {
            System.out.println(kabatok);
        }
    }

    public static void createCipok() {
        int countUsable = 0;
        int countGift = 0;
        int countTrash = 0;

        for (String cipok : allCount) {
            String[] cipokkData = cipok.split(",");
            if (cipokkData[0].equals("cipő") && Integer.parseInt(cipokkData[2]) >= 4) {
                cipokList.add(new Cipok(
                        cipokkData[1],
                        Integer.parseInt(cipokkData[2]),
                        Integer.parseInt(cipokkData[3])));
                countUsable++;
            } else if (cipokkData[0].equals("cipő") && Integer.parseInt(cipokkData[2]) < 4 && Integer.parseInt(cipokkData[2]) > 1) {
                ajandekCipok.add(new Cipok.AjandekCipo(
                        cipokkData[1],
                        Integer.parseInt(cipokkData[2]),
                        Integer.parseInt(cipokkData[3])));
                countGift++;
            } else if (cipokkData[0].equals("cipő") && Integer.parseInt(cipokkData[2]) < 2) {
                kukaCipok.add(new Cipok.KukaCipo(
                        cipokkData[1],
                        Integer.parseInt(cipokkData[2]),
                        Integer.parseInt(cipokkData[3])));
                countTrash++;
            }
        }
        System.out.println("Használható cipők száma: " + countUsable + " db");
        System.out.println("Elajándékozott cipők száma: " + countGift + " db");
        System.out.println("Hordásra nem alkalmas cipők száma: " + countTrash + " db");
        int Total = countUsable + countGift + countTrash;
        System.out.println("Összes cipő: " + Total + " db");
        for (Cipok cipok : cipokList) {
            System.out.println(cipok);
        }
        for (Cipok.AjandekCipo cipok : ajandekCipok) {
            System.out.println(cipok);
        }
        for (Cipok.KukaCipo cipok : kukaCipok) {
            System.out.println(cipok);
        }
    }

    public static void createZoknik() {
        int countUsable = 0;
        int countGift = 0;
        int countTrash = 0;

        for (String zokni : allCount) {
            String[] zoknikData = zokni.split(",");
            if (zoknikData[0].equals("zokni") && Integer.parseInt(zoknikData[2]) >= 4) {
                zokniList.add(new Zokni(
                        zoknikData[1],
                        Integer.parseInt(zoknikData[2]),
                        zoknikData[3]));
                countUsable++;
            } else if (zoknikData[0].equals("zokni") && Integer.parseInt(zoknikData[2]) < 4 && Integer.parseInt(zoknikData[2]) > 1) {
                ajandekZoknik.add(new Zokni.AjandekZokni(
                        zoknikData[1],
                        Integer.parseInt(zoknikData[2]),
                        zoknikData[3]));
                countGift++;
            } else if (zoknikData[0].equals("zokni") && Integer.parseInt(zoknikData[2]) < 2) {
                kukaZoknik.add(new Zokni.KukaZokni(
                        zoknikData[1],
                        Integer.parseInt(zoknikData[2]),
                        zoknikData[3]));
                countTrash++;
            }
        }
        System.out.println("Használható zoknik száma: " + countUsable + " db");
        System.out.println("Elajándékozott zoknik száma: " + countGift + " db");
        System.out.println("Hordásra nem alkalmas zoknik száma: " + countTrash + " db");
        int Total = countUsable + countGift + countTrash;
        System.out.println("Összes zokni: " + Total + " db");
        for (Zokni zokni : zokniList) {
            System.out.println(zokni);
        }
        for (Zokni.AjandekZokni zokni : ajandekZoknik) {
            System.out.println(zokni);
        }
        for (Zokni.KukaZokni zokni : kukaZoknik) {
            System.out.println(zokni);
        }
    }

    public static void countAll() {
        int countAllItems = 0;
        for (int i = 0; i < allCount.size(); i++) {
            countAllItems++;
        }
        System.out.println("A ruhatár teljes darabszáma a szortírozást megelőzően: " + countAllItems);
    }

}