/*imp
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author general
 */
public class maximo {
     
         public static int maximo_entre_3( int n1,int n2,int n3)
         {
          int mayor = 0;
             
             if (n1>n2)
             {
                  if (n1>n3) 
                  {  
                      //n1>n2 y n1>n3
                  mayor = n1;    
              }  
                  else
                  {
                      //n1>n2 n3>n1
                      mayor = n3;
                  }
                }   
             else
             {
                 //n2>n1
                 if (n2>n3)
                 {
                 // n2 > n1 y n2>n3
                     mayor = n2;
                 }
                 else 
                 {
                     mayor = n3;
                 }
             }
             return mayor;
         }
           public static void main (String[] args){  
               System.out.println (maximo_entre_3(15, 12,9));
               System.out.println (maximo_entre_3(15, 21,9));
               System.out.println (maximo_entre_3(3, 4, 9));
            }
 
}

