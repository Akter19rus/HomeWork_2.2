import java.util.Scanner;

public class SearchStudent {
    public Hogwarts searchStudent(Hogwarts[] hogwarts) {
        Scanner scanner = new Scanner(System.in);
        Hogwarts search = null;
        System.out.println("Введите в формате 'имя фамилия' студента: ");
        String name = scanner.nextLine();
        for (Hogwarts i : hogwarts) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name.toLowerCase())) {
                search = i;
                break;
            }
        }
        return search;
    }
}
//изменение для github