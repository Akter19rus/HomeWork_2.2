import java.util.Scanner;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public  Gryffindor(String fullName, int spellPower, int transgression, int nobility, int honor, int bravery) {
        super(fullName, spellPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Благородство - " + nobility + "\n"
                + "Честь - " + honor + "\n"
                + "Храбрость - " + bravery + "\n"
                + "";
    }

    public static void gryffindorEquals(Hogwarts[] student) {
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
}
