class UseStatic {

    static int a = 3;
    static int b;

    // Static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    // Static method
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Main method
    public static void main(String[] args) {
        meth(42);
    }
}