//Create and test Student objects

public class studentTest{
    public static void main(String[] args) {
        student account1 = new student("JAne Green", 93.5);
        student account2 = new student("John Blue", 72.75);

        System.out.printf("%s's letter is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter is: %s%n", account2.getName(), account2.getLetterGrade());
    }
}// End class StudentTest