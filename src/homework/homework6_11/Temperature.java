package homework.homework6_11;

public class Temperature implements Convertable {
    private float Kelvin;

    public Temperature(int Kelvin){
        this.Kelvin = Kelvin;
    }

    public float getKelvin() {
        return Kelvin;
    }

    public void setKelvin(float kelvin) {
        Kelvin = kelvin;
    }

    public void convert() {
        System.out.print("In Fahrenheit: ");
        System.out.println((getKelvin()-273.15)*(9./5)+32);
    }
}
