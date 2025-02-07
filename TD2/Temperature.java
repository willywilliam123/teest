public class Temperature {
    double temp;
    String unit;
    public Temperature(double temp, String unit){
        this.temp = temp;
        this.unit = switch(unit) {
            case "Fahrenheit" -> "Fahrenheit";
            case "Celsisus" -> "Celsisus";
            default -> "Kelvin";
        };
    }
}
