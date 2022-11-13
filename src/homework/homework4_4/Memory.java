package homework.homework4_4;

public class Memory {

    private int ram_size;
    private int count_ram;
    private String ram_name;

    public Memory(int ram_size, int count_ram, String ram_name) {
        this.ram_size = ram_size;
        this.count_ram = count_ram;
        this.ram_name = ram_name;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "ram_size=" + ram_size +
                ", count_ram=" + count_ram +
                ", ram_name='" + ram_name + '\'' +
                '}';
    }
}
