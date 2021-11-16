
package donpepe;

import java.util.Scanner;

/**
 *
 * @author JOSIAS
 */
public class DonPepe {

    public static void main(String[] args) {
        Scanner lee=new Scanner (System.in);
        
        System.out.print("ingrese el monto de su compra: $");
        double monto=lee.nextDouble();
        System.out.print("ingrese el dia que realizo su compra: ");
        String dia=lee.next();
        
        if (dia.equals("martes") || dia.equals("jueves")){
            double descuento = monto*15/100;
            double total= monto - descuento;
            System.out.println(" total a pagar: $"+total);
    }else{
            System.out.println(" total a pagar: $"+monto);
        }
        
    }
    
}
