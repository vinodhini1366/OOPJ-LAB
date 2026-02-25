
class A 
	{
    int i;
    int j;
    void showij() {
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }
}


class B extends A {

    
    int k;

   
    void showk() {
        System.out.println("Value of k: " + k);
    }

    
    void sum() {
        System.out.println("Sum of i, j, and k: " + (i + j + k));
    }
}


public class SimpleInheritance {

    
    public static void main(String[] args) {

       
        A superOb = new A();

        
        superOb.i = 10;
        superOb.j = 20;

        
        System.out.println("Contents of superOb:");
        superOb.showij();

        System.out.println();

        
        B subOb = new B();

        
        subOb.i = 5;
        subOb.j = 15;
        subOb.k = 25;

        System.out.println("Contents of subOb:");
        subOb.showij();

       
        subOb.showk();

        
        subOb.sum();
    }
}
