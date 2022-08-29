/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2.proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Josue
 */
public class Proyec1 {
public static int main(String[] args) {


//public static int nrandom()
//{
//Random j=new Random();  
// int n =j.nextInt(200)+50;  
//  return n;
////}

     List<ClsVendedores> misEmp = new ArrayList();

////        public static List empleados{
//Random j=new Random();  
// int n =j.nextInt(200)+50;  
//  return n;

        ClsVendedores ven = new ClsVendedores("Leonel");
    double n;
      
        ven.setEnero(n);
        
        ven.setFebrero(n);
        ven.setMarzo(n);
System.out.println(n);
System.out.println(n);
        misEmp.add(ven);
        
        ven=new ClsVendedores("Luis");
        ven.setEnero(n);
        ven.setFebrero(n);
        ven.setMarzo(n);
        misEmp.add(ven);
 
        
        ven = new ClsVendedores("Donald");
        ven.setEnero(n);
        ven.setFebrero(n);
        ven.setMarzo(n);
        misEmp.add(ven);
Random j=new Random();  
 int n =j.nextInt(200)+50;  
  return n;
//}
 
        ven = new ClsVendedores("nuevo");
        
        double sumaEnero = 0;
        
        
        misEmp.forEach((ob) -> System.out.println(ob.getNombre()));
        
        
        for (ClsVendedores v : misEmp){
        //    System.out.println("nombnres ="+v.getNombre());
            sumaEnero += v.getEnero();
        }
        
        
        
        System.out.println("La suma de enero es="+sumaEnero);
    }
}

