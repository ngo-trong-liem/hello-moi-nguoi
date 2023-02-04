
package bai4_oop;

public class bai4_huongDoiTuong {
    //chuong trinh nguoi yêu
    //thuộc tính tên tuổi hay là các tính chất để xác định cô người yêu
    private String tenNY;
    private int namSinh;
    String moTa;
    public String yeu(String tenNYCuaCoTa) {
        return tenNYCuaCoTa;
    }
    public bai4_huongDoiTuong(String ten ,int namSinh){
        this.tenNY = ten;
        this.namSinh = namSinh;
    }
    
    //getter
    public String getTenNY(){
        return this.tenNY;
    }
    public int getNamSinh(){
        return this.namSinh;
    }

    public String getMoTa() {
        return this.moTa;
    }
//    setter - gan vao gia tri thuoc tinh
    public void setTenNY(String tenNY){
        this.tenNY = tenNY;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public bai4_huongDoiTuong(String tenNY, int namSinh, String moTa) {
        this.tenNY = tenNY;
        this.namSinh = namSinh;
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "ten nguoi yeu toi la: "+ this.tenNY + "\nmo ta: "+ this.moTa;
    }  
}
