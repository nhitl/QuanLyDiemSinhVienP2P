package QLSinhVien;


import java.util.Scanner;

public abstract  class SinhVien 
{
    private String hoTen;//Họ tên
    private String ngaySinh;//Ngày sinh
    private String tenLop;//Tên lớp
    
    public SinhVien() 
    {
    }
    public SinhVien(String hoTen, String ngaySinh,String tenLop) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.tenLop = tenLop;
    }
    public void nhap()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap ho ten sinh vien : ");
        hoTen=scanner.nextLine();
        System.out.print("Nhap ngay sinh : ");
        ngaySinh=scanner.nextLine();
        System.out.print("Nhap ten lop : ");
        tenLop=scanner.nextLine();
    }
    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public abstract double  getDTB();
    @Override
    public String toString() {
        return "Ho ten: "+hoTen+", Ngay sinh: "+ngaySinh+", Ten lop: "+tenLop;
    }
    public String getDinhDangLuuFile()
    {
        return hoTen+","+ngaySinh+","+tenLop;
    }
}
