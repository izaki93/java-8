package com.itians.java8.defaults;

public class Client14 implements Interface1, Interface4 {

    /***
     *  If you have two method of similar method signature then you have to override similar method in your
     *  implementation class
     */
    @Override
    public void methodA() {
        System.out.println("Inside Method A" + Client14.class);
    }

    public static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();
    }
}
