public class employee {
    int age = 31;
   static  String id = "22BCS10691";  // static variable so no need to create obj for this
    String  name = "Manoranjan";

    public static void main(String[] args){

        System.out.println("Start");
      // object creation for non static variables
      employee e = new employee();

        System.out.println("The age of Employee is :" +e.age);
        System.out.println("The ID of Employee is :" +id);
        System.out.println("The nmae  of Employee is :" +e.name);


          System.out.println("END");
    }
    
    
    
}
