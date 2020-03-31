//Create and test Student objects

public class StudentTest{
    public static void main(String[] args) {
        student account1 = new Student("JAne Green", 93.5);
        student account2 = new Student("John Blue", 72.75);

        System.out.printf("%s's letter is: %s%n", acoount1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter is: %s%n", acoount2.getName(), account2.getLetterGrade());
    }
}// End class StudentTest