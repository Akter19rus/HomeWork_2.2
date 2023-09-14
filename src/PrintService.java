import java.util.Scanner;

public class PrintService {
    public void delimiter() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public void fullStudent(Hogwarts[] hogwarts) {
        for (Hogwarts i : hogwarts) {
            System.out.println(i);
        }
    }

    public void oneStudent(Hogwarts[] hogwarts) {
        Scanner scanner = new Scanner(System.in);
        Hogwarts search = null;
        System.out.println("Введите в формате 'имя фамилия' для поиска: ");
        String name = scanner.nextLine();
        for (Hogwarts i : hogwarts) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name.toLowerCase())) {
                search = i;
                break;
            }
        }
        System.out.println(search);
    }
}

