public class matrimonl {
    public static void main(String[] args) {

        char gender = 'F';
        int age = 17;

        if (gender == 'M') {
            System.out.println("Gender is Male");
            if (age >= 21) {
                System.out.println("You can get married");
            } else {
                System.out.println("Have some patience");
            }
        } else if (gender == 'F') {
            System.out.println("Gender is Female");
            if (age >= 18) {
                System.out.println("You can get married");
            } else {
                System.out.println("Have some patience");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
