package com.generation;

public class Main {

    public static void main(String[] args) {
        /*
        String mensaje = saludar("Hector Almaguer");
        System.out.println(mensaje);
        int resultado =suma(5,3);
        System.out.println(resultado);
        alerta("Mensaje de prueba");
         */
        /*
        System.out.println(Math.PI);
        double num1 = 13.75;
        double num2 = 23.12;
        System.out.println(Math.ceil(num1));
         */
        /*
        String mensaje1="Adios!!";
        String mensaje2="adios!!";
        System.out.println(mensaje2.length());
        System.out.println(mensaje1.equals(mensaje2));

         */
        
    }
    public static String saludar(String nombre){
        return "Hola, como estas "+nombre;
    }
    public static int suma(int num1,int num2){
        return num1+num2;
    }
    public static void alerta(String mensaje){
        System.out.println(mensaje);
    }
}
