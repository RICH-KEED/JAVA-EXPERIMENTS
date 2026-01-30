public class lab1 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();
        System.out.print("Enter a short value: ");
        short s = sc.nextShort();
        System.out.print("Enter an int value: ");
        int i = sc.nextInt();
        System.out.print("Enter a long value: ");
        long l = sc.nextLong();
        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.print("Enter a char value: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();
        System.out.print("Enter a String: ");
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
        sc.close();
    }
}
