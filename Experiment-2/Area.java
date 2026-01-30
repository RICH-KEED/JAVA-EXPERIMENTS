class Area {
    int calculate(int side) {
        return side * side;
    }

    int calculate(int length, int width) {
        return length * width;
    }
    public static void main(String[] args) {
        Area a = new Area();

        int square = a.calculate(5);
        int rectangle = a.calculate(6, 4);

        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
    }
}
