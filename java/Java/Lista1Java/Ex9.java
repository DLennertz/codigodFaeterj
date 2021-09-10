import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        char ascii;
        char x, y;
        System.out.println("Digite a mensagem: ");
        String mens = t.nextLine();
        System.out.println("Digite a CHAVE: ");
        int chave = v.nextInt();
        while (chave >= 26) {
            chave = chave - 26;
        }
        for (int i = 0; i < mens.length(); i++) {
         
            if (mens.charAt(i) >= 97 && mens.charAt(i) <= 122) {
                if ((int) (mens.charAt(i) + chave) > 122) {
                    x = (char) (mens.charAt(i) + chave);
                    y = (char) (x - 122);
                    ascii = (char) (96 + y);
                    System.out.print(ascii + " ");
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
                    System.out.print(ascii + " ");

                }
            }

            if (mens.charAt(i) >= 65 && mens.charAt(i) <= 90) {
                if (mens.charAt(i) + chave > 90) {
                    x = (char) (mens.charAt(i) + chave);
                    y = (char) (x - 90);
                    ascii = (char) (64 + y);
                    System.out.print(ascii + " ");
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
                    System.out.print(ascii + " ");
                }
            }
        }
    }
}