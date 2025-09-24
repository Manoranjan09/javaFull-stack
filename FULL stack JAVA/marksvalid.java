public class marksvalid {
    public static void main(String[]args){
        int marks = 85;
        if(marks >= 85 && marks <=90){
        System.out.println("Student is Very good");
        }
        else if(marks > 90){
        System.out.println("Student is Excellent");
        }
        else if(marks < 85 && marks > 70){
        System.out.println("Student is Average");
        }
        else if(marks < 70 && marks > 50){
        System.out.println("Student need improvement");
        }
        else{
            System.out.println("Student is fail");
        }
    }
    
}
