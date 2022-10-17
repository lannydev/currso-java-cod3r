package Fundamentos;

public class Conversao {

    public static void main(String[] args) {
        float a = (float)1.1234556; // explicita (CAST)
        System.out.println(a);

        double b = 1;
        System.out.println(b); // implícita

        int c = 340;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e;
        System.out.println(f);

    }
}
