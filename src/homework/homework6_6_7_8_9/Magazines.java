package homework.homework6_6_7_8_9;

import org.w3c.dom.NameList;

public class Magazines implements Printable{
    private String Name;

    public Magazines(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void print() {
        System.out.println("Magazine is "+getName());
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
