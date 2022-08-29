/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2ac6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Emily Barrientos
 */
public class Listas {
    
    
    public static void main(String[] args) {
//        List miLista = new ArrayList(); //al no especificar el tipo, lo pone objet
//        miLista.add(3);
//        miLista.add("Robyn");
//        miLista.add(55.58);
//        imprimir(miLista);
            

          List<ClsVendedores> misEmp = new ArrayList();
          
          ClsVendedores ven = new ClsVendedores();
          
          ven.setNombre("Elubia");
          ven.setEnero(generateRandomInt(800));
          ven.setFebrero(generateRandomInt(1000));
          ven.setMarzo(generateRandomInt(1000));
          ven.setAbril(generateRandomInt(1000));
          misEmp.add(ven);
          ven = new ClsVendedores();
          
          ven.setNombre("Wendy");
          ven.setEnero(generateRandomInt(500));
          ven.setFebrero(generateRandomInt(1000));
          ven.setMarzo(generateRandomInt(1000));
          ven.setAbril(generateRandomInt(1000));
          misEmp.add(ven);
          ven = new ClsVendedores();
          
          ven.setNombre("Edgar");
          ven.setEnero(generateRandomInt(700));
          ven.setFebrero(generateRandomInt(1000));
          ven.setMarzo(generateRandomInt(1000));
          ven.setAbril(generateRandomInt(1000));
          misEmp.add(ven);
          ven = new ClsVendedores();
          
          ven.setNombre("Donald");
          ven.setEnero(generateRandomInt(700));
          ven.setFebrero(generateRandomInt(1000));
          ven.setMarzo(generateRandomInt(1000));
          ven.setAbril(generateRandomInt(1000));
          misEmp.add(ven);
          ven = new ClsVendedores();
          
          ven.setNombre("Luis");
          ven.setEnero(generateRandomInt(700));
          ven.setFebrero(generateRandomInt(1000));
          ven.setMarzo(generateRandomInt(1000));
          ven.setAbril(generateRandomInt(1000));
          misEmp.add(ven);
          ven = new ClsVendedores();
          
          ven.setNombre("Leonel");
          ven.setEnero(generateRandomInt(700));
          ven.setFebrero(generateRandomInt(1000));
          ven.setMarzo(generateRandomInt(1000));
          ven.setAbril(generateRandomInt(1000));
          misEmp.add(ven);
          ven = new ClsVendedores();
          
          ven.setNombre("Hego");
          ven.setEnero(generateRandomInt(700));
          ven.setFebrero(generateRandomInt(1000));
          ven.setMarzo(generateRandomInt(1000));
          ven.setAbril(generateRandomInt(1000));
          misEmp.add(ven);
          ven = new ClsVendedores();
          
          ven.setNombre("Esly");
          ven.setEnero(generateRandomInt(700));
          ven.setFebrero(generateRandomInt(1000));
          ven.setMarzo(generateRandomInt(1000));
          ven.setAbril(generateRandomInt(1000));
          misEmp.add(ven);
          ven = new ClsVendedores();
          
          double sumaEnero =0;
          double sumaFebrero=0;
          double sumaMarzo=0;
          double sumaAbril=0;
          double Total=0;
          double Promedio=0;
          for(ClsVendedores v : misEmp){
              System.out.println("Nombre = "+v.getNombre());
              System.out.println("*Enero = "+v.getEnero());
              System.out.println("-Febrero = "+v.getFebrero());
              System.out.println("/Marzo = "+v.getMarzo());
              System.out.println("&Abril = "+v.getAbril());
              sumaEnero = sumaEnero + v.getEnero();
              sumaFebrero = sumaFebrero + v.getFebrero();
              sumaMarzo = sumaMarzo + v.getMarzo();
              sumaAbril= sumaAbril + v.getAbril();
              Total = Total + v.getEnero() + v.getFebrero() + v.getMarzo() + v.getAbril();
              Promedio = (Total/4);
              
          }
          
          System.out.println("**La suma de Enero es: "+sumaEnero);
          System.out.println("--La suma de Febrero es: "+sumaFebrero);
          System.out.println("//La suma de Marzo es: "+sumaMarzo);
          System.out.println("&&La suma de Abril es: "+sumaAbril);
          System.out.println("*****EL TOTAL DE LOS MESES ES: "+Total);
          System.out.println("!!El promedio es de: "+Promedio);
          
    }
    
    public static int generateRandomInt (int upperRange){
        Random random = new Random();
        return random.nextInt(upperRange);
    }
    
    
    public static void imprimir(Collection coleccion){
        for(Object elemento : coleccion){
            System.out.println("elemnto="+elemento);
        }
    }
}
