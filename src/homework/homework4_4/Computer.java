package homework.homework4_4;

public class Computer {
    public static void main(String[] args) {

        TypePC(TypeComputer.CHEAP_COMPUTER);
        TypePC(TypeComputer.NORMAL_COMPUTER);
        TypePC(TypeComputer.EXPENSIVE_COMPUTER);

    }

    public static void TypePC(TypeComputer typecomputer) {
        switch (typecomputer) {
            case CHEAP_COMPUTER:
                Processor cheap_processor = new Processor(2.5, 4, "INTEL 3");
                Monitor cheap_monitor = new Monitor(60,"vga");
                Memory cheap_memory= new Memory(4,1,"crucial");
                System.out.println("Characteristic cheap pc:");
                System.out.println(cheap_processor);
                System.out.println(cheap_memory);
                System.out.println(cheap_monitor);
                System.out.println(cheap_processor.getClock_speed());
                System.out.println();
                break;
            case NORMAL_COMPUTER:
                Processor normal_processor = new Processor(3.5, 6, "INTEL 5");
                Monitor normal_monitor = new Monitor(120,"vga");
                Memory normal_memory= new Memory(8,2,"samsung");
                System.out.println("Characteristic normal pc:");
                System.out.println(normal_processor);
                System.out.println(normal_memory);
                System.out.println(normal_monitor);
                System.out.println();
                break;
            case EXPENSIVE_COMPUTER:
                Processor expensive_processor = new Processor(4.2, 8, "INTEL 7");
                Monitor expensive_monitor = new Monitor(240,"ips");
                Memory expensive_memory= new Memory(32,4,"asus");
                System.out.println("Characteristic expensive pc:");
                System.out.println(expensive_processor);
                System.out.println(expensive_memory);
                System.out.println(expensive_monitor);
                break;
        }
    }
}


