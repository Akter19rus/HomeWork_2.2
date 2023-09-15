import java.util.Scanner;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int spellPower, int transgression, int hardWork, int loyalty, int honesty) {
        super(fullName, spellPower, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Трудолюбие - " + hardWork + "\n"
                + "Честность - " + honesty + "\n"
                + "Верность - " + loyalty + "\n"
                + "";
    }

    public static void hufflepuffEquals(Hogwarts[] student) {
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
