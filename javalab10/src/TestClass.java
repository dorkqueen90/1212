import java.util.Scanner;

public class TestClass {

    public static void main(String[] args){
        //set celsius to 20
        TemperatureConverter cel = new TemperatureConverter(20);

        //call toString()
        System.out.println(cel.toString());

        //set kelvin to 273.15
        cel.setKelvin(273.15);

        //call toString()
        System.out.println(cel.toString());
    }
}
