import javax.xml.namespace.QName;

public class LogicallyOperators {
    public static void main(String[] args) {

        int chemistryGrade = 78;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("You got in!!!");
        } else {
            System.out.println("you failed");
        }
        int credits = 56;
        double GPA = 4.2;
        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned it");
        } else {
            System.out.println("you didnt earn it you need 40 credits and a 2.0min gpa");
        }

    }
}
