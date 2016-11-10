/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SERIE A
        int num = Integer.parseInt(JOptionPane.showInputDialog("Serie A:"));
        int num2 =0;
        
        for(int i=0; i<num; i++){
            System.out.print( (num2+=2) + " ");
                    }
        
        //SERIE B
        System.out.println("");
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Serie B:"));
        int cont =0;
        
        for(int i=1; i<=num3; i++){
            if(cont==0){
            System.out.print( "+"+i+" " );
            cont++;
            }
            else if(cont==1){
                System.out.print(-i+" ");
                cont--;
                    }
                }

            
            //SERIE C
            System.out.println("");
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Introuzca un numero:"));
        int numA = 0;
       int numB = 1;
       int numC = 0;
            for(int i=0; i<=num4; i++){
            System.out.print(numA + " ");
            numA = numA+numB;
            numC=numA-numB;
            numB = numC;
                    }
    }
    
}
