package LAB11;
/*5. The current in an alternating current circuit that contains resistance, capacitance, and inductance in series is given by
Where I=current (amperes), E=voltage (volts), R= resistance (ohms), L= inductance (henrys), C= capacitance (farads) and f=frequency (hertz). 
Write a Java program that reads values for the voltage, resistance, inductance, capacitance and frequency, and then calculates and displays current.
*/
import java.util.Scanner;
public class cse111Lab03task5{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("voltage?");
    double v=abir.nextDouble();
    System.out.println("Resistance?");
    double r=abir.nextDouble();
    System.out.println("inductance?");
    double i=abir.nextDouble();
    System.out.println("capacitance?");
    double c=abir.nextDouble();
    System.out.println("frequwncy?");
    double f=abir.nextDouble();
    double vol=0;
    vol=v/Math.sqrt((r*r)+Math.pow(2*Math.PI*f*i-(1/2*Math.PI*f*c),2));
    System.out.println(vol);
  }
}