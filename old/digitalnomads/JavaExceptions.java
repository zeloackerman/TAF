package com.digitalnomads;

public class JavaExceptions {
    public static void main(String[] args) throws ArithmeticException {

        int a = 5;
        int b = 0;

        try {
            System.out.println(a/b);
        }catch  (ArithmeticException e){
            e.printStackTrace();
            throw new ArithmeticException("We can not divide 0");
        }


    }


}
