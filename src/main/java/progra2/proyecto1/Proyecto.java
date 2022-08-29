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
public class Proyecto {
public static void main(String[] args) {
        //Empesamos creeando la lista 
        List<ClsVendedores> misEmp = new ArrayList();
        
        
        Random dato = new Random();
        float a = 0, a1 = 0,a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0;
        float a9 = 0, a10 = 0, a11 = 0, a12 = 0, a13 = 0, a14 = 0, a15 = 0, a16 = 0, a17 = 0;
        float a18 = 0, a19 = 0, a20 = 0, a21 = 0, a22 = 0, a23 = 0;
        
        for(int i =0; i<1; i++){
            a=dato.nextInt(800); a1=dato.nextInt(800); a2=dato.nextInt(800);
            a3=dato.nextInt(800); a4=dato.nextInt(800); a5=dato.nextInt(800);
            a6=dato.nextInt(800); a7=dato.nextInt(800); a8=dato.nextInt(800);
            a9=dato.nextInt(800); a10=dato.nextInt(800); a11=dato.nextInt(800);
            a12=dato.nextInt(800); a13=dato.nextInt(800); a14=dato.nextInt(800);
            a15=dato.nextInt(800); a16=dato.nextInt(800); a17=dato.nextInt(800);
            a18=dato.nextInt(800); a19=dato.nextInt(800); a20=dato.nextInt(800);
            a21=dato.nextInt(800); a22=dato.nextInt(800); a23=dato.nextInt(800);

//        public static List empleados{
//Random j=new Random();  
// int n =j.nextInt(200)+50;  
//  return n;
        }
        
        ClsVendedores ven = new ClsVendedores("1-Roberto");
        ven.setEnero(a);
        ven.setFebrero(a1);
        ven.setMarzo(a2);
        misEmp.add(ven);
            
        ven=new ClsVendedores("2-Caleb");
        ven.setEnero(a3);
        ven.setFebrero(a4);
        ven.setMarzo(a5);
        misEmp.add(ven);
 
        ven = new ClsVendedores("3-Josue");
        ven.setEnero(a6);
        ven.setFebrero(a7);
        ven.setMarzo(a8);
        misEmp.add(ven);
        
        ven = new ClsVendedores("4-Jose");
        ven.setEnero(a9);
        ven.setFebrero(10);
        ven.setMarzo(a11);
        misEmp.add(ven);
        
        ven = new ClsVendedores("5-Carlos");
        ven.setEnero(a12);
        ven.setFebrero(a13);
        ven.setMarzo(a14);
        misEmp.add(ven);
        
        ven = new ClsVendedores("6-Walfere");
        ven.setEnero(a15);
        ven.setFebrero(a16);
        ven.setMarzo(a17);
        misEmp.add(ven);
        
        ven = new ClsVendedores("7-Arturo");
        ven.setEnero(a18);
        ven.setFebrero(a19);
        ven.setMarzo(a20);
        misEmp.add(ven);
        
        ven = new ClsVendedores("8-Jesus");
        ven.setEnero(a21);
        ven.setFebrero(a22);
        ven.setMarzo(a23);
        misEmp.add(ven);
 
        ven = new ClsVendedores("nuevo");
         
        double sumaEnero = 0;  
        double sumaFebrero = 0;
        double sumaMarzo = 0;   
        double SumasMesesTotal = 0;
        
        System.out.println("Vendedores");//Imprime Vendedores 
        System.out.println("-----------");
        misEmp.forEach((ob) -> System.out.println(ob.getNombre()));
        
        
        for (ClsVendedores v : misEmp){
            sumaEnero += v.getEnero();
            sumaFebrero += v.getFebrero();
            sumaMarzo += v.getMarzo();
            
            SumasMesesTotal= sumaEnero+sumaFebrero+sumaMarzo;
        }
        //Impresion de la tabal y losdatos  vendedores 
        System.out.println("\n\t----------------------------------------------------------------------------");
        System.out.println("\n\tNOMBRE\t\t |    ENERO\t\t |  FEBRERO\t         |  MARZO   |");
        System.out.println("\t1-Roberto\t |   Q"+a+"\t\t |  Q"+a1+"\t\t |  Q"+a2+"  |");
        System.out.println("\t2-Caleb\t\t |   Q"+a3+"\t\t |  Q"+a4+"\t\t |  Q"+a5+"  |");
        System.out.println("\t3-Josue\t \t |   Q"+a6+"\t\t |  Q"+a7+"\t\t |  Q"+a8+"  |");
        System.out.println("\t4-Jose\t\t |   Q"+a9+"\t\t |  Q"+a10+"\t\t |  Q"+a11+"  |");
        System.out.println("\t5-Carlos\t |   Q"+a12+"\t\t |  Q"+a13+"\t\t |  Q"+a14+"  |");
        System.out.println("\t6-Walfer\t |   Q"+a15+"\t\t |  Q"+a16+"\t\t |  Q"+a17+"  |");
        System.out.println("\t7-Arturo\t |   Q"+a18+"\t\t |  Q"+a19+"\t\t |  Q"+a20+"  |");
        System.out.println("\t8-Jesus\t\t |   Q"+a21+"\t\t |  Q"+a22+"\t\t |  Q"+a23+"  |");
        System.out.println("\tTOTAL MES\t |   Q"+sumaEnero+"\t\t |  Q"+sumaFebrero+"\t\t |  Q"+sumaMarzo+" |");
        System.out.println("\n\t----------------------------------------------------------------------------");
        System.out.println("\n\tVentas Totales Por Todos os Meses = "+SumasMesesTotal);
        System.out.println("\n\t----------------------------------------------------------------------------");
        System.out.println("\n\tLa Suma Total De Enero    = Q"+sumaEnero);
        System.out.println("\tLa Suma Total de febrero = Q"+sumaFebrero);          
        System.out.println("\tLa Suma Total De Marzo   = Q"+sumaMarzo);
System.out.println("\n\t----------------------------------------------------------------------------");
    }
    }


