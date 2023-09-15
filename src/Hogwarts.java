import java.util.Scanner;

public class Hogwarts {
    private String fullName;
    private int spellPower;
    private int transgression;

    public Hogwarts(String fullName, int spellPower, int transgression) {
        this.fullName = fullName;
        this.spellPower = spellPower;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return fullName + "\n" +
                "Сила магии: " + spellPower + "\n" +
                "Расстояние трансгрессии: " + transgression;
    }

    public static void compareStudent(Hogwarts[] hogwarts) {
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
}
