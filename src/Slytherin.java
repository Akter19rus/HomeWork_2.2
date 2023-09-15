import java.util.Scanner;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int spellPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, spellPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Хитрость - " + cunning + "\n"
                + "Решительность - " + determination + "\n"
                + "Амбиции - " + ambition + "\n"
                + "Находчивость - " + resourcefulness + "\n"
                + "Жажда власти - " + lustForPower + "\n"
                + "";
    }

    public static void slytherinEquals(Hogwarts[] student) {
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
}
