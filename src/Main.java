import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть ваш пароль: ");
            String password = scanner.nextLine();


            if (password.length() < 8) {
                throw new MyException("Пароль має бути довшим за 8 символів.", 1001);
            }

            System.out.println("Пароль успішно прийнято!");
        } catch (MyException e) {
            System.out.println("Помилка: " + e.getMessage());
            if (e.id != 0) {
                System.out.println("Код помилки: " + e.id);
            }
        } catch (Exception e) {
            System.out.println("Непередбачена помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
