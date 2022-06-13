package QLSinhVien;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
public class main 
{
    Scanner scanner = new Scanner(System.in);
    void menu()
    {
        System.out.println("\n\n Chuong trinh quan ly diem sinh vien");
        System.out.println("1. Them 1 sinh vien");
        System.out.println("2. Xuat danh sach sinh vien");
        System.out.println("3. Tim sinh vien theo ten");
        System.out.println("4. Thong ke sinh vien cua tung khoa");
        System.out.println("5. Sap xep sinh vien giam dan theo diem trung binh");
        System.out.println("6. Doc file");
        System.out.println("7. Luu file");
        System.out.println("0. Thoat");
        System.out.print("Hay chon....");
    }
    public void xuLy()
    {
        DanhSachSinhVien ds=new DanhSachSinhVien();
        int chon=0;
        do{
            menu();
            chon=scanner.nextInt();
            switch(chon)
            {
                case 1:
                {
                    ds.them1SinhVien();
                    break;
                }
                case 2:
                {
                    ds.xuatDanhSach();
                    break;
                }
                case 3:
                {
                    ds.timSinhVienTheoTen();
                    break;
                }
                case 4:
                {
                    ds.thongKeDSTheoKhoa();
                    break;
                }
                case 5:
                {
                    ds.sapXepGiamDanTheoDTB();
                    System.out.println("Danh sach sinh vien sau khi sap xep :");
                    ds.xuatDanhSach();
                    break;
                }
                case 6:
                {
                    ds.docFile();
                    break;
                }
                case 7:
                {
                    ds.luuFile();
                    break;
                }
            }
        }while(chon!=0);
    }
    public static void main(String[] args)
    {
        main m=new main();
        m.xuLy();
    }
}
