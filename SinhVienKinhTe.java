package QLSinhVien;


import java.util.Scanner;

public class SinhVienKinhTe extends SinhVien
{
    private double diemNLTK;//Điểm môn nguyên lý thống kê
    private double diemKTVM;//Điểm môn kinh tế vĩ mô
    public SinhVienKinhTe() 
    {
        super();
    }
    public SinhVienKinhTe( String hoTen, String ngaySinh,String tenLop, double diemNLTK, double diemKTVM) 
    {
        super(hoTen, ngaySinh,tenLop);
        this.diemNLTK = diemNLTK;
        this.diemKTVM = diemKTVM;
    }
    public void nhap()
    {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhap diem mon nguyen ly thong ke [0;10]: ");
            diemNLTK=scanner.nextDouble();
        }while(diemNLTK<0||diemKTVM>10);
        do{
            System.out.print("Nhap diem mon kinh te vi mo [0;10]: ");
            diemKTVM=scanner.nextDouble();
        }while(diemKTVM<0||diemKTVM>10);
    }
    public double getDiemNLTK() {
        return diemNLTK;
    }
    public void setDiemNLTK(double diemNLTK) {
        this.diemNLTK = diemNLTK;
    }
    public double getDiemKTVM() {
        return diemKTVM;
    }
    public void setDiemKTVM(double diemKTVM) {
        this.diemKTVM = diemKTVM;
    }
     
    public double getDTB()
    {
        return (diemNLTK+diemKTVM*2)/3;
    }
    @Override
    public String toString() 
    {
        return super.toString()+", NLTK: "+diemNLTK+", KTVM: "+diemKTVM+", DTB: "+getDTB();
    }
    public String getDinhDangLuuFile()
    {
        return super.getDinhDangLuuFile()+","+diemNLTK+","+diemKTVM;
    }
}
