package org.practicejava;

public class PrimeNumber {

    private static boolean isPrime(int n){
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0){
                count ++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
}
