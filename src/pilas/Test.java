/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author bh
 */
public class Test {
    public static void main(String[] args) {
        Pila<Integer> pilaNum = new Pila<Integer>();
        
        //insertar datos
        pilaNum.push(1);
        System.out.println(pilaNum);
        pilaNum.push(2);
        System.out.println(pilaNum);
        pilaNum.push(3);
        System.out.println(pilaNum);
        pilaNum.push(4);
        System.out.println(pilaNum);
        pilaNum.push(5);
        System.out.println(pilaNum);
        pilaNum.push(6);
        System.out.println(pilaNum);
        pilaNum.push(7);
        System.out.println(pilaNum);

        
        try {
            System.out.println("****************************Eliminar***********************");
            pilaNum.pop();
            System.out.println(pilaNum);
            pilaNum.pop();
            System.out.println(pilaNum);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        
        try {
            System.out.println("****************************REvertir***********************");
            System.out.println("pila normal");
            System.out.println(pilaNum);
            Pila<Integer> listReverse = new Pila<>();
            pilaNum.reverseNewPila(listReverse);
            System.out.println("pila reverse");
            System.out.println(listReverse);
            
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        
        try {
            System.out.println(pilaNum);
            pilaNum.reverse();
            System.out.println(pilaNum);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        
        try {
            System.out.println(pilaNum);
            pilaNum.removeNodo(1);
            System.out.println(pilaNum);
            pilaNum.removeNodo(5);
            System.out.println(pilaNum);
            pilaNum.removeNodo(3);
            System.out.println(pilaNum);
            pilaNum.removeNodo(2);
            System.out.println(pilaNum);
            pilaNum.removeNodo(4);
            System.out.println(pilaNum);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
