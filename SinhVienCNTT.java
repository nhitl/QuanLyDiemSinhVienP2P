package QLSinhVien;


import java.util.Scanner;

public class SinhVienCNTT extends SinhVien
{
    private double diemKTLT;//điểm môn kỹ thuật lập trình
    private double diemLTHDT;//Điểm môn lập trình hướng đối tượng
    private double diemSQLSV;//Điểm môn SQL Sever
    public SinhVienCNTT() 
    {
        super();
    }
    public SinhVienCNTT(String hoTen, String ngaySinh,String tenLop,  double diemKTLT, double diemLTHDT, double diemSQLSV) {
        super(hoTen, ngaySinh,tenLop);
        this.diemKTLT = diemKTLT;
        this.diemLTHDT = diemLTHDT;
        this.diemSQLSV = diemSQLSV;
    }
    public void nhap()
    {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhap diem mon ky thuat lap trinh [0;10]: ");
            diemKTLT=scanner.nextDouble();
        }while(diemKTLT<0||diemKTLT>10);
        do{
            System.out.print("Nhap diem mon lap trinh huong doi tuong [0;10]: ");
            diemLTHDT=scanner.nextDouble();
        }while(diemLTHDT<0||diemLTHDT>10);
        do{
            System.out.print("Nhap diem mon SQL sever [0;10]: ");
            diemSQLSV=scanner.nextDouble();
        }while(diemSQLSV<0||diemSQLSV>10);
    }
    public double getDiemKTLT() {
        return diemKTLT;
    }
    public void setDiemKTLT(double diemKTLT) {
        this.diemKTLT = diemKTLT;
    }
    public double getDiemLTHDT() {
        return diemLTHDT;
    }
    public void setDiemLTHDT(double diemLTHDT) {
        this.diemLTHDT = diemLTHDT;
    }
    public double getDiemSQLSV() {
        return diemSQLSV;
    }
    public void setDiemSQLSV(double diemSQLSV) {
        this.diemSQLSV = diemSQLSV;
    }
    @Override
    public String toString() {
        return super.toString()+", KTLT"+diemKTLT+", LTHDT: "+diemLTHDT+", SQLSV: "+diemSQLSV+", DTB: "+getDTB();
    }
    public double getDTB()
    {
        return (diemKTLT+diemLTHDT*2+diemSQLSV)/4;
    }
    public String getDinhDangLuuFile()
    {
        return super.getDinhDangLuuFile()+","+diemKTLT+","+diemLTHDT+","+diemSQLSV;
    }
}
