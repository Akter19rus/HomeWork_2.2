public abstract class Hogwarts {
    private final String fullName;
    private final int spellPower;
    private final int transgression;

    public Hogwarts(String fullName, int spellPower, int transgression) {
        this.fullName = fullName;
        this.spellPower = spellPower;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return fullName + "\n" +
                "Сила магии: " + spellPower + "\n" +
                "Расстояние трансгрессии: " + transgression;
    }

    public String compareStudent(Hogwarts hogwarts) {
        return (spellPower + transgression) > (hogwarts.getSpellPower() + hogwarts.getTransgression()) ?
        getFullName() + " лучше магичит, чем " + hogwarts.getFullName() + "\n" :
        getFullName() + " хуже магичит в отличии от " + hogwarts.getFullName() + "а" +   "\n";
    }

    public String withdrawStudent(Hogwarts[] hogwarts) {
        return toString();
    }
}
