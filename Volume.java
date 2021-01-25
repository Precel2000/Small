//programme to calculate the volume of a sphere

import java.util.Scanner;

public class Volume {
    public static void main(String args[]) {
    //initialise variables
    float r; 
    double v;
    //convert inbuilt PI value to float
    final float pi=(float)Math.PI;
    //instanciate scanner object
    Scanner scanner = new Scanner(System.in);
    //fetch user input
    System.out.println("Radius of sphere in cm ");
    r = scanner.nextFloat();
    System.out.format("You entered %.3f cm%n",r);
    //convert input to m
    System.out.format("which is %.3f m%n",r/100);    

    //calculate the volume
    v=(4.0*pi*Math.pow(r,3))/3.0;
    //print the volume correct to 9dp
    System.out.format("Volume of the sphere is: %.9f cubic m%n", v);

    }
}
