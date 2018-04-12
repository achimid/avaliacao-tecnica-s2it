package br.com.lourran;

public class MainApp {

    public static void main(String[] args) {
        int a = 10256;
        int b = 512;
        int c = AppUtil.getInstance().interpolate(a, b);

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
    }

}
