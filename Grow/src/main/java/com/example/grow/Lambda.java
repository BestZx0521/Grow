package com.example.grow;

public class Lambda {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (int a , int b) -> a-b;

        System.out.println(lambda.Operation(1,2,addition));
        System.out.println(lambda.Operation(2,1,subtraction));
        //lambda可以引用final修饰的变量，使用普通变量在之后的代码不允许改变。
    }
    interface MathOperation{
        int operation (int a , int b);
    }
    private int Operation(int a , int b , MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
