package com.nishant;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for(int i = 0 ;i < 100 ; i++ ) {
            boolean p = isPrime(i);
            if (p == true) {
                System.out.println("Number " + i + " is prime");
                count++;
            }
            if(count == 10)
                break;
        }
    }
    public static boolean isPrime(int n)
    {
        if(n <= 1)
            return false;
        for(int i=2;i<=(long) Math.sqrt(n);i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
