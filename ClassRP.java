import java.util.Scanner;

public class ClassRP {
    public static void main(String[] args) {

        int[] subjectTotalMarks = {100, 50, 75, 85, 100};

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Class Result Processing System");
        System.out.println("Please enter number of students in the class: ");
        int totalNumberOfStudents = input.nextInt();

        for (int i = 1; i <= totalNumberOfStudents; i++) {

            int totalObtainedMarks = 0;
            boolean subjectFail = false;
            double totalPercentage = 0;

            System.out.println("\nStudent " + i);

            // Inner loop for 5 subjects
            for (int j = 0; j < 5; j++) {

                System.out.println("Please enter subject " + (j + 1) + " marks for student " + i + ": ");
                int obtainedMarks = input.nextInt();

                // Calculate subject percentage
                double subjectPercentage =
                        ((double) obtainedMarks / subjectTotalMarks[j]) * 100;

                // Check subject deficiency
                if (subjectPercentage < 33) {
                    subjectFail = true;
                }

                // Add subject percentage to total
                totalPercentage += subjectPercentage;

                // Add obtained marks
                totalObtainedMarks += obtainedMarks;
            }

            // Average of the 5 subject percentages
            double averagePercentage = totalPercentage / 5;

            // Final classification
            if (subjectFail) {
                System.out.println("Result: Fail - Subject Deficiency");
            }
            else if (averagePercentage >= 80) {
                System.out.println("Result: Distinction");
            }
            else if (averagePercentage >= 60) {
                System.out.println("Result: Pass");
            }
            else {
                System.out.println("Result: Fail");
            }

            System.out.println("Average Percentage: " + averagePercentage + "%");
        }

        input.close();
    }
}