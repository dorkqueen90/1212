/*
@author amber
@version 4/29/19
 */

public class TemperatureConverter {

    private double celsius;
    private double fahrenheit;
    private double kelvin;


    public TemperatureConverter(double c){
        celsius = c;
        //calculate fahrenheit
        fahrenheit = (celsius * 9/5) + 32;
        //calculate kelvin
        kelvin = (celsius + 273.15);

    }

    public double getFahrenheit(){
        return fahrenheit;
    }
    public double getKelvin(){
        return kelvin;
    }
    public double getCelsius(){
        return celsius;
    }

    public void setCelsius(double newCelsius){
        celsius = newCelsius;
        fahrenheit = (celsius * 9/5) + 32;
        kelvin = (celsius + 273.15);

    }
    public void setFahrenheit(double newFahrenheit){
        fahrenheit = newFahrenheit;
        celsius = (fahrenheit - 32) * 5/9;
        kelvin = (fahrenheit - 32) * 5/9 + 273.15;
    }
    public void setKelvin(double newKelvin){
        kelvin = newKelvin;
        celsius = kelvin - 273.15;
        fahrenheit = (kelvin - 273.15) * 9/5 + 32;
    }
    public String toString(){
        return "Today's temperature is " + celsius + " Celsius" + " or " + fahrenheit
                + " Fahrenheit " + " or " + kelvin + " Kelvin";
    }
}
