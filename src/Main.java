import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String usernameSystem= "techmaster";
        String passwordSystem="hoclacoviec";
        System.out.println("Nhập username vào đây: ");
        String username=scanner.nextLine();
        System.out.println("Nhập password vào đây: ");
        String password=scanner.nextLine();
        if (username.equals(usernameSystem) && password.equals(passwordSystem)){
            System.out.println("Đăng nhập thành công");
        }else {
            System.out.println("Tài khoản không tồn tại, vui long thử lại");
        }


    }
}
