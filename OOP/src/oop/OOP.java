package oop;

public class OOP implements Animal {


    new Animal () {
        public void speak() {
            System.out.println("TESTBARK");
        }
    }.speak();

    public static void main(String[] args){
        OOP test = new OOP();
        test.speak();
    }
}
