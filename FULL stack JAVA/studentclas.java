public class studentclas {
    //static variables
   static  int age = 20;
    //non-static variables
    String name = "Manoranjan";

    public static void main(String[] args) {
        System.out.println("Start");
    
   // Creating object
   studentclas s = new studentclas();  // object creation
   // to access the attributes we use dot operators 
   // if we use static as a keyword for the variable we don't need to create object
   System.out.println(age);
   // we don't use static so it become non static variable and i have to make object
   System.out.println(s.name);



        System.out.println("End");
    }
    
}

    

