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

    public String gryffindorEquals(Gryffindor gryffindor) {
        return (nobility + honor + bravery) > (gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getNobility()) ?
                getFullName() + " Лучший Гриффиндорец, чем " + gryffindor.getFullName() :
                getFullName() + " Худший Гриффиндорец, чем " + gryffindor.getFullName();
    }
}
//изменение для github