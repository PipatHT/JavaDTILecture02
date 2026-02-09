package info.thailand;

public class MyClass02 {
    public void metA(){
        System.out.println("AAA");
    }

    public void metB(String fname, String lname, int age){
        System.out.println("ชื่อ " + fname + " " + lname);
        System.out.println("อายุ " + age + "ปี");
    }

    public String metC(){
        return "Wow wow wow";
    }

    public int sum3Number(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        return sum;
    }
}
