package org.momus;

public class HelloWorld {

    public static String greeting(String[] names) {
        String name = "";
        name = (names.length > 0) ? names[0] : "World";
        return "Hello, " + name + "!";
    }


    public static void main(String[] args){
        System.out.println( greeting(args) );
    }

}
