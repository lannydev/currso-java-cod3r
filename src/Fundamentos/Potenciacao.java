package Fundamentos;

public class Potenciacao {
    public static void main(String[] args) {
        double a = Math.pow(6 *(3 + 2) , 2) / (3 * 2) ;
        System.out.println(a);
        double b = Math.pow((1-5) * (2-7) / 2, 2);
        System.out.println(b);
        double c = a - b;
        System.out.println(c);
        double d = Math.pow((c/10), 3);
        System.out.println(d);
    }
}
