package TD2;

public class Temperature {
    double temp;
    String unit;
    public Temperature(){
        this.temp = 0;
        this.unit = "Kelvin";
    }
    public Temperature(double temp, String unit) {
        this.temp = temp;
        if(unit != "Kelvin" && unit != "Celsius" && unit != "Fahrenheit") {
            this.unit = "Kelvin";
        } else {
            this.unit = unit;
        }
    }
    public Temperature(Temperature temp) {
        this.temp = temp.temp;
        this.unit = temp.unit;
    }
}
