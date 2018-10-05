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
    }
    
    class Parent{}
    class Child extends Parent implements MyInterface{}
    interface MyInterface{}
    
}
