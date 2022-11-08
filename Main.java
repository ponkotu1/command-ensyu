import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("èº«é•·(m):");
        double heigth = sc.nextDouble();
        System.out.print("ä½“é‡(kg):");
        double weight = sc.nextDouble();
        double a = heigth * heigth;
        double BMI = weight / a;
        System.out.println("‚ ‚È‚½‚ÌBMI’l‚Í"+((Math.floor(BMI * 100)) / 100)+"‚Å‚·B");
    }
}
