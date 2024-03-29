package HW2.Task4;

import java.util.Scanner;

/**@apiNote Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class ShowString {
    protected String showMeString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string below: ");
        String usersString = scanner.nextLine();
        scanner.close();
        try {
            if (usersString == null || usersString.isEmpty()) {
                throw new IllegalArgumentException("* Inserted string is empty");
            } else return usersString;
        } catch (IllegalArgumentException e) {
            System.out.println("Input something please.");
            System.out.println(e.getMessage());
        }
        return usersString;
    }
}
