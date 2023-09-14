
public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = new Hogwarts[12];
        hogwarts[0] = new Gryffindor("Гарри Поттер", 70, 60, 100, 90, 99);
        hogwarts[1] = new Gryffindor("Гермиона Грейнджер", 85, 90, 60, 50, 68);
        hogwarts[2] = new Gryffindor("Рон Уизли", 50, 30, 70, 75, 80);

        hogwarts[3] = new Slytherin("Драко Малфой", 70, 55, 100, 28, 90, 73, 90);
        hogwarts[4] = new Slytherin("Грэхэм Монтегю", 44, 25, 40, 63, 26, 21, 40);
        hogwarts[5] = new Slytherin("Грегори Гойл", 35, 15, 15, 25, 27, 33, 40);

        hogwarts[6] = new Hufflepuff("Захария Смит", 58, 89, 70, 57, 76);
        hogwarts[7] = new Hufflepuff("Седрик Диггори", 68, 77, 60, 87, 85);
        hogwarts[8] = new Hufflepuff("Джастин Финч-Флетчли", 52, 25, 78, 43, 50);

        hogwarts[9] = new Ravenclaw("Чжоу Чанг", 54, 77, 67, 63, 46, 79);
        hogwarts[10] = new Ravenclaw("Падма Патил", 37, 66, 76, 65, 36, 12);
        hogwarts[11] = new Ravenclaw("Маркус Белби", 64, 55, 43, 26, 38, 42);

        PrintService printService = new PrintService();
        FacultyService facultyService = new FacultyService();
        printService.fullStudent(hogwarts);
        System.out.println(hogwarts);
        printService.delimiter();
        printService.oneStudent(hogwarts);
        printService.delimiter();

        facultyService.equals(hogwarts);
        printService.delimiter();
        facultyService.gryffindorEquals(hogwarts);
        printService.delimiter();
        facultyService.slytherinEquals(hogwarts);
        printService.delimiter();
        facultyService.RavenclawEquals(hogwarts);
        printService.delimiter();
        facultyService.hufflepuffEquals(hogwarts);



    }
}