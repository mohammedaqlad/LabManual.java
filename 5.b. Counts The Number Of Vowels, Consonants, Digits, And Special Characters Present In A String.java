import java.util.Scanner;
public class  main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vl = 0, cns = 0, dj = 0, sp = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vl++;
                        break;
                    default:
                        cns++;
                }
            } else if (Character.isDigit(ch)) {
                dj++;
            } else if (ch != ' ') {
                sp++;
            }
        }
        System.out.println("\nVowels: " + vl);
        System.out.println("Consonants: " + cns);
        System.out.println("Digits: " + dj);
        System.out.println("Special Characters: " + sp);
        sc.close();
    }
}
