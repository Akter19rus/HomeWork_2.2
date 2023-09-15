import java.util.Scanner;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String fullName, int spellPower, int transgression, int mind, int wisdom, int wit, int creation) {
        super(fullName, spellPower, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Ум - " + mind + "\n"
                + "Мудрость - " + wisdom + "\n"
                + "Творчество - " + creation + "\n"
                + "";
    }

    public static void RavenclawEquals(Hogwarts[] student) {
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
}
