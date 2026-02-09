package th.ac.sau.dti;

public class Square {

public double widths;
public double longs;
public double area;

    public void calSquareArea(){
        area = widths * longs;
    }

    public void showSquareArea(){
        System.out.println("สี่เหลี่ยมขขนาด " + widths + " x "+ longs);
        System.out.println("มีพื้นที่ " + area);
    }
}
