public class nestedif {
    public static void main(String[]args){

        /* 
        int a = 5;
        if(a > 5) //true than inner if will executed 
        {
        System.out.println("Inside outer if");
           if(a == 5){
            System.out.println("a is equal to 5");
           }
           else{
            System.out.println("not equal to 5");
           }
        }
        else  // if false than this will executed
        {
            System.out.println("a greater than 5");
        }
            */
        /* 
        String id = "22bcs10691";
         int password = 1234;

        if(id == "22bcs10691"){
            System.out.println("Id is correct :");
           
            if(password == 1234)
            {
                System.out.println("User loged in");
            } 
            else{
                System.out.println("Else password is incorrect");
            } 
            }
            else{
                System.out.println("Login unsucessfull");
            }
                */

          int age = 22;
          String[] gender = {"Male" , "Female"};

          if(gender.equals("Male")){
            System.out.println("User is male");{
                if(age >=22){
                     System.out.println("his age is greater than 22");
                }
                System.out.println("user is eligible for marriage");
            }
          }
          else {
            System.out.println("He can't get married");
          }
        }
    }
    

