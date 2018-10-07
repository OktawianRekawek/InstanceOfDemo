/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceofdemo;

/**
 *
 * @author Oktawian
 */
public class InstanceOfDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        
        System.out.println("obj1 is instanseof Parent: "
                + (obj1 instanceof Parent));
        System.out.println("obj1 is instanseof Child: "
                + (obj1 instanceof Child));
        System.out.println("obj1 is instanseof MyInterface: "
                + (obj1 instanceof MyInterface));
        System.out.println("obj1 is instanseof Parent: "
                + (obj2 instanceof Parent));
        System.out.println("obj1 is instanseof Child: "
                + (obj2 instanceof Child));
        System.out.println("obj1 is instanseof MyInterface: "
                + (obj2 instanceof MyInterface));
    }
    
    
    
}

    class Parent{}
    class Child extends Parent implements MyInterface{}
    interface MyInterface{}