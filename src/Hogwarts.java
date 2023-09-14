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
}
