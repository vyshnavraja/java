import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the password you want to check ?");
        int T = scanner.nextInt();
        while (T-- > 0) {
            System.out.println("Enter number of the password");
            String password = scanner.next();
            boolean isSecure = password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#%&?])[A-Za-z\\d@#%&?]{10,}");
            System.out.println(isSecure ? "YES" : "NO");
        }
    }
}
