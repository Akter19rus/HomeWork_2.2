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

    public String hufflepuffEquals(Hufflepuff hufflepuff) {
        return (hardWork + honesty + loyalty) > (hufflepuff.getHardWork() + hufflepuff.getHonesty() + hufflepuff.getLoyalty()) ?
                getFullName() + " Лучший Пуффиндуец, чем " + hufflepuff.getFullName() :
                getFullName() + " Худший Пуффиндуец, чем " + hufflepuff.getFullName();
    }
}
//изменение для github