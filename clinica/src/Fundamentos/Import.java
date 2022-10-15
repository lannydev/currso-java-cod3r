package Fundamentos;

import java.util.Date;

public class Import {
    public static void main(String[] args) {
        String s = "Elaine";
        System.out.println(s);

        Date d = new Date(); // necessário fazer o import
        d.toInstant();
        System.out.println(d);


    }
}
