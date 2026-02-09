package th.ac.sau.dti;

public class DtiMain {
    public static void main() {
        Square ob1;
        ob1 = new Square();

        Square ob2 = new Square();

        ob1.widths = 10;
        ob1.longs = 20;
        ob1.calSquareArea();
        ob1.showSquareArea();

        ob1.widths = 100;
        ob1.longs = 200;
        ob1.calSquareArea();
        ob1.showSquareArea();

        ob2.widths = 11;
        ob2.longs = 22;
        ob2.calSquareArea();
        ob2.showSquareArea();
    }
}
