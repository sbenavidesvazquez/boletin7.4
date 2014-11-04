package boletin74;

import java.util.Scanner;

public class Boletin74 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        Metodo pers = new Metodo();
        pers.setPeso1(dato.nextFloat());
        System.out.println("persona 1= pesa " + pers.getPeso1());
        pers.setPeso2(dato.nextFloat());
        System.out.println("persona 2= pesa " + pers.getPeso2());

        pers.resultado();

    }

}
