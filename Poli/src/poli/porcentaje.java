/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author general
 */

public class porcentaje {
    public static double promedio_5_numeros (int n1,int n2,int n3,int n4,int n5){
               
        double promedio;
        
         promedio = (n1+n2+n3+n4+n5)/5.0;
         
         return promedio;
    }
    public static void main (String[] args){  
               System.out.println (promedio_5_numeros(15,12,9,2,5));
               System.out.println (promedio_5_numeros(15,21,9,7,2));
               System.out.println (promedio_5_numeros(3,4,9,5,4));
    }
    
}
