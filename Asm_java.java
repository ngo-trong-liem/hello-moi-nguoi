
package asm_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Asm_java {

    public static void main(String[] args) {
        System.out.println("hello world");
//        Y1. Nhập danh sách nhân viên từ bàn phím.
//        Y2. Xuất danh sách nhân viên ra màn hình.
//        Y3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.
//        Y4. Xóa nhân viên theo mã nhập từ bàn phím.
//        Y5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím
//        Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.
//        Y7. Sắp xếp nhân viên theo họ và tên.
//        Y8. Sắp xếp nhân viên theo thu nhập.
//        Y9. Xuất 5 nhân viên có thu nhập cao nhất.

        int a;
        Scanner sc = new Scanner(System.in);
        ArrayList<nhanVien> arrNV = new ArrayList<>();
        do{
        System.out.println("----------------------Menu-------------------");
        System.out.println("\t1. Nhap danh sach sinh vien tu ban phim");
        System.out.println("\t2. Xuat danh sach nhan vien ra man hinh");
        System.out.println("\t3. Tim va hien thi nhan vien theo ma nhap tu ban phim");
        System.out.println("\t4. Xoa nhan vien theo ma nhap tu ban phim");
        System.out.println("\t5. Cap nhat thong tin sinh vien theo ma tu ban phim");
        System.out.println("\t6. Tim cac nhan vien theo khoang luong nhap vao tu ban phim");
        System.out.println("\t7. Sap xep nhan vien theo ho va ten");
        System.out.println("\t8. Sap xep nhan vien theo thu nhap");
        System.out.println("\t9. Xuat 5 nhan vien co thu nhap cao nhat");
        System.out.println("\t0. thoat");
        System.out.println("----------------------------------------------");
        System.out.print("moi nhap chuc nangp[0-9]: ");
        a = sc.nextInt();
         
            switch(a){
                case 1:
                    break;
                case 2:
                    break;
                case 3:  
                    break;
                case 4:   
                    break;
                case 5:   
                    break;
                case 6:   
                    break;
                case 7:   
                    break;
                case 8:   
                    break;
                case 9:   
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ban nhap sai chuc nang! moi nhap lai.");
            }
        }while(true);  //while(a!=0);
    }// ket thuc main
    void nhapDSNV(ArrayList<nhanVien> arrNV){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("moi nhap ma nv: ");
            String maNV = sc.nextLine();
            System.out.println("moi nhap ten nv: ");
            String tenNV = sc.nextLine();
            System.out.println("moi nhap luong nv: ");
            double luongNV = Double.parseDouble(sc.nextLine());
            System.out.println("chuc vu(\n\t1. Truong phong\n\t2.Nhan Vien): ");
            int cv = Integer.parseInt(sc.nextLine());
            if(cv == 1){
                System.out.print("Tien trach nhiem: ");
                Double trachNhiem = Double 
            }
            System.out.println("co nhap tiep khong?");
        }while(!sc.nextLine().equalsIgnoreCase("k"));
    }
}
