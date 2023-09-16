public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Gryffindor("Гарри Поттер", 70, 60, 100, 90, 99),
                new Gryffindor("Рон Уизли", 50, 30, 70, 75, 80),
                new Gryffindor("Гермиона Грейнджер", 85, 90, 60, 50, 68),
                new Slytherin("Драко Малфой", 70, 55, 100, 28, 90, 73, 90),
                new Slytherin("Грэхэм Монтегю", 44, 25, 40, 63, 26, 21, 40),
                new Slytherin("Грегори Гойл", 35, 15, 15, 25, 27, 33, 40),
                new Hufflepuff("Захария Смит", 58, 89, 70, 57, 76),
                new Hufflepuff("Седрик Диггори", 68, 77, 60, 87, 85),
                new Hufflepuff("Джастин Финч-Флетчли", 52, 25, 78, 43, 50),
                new Ravenclaw("Чжоу Чанг", 54, 77, 67, 63, 46, 79),
                new Ravenclaw("Падма Патил", 37, 66, 76, 65, 36, 12),
                new Ravenclaw("Маркус Белби", 64, 55, 43, 26, 38, 42)
        };

        SearchStudent searchStudent = new SearchStudent();
        System.out.println("     Сравнение студентов разных факультетов! ");
        Hogwarts hogwarts1 = searchStudent.searchStudent(hogwarts);
        Hogwarts hogwarts2 = searchStudent.searchStudent(hogwarts);
        System.out.println(hogwarts1.compareStudent(hogwarts2));

        System.out.println("     Вывод информации по имени студента! ");
        Hogwarts printStudent = searchStudent.searchStudent(hogwarts);
        System.out.println(printStudent.withdrawStudent(hogwarts));

        System.out.println("      ЛУЧШИЙ ГРИФФИНДОРЕЦ");
        Gryffindor gryffindorOne = (Gryffindor) hogwarts[1];
        Gryffindor gryffindorTwo = (Gryffindor) hogwarts[2];
        System.out.println(gryffindorOne.gryffindorEquals(gryffindorTwo));

        System.out.println("      Лучший Слизеринец");
        Slytherin slytherinOne = (Slytherin) hogwarts[3];
        Slytherin slytherinTwo = (Slytherin) hogwarts[5];
        System.out.println(slytherinOne.slytherinEquals(slytherinTwo));
        // и тд.
        // PS: для меня эта домашка далась тяжело, без массива бы это было слишком легко))) несколько раз полностью
        // переписывал код, а это значит, что знаний получил гораздо больше))
    }
}