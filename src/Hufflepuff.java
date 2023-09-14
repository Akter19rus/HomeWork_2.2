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
        return "Имя - " + getFullName() + "\n"
                + "Сила магии - " + getSpellPower() + "\n"
                + "Дальность трансгрессии - " + getTransgression() + "\n"
                + "Трудолюбие - " + hardWork + "\n"
                + "Честность - " + honesty + "\n"
                + "Верность - " + loyalty + "\n"
                + "";
    }
}
