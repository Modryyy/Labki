package pl.edu.wszib; //testowanie

public class Calculator {
    public int add(int a, int b){
        return a +b;
    }

    public int difference(int a, int b){
        return a-b;

    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b){
        System.out.println("dzielenie !!");
        if(b==0){
            throw new ArithmeticException();
        }
        return ((double) a)/((double) b);

    }
}
