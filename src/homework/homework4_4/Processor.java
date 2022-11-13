package homework.homework4_4;

public class Processor {

    private double clock_speed;
    private int count_core;
    private String name_processor;

    public Processor(double clock_speed, int count_core, String name_processor) {
        this.clock_speed = clock_speed;
        this.count_core = count_core;
        this.name_processor = name_processor;
    }

    public void setClock_speed(double clock_speed) {
        this.clock_speed = clock_speed;
    }

    public void setCount_core(int count_core) {
        this.count_core = count_core;
    }

    public void setName_processor(String name_processor) {
        this.name_processor = name_processor;
    }

    public double getClock_speed() {
        return clock_speed;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "clock_speed=" + clock_speed +
                ", count_core=" + count_core +
                ", name_processor='" + name_processor + '\'' +
                '}';
    }
}
