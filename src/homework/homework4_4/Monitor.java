package homework.homework4_4;

public class Monitor {

    private int hz;
    private String type_monitor;

    public Monitor(int hz, String type_monitor) {
        this.hz = hz;
        this.type_monitor = type_monitor;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "hz=" + hz +
                ", type_monitor='" + type_monitor + '\'' +
                '}';
    }
}
