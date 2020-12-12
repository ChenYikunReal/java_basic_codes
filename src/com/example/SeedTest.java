package com.example;

import java.util.*;

public class SeedTest{
    public static void main(String[] args){
        Random r1 = new Random(50);
        System.out.println("第一个种子为50的Random对象");
        System.out.println("ri.nextBoolean():\t" + r1.nextBoolean());
        System.out.println("ri.nextInt():\t\t" + r1.nextInt());
        System.out.println("ri.nextDouble():\t" + r1.nextDouble());
        System.out.println("ri.nextGaussian():\t" + r1.nextGaussian());
        System.out.println("-----------------------------------------");
        Random r2 = new Random(50);
        System.out.println("第二个种子为50的Random对象");
        System.out.println("ri.nextBoolean():\t" + r2.nextBoolean());
        System.out.println("ri.nextInt():\t\t" + r2.nextInt());
        System.out.println("ri.nextDouble():\t" + r2.nextDouble());
        System.out.println("ri.nextGaussian():\t" + r2.nextGaussian());
        System.out.println("-----------------------------------------");
        Random r3 = new Random(100);
        System.out.println("种子为100的Random对象");
        System.out.println("ri.nextBoolean():\t" + r3.nextBoolean());
        System.out.println("ri.nextInt():\t\t" + r3.nextInt());
        System.out.println("ri.nextDouble():\t" + r3.nextDouble());
        System.out.println("ri.nextGaussian():\t" + r3.nextGaussian());
        System.out.println("-----------------------------------------");
    }
}