package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly r1 = new RWOnly();

        r1.name = "Aniket";
        System.out.println(name);
        // Error - name has private access in com.driver.RWOnly

        r1.setName("Aniket");
        String name = r1.getName();

        System.out.println(name);
    }
}