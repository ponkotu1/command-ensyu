import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("身長(m):");
        double heigth = sc.nextDouble();
        System.out.print("体重(kg):");
        double weight = sc.nextDouble();
        double a = heigth * heigth;
        double BMI = weight / a;
        System.out.println("���Ȃ���BMI�l��"+((Math.floor(BMI * 100)) / 100)+"�ł��B");
    }
}
