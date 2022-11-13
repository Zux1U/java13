package homework.homework4_1_2;

class Phone {

    private String number;
    private String model;
    private double weight;

    public void receiveCall(String abonent_name){
        System.out.println("Call you " + abonent_name);
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Phone(){

    }

    public void receiveCall(String abonent_name, String abonent_number){
        System.out.println("Call you " + abonent_name + " from the number +" + abonent_number);
    }

    public void sendMessage(String... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Sms sent to:");
            System.out.println(numbers[i]);
        }
    }
}

class Tester{
    public static void main(String[] args) {
        Phone phone_1 = new Phone("7 123 454 54-43","hp",400);
        Phone phone_2 = new Phone("7 165 464 54-13","apple",200);
        Phone phone_3 = new Phone("7 165 267 94-13","samsung",250);
        phone_1.receiveCall("Artem");
        phone_2.receiveCall("Vanya");
        phone_3.receiveCall("Artur");
        phone_1.receiveCall("Artem","7 123 454 54-43");
        phone_1.sendMessage(phone_1.getNumber(),phone_2.getNumber(),phone_3.getNumber());
    }
}
