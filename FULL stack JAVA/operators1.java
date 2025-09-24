public class operators1 {
    public static void main(String[]args){

        // Relational operator
        int x = 10;
        int y = 20;

        System.out.println(x<y);
        System.out.println(x<=5);
        System.out.println(y>=10);
        System.out.println(y<=20);
        System.out.println(x!=y);

        //Logical operator
        int a = 10;
        int b = 20;
        boolean result = a<b && a == 1;
        
        System.out.println(result);
        System.out.println(a <= 10  || a > b);
        System.out.println(!true);

        //Unary operator
        
        System.out.println(a);
        a++;
        System.out.println(a);
        System.out.println(b);
        b--;
        System.out.println(b);
        
        System.out.println(a);
        --a;
        
        int p = 10;
        int q = ++p;
        System.out.println(q);

        int i = 40;
        int j = i++;
        System.out.println(i+ " " +j);

        int t = 5;
        int u = --t;
        System.out.println(t+ " " +u);

        //Ternary operator
        int l = 10;
        int m = 20;
        int max =  l>m ? l : m;
        System.out.println("max of " +l+ "& " +m+ " is " +max );




    }
    
}
