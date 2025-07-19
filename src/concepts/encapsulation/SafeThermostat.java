package concepts.encapsulation;

class Thermostat{
    private double temperature;
    public void setTemperature(double temperature){
        if(10 <= temperature && temperature <= 30){
            this.temperature = temperature;
            System.out.println("Temperature set to: " + temperature);
        }else if(temperature < 0){
            System.out.println("Error: Temperature cannot be negative");
        }else{
            System.out.println("Temperature out of range");
        }
    }
    public double getTemperature(){
        return this.temperature;
    }
}
public class SafeThermostat {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.setTemperature(10);
        thermostat.setTemperature(40);
        thermostat.setTemperature(25);
        thermostat.setTemperature(-2);
    }
}
