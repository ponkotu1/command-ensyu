import java.util.Scanner;

public class Ensyu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("��l�ڂ̐g��(m):");
        double heigth = sc.nextDouble();
        System.out.print("��l�ڂ̑̏d(kg):");
        double weight = sc.nextDouble();
        
        System.out.print("��l�ڂ̐g��(m):");
        double heigth2 = sc.nextDouble();
        System.out.print("��l�ڂ̑̏d(kg):");
        double weight2 = sc.nextDouble();
        double a = heigth * heigth;
        double a2 = heigth2 * heigth2;
        double BMI = weight / a;
        double BMI2 = weight / a2;

        System.out.println((Math.floor(BMI * 100)) / 100);
        System.out.println((Math.floor(BMI2 * 100)) / 100);
    }
}
