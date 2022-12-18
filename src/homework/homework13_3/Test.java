package homework.homework13_3;

public class Test {
    public static void main(String[] args) {
        Adress a1 = new Adress();
        Adress a2 = new Adress();
        Adress a3 = new Adress();
        Adress a4 = new Adress();

        a1.getCountry("Russia,Msk,Msk,Lenina,15,3,48");
        a2.getCountry_ver2("Russia.Spb.Msk.Pan.12.1.29");
        a3.getCountry_ver2("Russia,Spb,Msk,Pan,12,1,49");
        a4.getCountry_ver2("Russia;Spb;Msk;Pan;12;1;39");
        printAdress(a1);
        printAdress(a2);
        printAdress(a3);
        printAdress(a4);
    }
    public static void printAdress(Adress a1){
        System.out.println(a1.getCountry()+" "+a1.getRegion()+" "+a1.getCity()+" "+a1.getStreet()+" "+a1.getHome()+" "+a1.getCorpus()+" "+a1.getKv());
    }
}
