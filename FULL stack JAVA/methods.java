public class methods {

    void m1(){
        System.out.println("Learning methods");
    }
    int  m2(int a , int b){
      return (a+b);
    }
    String m3(){
      return "Manoranjan";
    }
    void m4(int age,String name){
        System.out.println(age+ "  "+name);
    }

    public static void main(String[] args) {
        System.out.println("Start");
       System.out.println("--------------"); 
      // object creation 
      methods mtd = new methods();
     //MWWAWR
     mtd.m1();
     //MWRAWA
       System.out.println("--------------"); 
     int result = mtd.m2(20,30);
     System.out.println(result);
        System.out.println("--------------"); 
     String reslt = mtd.m3();
      System.out.println(reslt);
  System.out.println("--------------"); 
      mtd.m4(20,"Manoranjan");
        System.out.println("--------------"); 
        System.out.println("End");
    }
    
}
