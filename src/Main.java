import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String c = JOptionPane.showInputDialog("The temperature in Celsius?");
        double cel = Double.parseDouble(c);

        double fahrenheit = Celsius.celFah(cel);
        double kelvin = Fahrenheit.fahKel(fahrenheit);
        double celsius = Kelvin.kelCel(kelvin);

        String res = String.format("The temperature in..\nFahrenheit:\t %4.2f \nKelvin:\t %4.2f \nCelsius:\t %4.2f",
                fahrenheit, kelvin, celsius);

        JOptionPane.showMessageDialog(null, res, "Temperature Converter", JOptionPane.INFORMATION_MESSAGE);
    }
}