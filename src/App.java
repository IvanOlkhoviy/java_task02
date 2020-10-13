public class App {
    public static void main(String[] args) {
        Shape shape = new Shape(20);
        Box box = new Box(100);

        box.add(shape);
        box.add(shape);
        box.add(shape);
        box.add(shape);
        box.add(shape);
        box.add(shape);
        box.add(shape);
    }
}
