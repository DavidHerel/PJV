/*
 * File name: Lab06.java
 * Date:      2014/08/26 21:39
 * Author:    @author
 */
 
package cz.cvut.fel.pjv;
 
import java.util.Scanner;
 
 
public class Lab02 {
 
   public void homework() {
       TextIO line = new TextIO();
       int lin = 1;
       int mod = 1;
       String lane;
       double number;
       double avg = 0;
       double[] array = new double[10];
       double dev;
       int kons = 0;
        
       while (true){
        lane = line.getLine();
        if (TextIO.isDouble(lane) || TextIO.isInteger(lane) || TextIO.isFloat(lane)){
            number = Double.parseDouble(lane);
            array[(mod-1)%10] = number;
            avg += number;
            if (((mod)%10) == 0){
                dev = deviation(array, (avg/10), 10);
                System.out.printf("10 %.3f %.3f\n", (avg/10), Math.sqrt(dev));
                avg = 0;
                kons = 1;
                 
            }
            mod++;
        } else{
            System.err.printf("A number has not been parsed from line %d\n", lin);
        }
        if (line.hasNex()){
            if (((mod-1)%10) > 1){
                if (kons >= 1){
                    dev = deviation2(array, (avg/((mod-1)%10)), ((mod-1)%10));
                } else{
                    dev = deviation(array, (avg/((mod-1)%10)), ((mod-1)%10));
                }
                System.err.println("End of input detected!");
                System.out.printf("%2d %.3f %.3f\n", (mod-1)%10, (avg/((mod-1)%10)), Math.sqrt(dev));
                return;
            }
            System.err.println("End of input detected!");
            return;
        }
        lin++;
       }
   }
    
   public double deviation(double[] array, double avg, int mod){
       double dev = 0;
       for (int i = 0; i < mod; i++){
           dev += Math.pow((array[i])-avg, 2);
       }
       return dev/(mod);
   }
    
    public double deviation2(double[] array, double avg, int mod){
        double dev = 0;
        for (int i = 0; i < (mod%10); i++){
            dev += Math.pow((array[i])-avg, 2);
        }
        return dev/(mod%10);
   }
}
 
/* end of Lab02.java */