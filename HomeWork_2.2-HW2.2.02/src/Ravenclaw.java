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

    public String ravenclawEquals(Ravenclaw ravenclaw) {
        return (mind + wisdom + creation) > (ravenclaw.getCreation() + ravenclaw.getMind() + ravenclaw.getWisdom()) ?
                getFullName() + " Лучший Когтевранец, чем " + ravenclaw.getFullName() :
                getFullName() + " Худший Когтевранец, чем " + ravenclaw.getFullName();
    }
}
