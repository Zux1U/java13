package homework.homework13_3;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String home;
    private String corpus;
    private String kv;

    public void getCountry(String s1){
        String[] words = s1.split(",");
        country = words[0];
        region = words[1];
        city = words[2];
        street = words[3];
        home = words[4];
        corpus = words[5];
        kv = words[6];
    }
    public void getCountry_ver2(String s1){
        String[] words = s1.split("[,;.]");
        country = words[0];
        region = words[1];
        city = words[2];
        street = words[3];
        home = words[4];
        corpus = words[5];
        kv = words[6];
    }

    public void printAdress(Adress a1){
        System.out.println(a1.getCountry()+" "+a1.getRegion()+" "+a1.getCity()+" "+a1.getStreet()+" "+a1.getHome()+" "+a1.getCorpus()+" "+a1.getKv());
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHome() {
        return home;
    }

    public String getCorpus() {
        return corpus;
    }

    public String getKv() {
        return kv;
    }


}
