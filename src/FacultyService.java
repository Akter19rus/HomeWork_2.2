import java.util.Scanner;

public class FacultyService {
    public void equals(Hogwarts[] hogwarts) {
        Scanner scanner = new Scanner(System.in);
        Hogwarts search = null;
        System.out.println("Введите в формате 'имя фамилия' для выбора первого студента: ");
        String name = scanner.nextLine();
        for (Hogwarts i : hogwarts) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name.toLowerCase())) {
                search = i;
                break;
            }
        }
        Hogwarts search2 = null;
        System.out.println("Введите в формате 'имя фамилия' для выбора второго студента: ");
        String name2 = scanner.nextLine();
        for (Hogwarts i : hogwarts) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name2.toLowerCase())) {
                search2 = i;
                break;
            }
        }
        int result = search.getSpellPower() + search.getTransgression();
        int result2 = search2.getSpellPower() + search2.getTransgression();
        if (result > result2) {
            System.out.println(search.getFullName() + " " + result + " очков, лучше волшебника " + search2.getFullName() + " " + result2 + " очков");
        }else{
            System.out.println(search2.getFullName() + " " + result2 + " очков, лучше волшебника " + search.getFullName() + " " + result + " очков");
        }
    }

    public void gryffindorEquals(Hogwarts[] student) {
        Scanner scanner = new Scanner(System.in);
        Gryffindor search = null;
        System.out.println("Введите в формате 'имя фамилия' первого гриффиндорца: ");
        String name = scanner.nextLine();
        for (Hogwarts i : student) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name.toLowerCase())) {
                search = (Gryffindor) i;
                break;
            }
        }
        Gryffindor search2 = null;
        System.out.println("Введите в формате 'имя фамилия' второго гриффиндорца: ");
        String name2 = scanner.nextLine();
        for (Hogwarts i : student) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name2.toLowerCase())) {
                search2 = (Gryffindor) i;
                break;
            }
        }
        int result = search.getNobility() + search.getHonor() + search.getBravery();
        int result2 = search2.getNobility() + search2.getHonor() + search2.getBravery();
        if (result > result2) {
            System.out.println(search.getFullName() + " " + result + " очков, лучший Гриффиндорец, чем " + search2.getFullName() + " " + result2 + " очков");
        }else{
            System.out.println(search2.getFullName() + " " + result2 + " очков лучший Гриффиндорец, чем " + search.getFullName() + " " + result + " очков");
        }
    }

    public void slytherinEquals(Hogwarts[] student) {
        Scanner scanner = new Scanner(System.in);
        Slytherin search = null;
        System.out.println("Введите в формате 'имя фамилия' первого Слизеринца: ");
        String name = scanner.nextLine();
        for (Hogwarts i : student) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name.toLowerCase())) {
                search = (Slytherin) i;
                break;
            }
        }
        Slytherin search2 = null;
        System.out.println("Введите в формате 'имя фамилия' второго Слизеринца: ");
        String name2 = scanner.nextLine();
        for (Hogwarts i : student) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name2.toLowerCase())) {
                search2 = (Slytherin) i;
                break;
            }
        }
        int result = search.getCunning() + search.getDetermination() + search.getAmbition() + search.getLustForPower() + search.getResourcefulness();
        int result2 = search2.getCunning() + search2.getDetermination() + search2.getAmbition() + search2.getLustForPower() + search2.getResourcefulness();
        if (result > result2) {
            System.out.println(search.getFullName() + " " + result + " очков, лучший Cлизеринец, чем " + search2.getFullName() + " " + result2 + " очков");
        }else{
            System.out.println(search2.getFullName() + " " + result2 + " очков лучший Слизеринец, чем " + search.getFullName() + " " + result + " очков");
        }
    }

    public void RavenclawEquals(Hogwarts[] student) {
        Scanner scanner = new Scanner(System.in);
        Ravenclaw search = null;
        System.out.println("Введите в формате 'имя фамилия' первого Когтевранца: ");
        String name = scanner.nextLine();
        for (Hogwarts i : student) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name.toLowerCase())) {
                search = (Ravenclaw) i;
                break;
            }
        }
        Ravenclaw search2 = null;
        System.out.println("Введите в формате 'имя фамилия' второго Когтевранца: ");
        String name2 = scanner.nextLine();
        for (Hogwarts i : student) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name2.toLowerCase())) {
                search2 = (Ravenclaw) i;
                break;
            }
        }
        int result = search.getMind() + search.getWisdom() + search.getWit() + search.getCreation();
        int result2 = search2.getMind() + search2.getWisdom() + search2.getWit() + search2.getCreation();
        if (result > result2) {
            System.out.println(search.getFullName() + " " + result + " очков, лучший Когтевранец, чем " + search2.getFullName() + " " + result2 + " очков");
        }else{
            System.out.println(search2.getFullName() + " " + result2 + " очков лучший Когтевранец, чем " + search.getFullName() + " " + result + " очков");
        }
    }

    public void hufflepuffEquals(Hogwarts[] student) {
        Scanner scanner = new Scanner(System.in);
        Hufflepuff search = null;
        System.out.println("Введите в формате 'имя фамилия' первого Пуффиндуйца: ");
        String name = scanner.nextLine();
        for (Hogwarts i : student) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name.toLowerCase())) {
                search = (Hufflepuff) i;
                break;
            }
        }
        Hufflepuff search2 = null;
        System.out.println("Введите в формате 'имя фамилия' второго Пуффиндуйца: ");
        String name2 = scanner.nextLine();
        for (Hogwarts i : student) {
            if (i != null && i.getFullName() != null && i.getFullName().toLowerCase().equals(name2.toLowerCase())) {
                search2 = (Hufflepuff) i;
                break;
            }
        }
        int result = search.getHardWork() + search.getLoyalty() + search.getHonesty();
        int result2 = search2.getHardWork() + search2.getLoyalty() + search2.getHonesty();
        if (result > result2) {
            System.out.println(search.getFullName() + " " + result + " очков, лучший Пуффиндуец, чем " + search2.getFullName() + " " + result2 + " очков");
        }else{
            System.out.println(search2.getFullName() + " " + result2 + " очков лучший Пуффиндуец, чем " + search.getFullName() + " " + result + " очков");
        }
    }
}
