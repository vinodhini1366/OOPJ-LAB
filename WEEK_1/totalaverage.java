class TotalAverage {
    // Declare static variables
    static int a, b;
    static int total;
    static double average;

    // Define the calculate() method
    static void calculate() {
        total = a + b;
        average = total / 2.0;
    }

    // Main method
    public static void main(String[] args) {
        // Convert command-line arguments into integers
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        // Call calculate()
        calculate();

        // Display results
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}