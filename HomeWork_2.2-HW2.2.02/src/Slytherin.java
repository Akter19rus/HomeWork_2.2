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

    public String slytherinEquals(Slytherin slytherin) {
        return (cunning + determination + ambition + resourcefulness + lustForPower) > (slytherin.getAmbition() + slytherin.getCunning() + slytherin.getDetermination() + slytherin.getResourcefulness() + slytherin.getLustForPower()) ?
                getFullName() + " Лучший Слизеринец, чем " + slytherin.getFullName() :
                getFullName() + " Худший Слизеринец, чем " + slytherin.getFullName();
    }
}
//изменение для github