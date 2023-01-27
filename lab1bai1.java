
import java.util.Scanner;

public class lab1bai1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("moi nhap so: ");
      int num = input.nextInt();

      for (int i = num; i >= 0; i--) {
         System.out.println(i);
      }
   }
}

/*
    1.kiểu dữ liệu 
boolearn, byte, char, short, int, long, float, double
    2.khai bao bien:
<kieu du lieu> <ten bien>[=<gia tri>]
    3.co 2 loai bien 
bien toan cuc: nam ngoai phuong thuc
bien cuc bo: nam trong phuong thuc

*/
