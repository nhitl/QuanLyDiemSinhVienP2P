package QLSinhVien;

import java.util.*;
import java.io.*;
public class DanhSachSinhVien 
{
    private ArrayList<SinhVien> a;
    
    public DanhSachSinhVien() {
        a=new ArrayList<SinhVien>();
    }
    public DanhSachSinhVien(ArrayList<SinhVien> a) {
        this.a = a;
    }
    public ArrayList<SinhVien> getA() {
        return a;
    }
    public void setA(ArrayList<SinhVien> a) {
        this.a = a;
    }
    public void them1SinhVien()
    {
        Scanner scanner = new Scanner(System.in);
        int chon=0;
        do{
            System.out.print("Chon khoa can them sinh vien\n1. Khoa kinh te\n2. Khoa thong nghe thong tin\nHay chon....");
            chon=scanner.nextInt();
        }while(chon!=1 &&chon!=2);
        System.out.println("Nhap thong tin sinh vien can them ");
        if(chon==1)
        {
            SinhVienKinhTe kt=new SinhVienKinhTe();
            kt.nhap();
            a.add(kt);
        }else 
        {
            SinhVienCNTT cntt=new SinhVienCNTT();
            cntt.nhap();
            a.add(cntt);
        }
        System.out.println("Them sinh vien thanh cong ");
    }
    public void docFile()
    {
        a=new ArrayList<SinhVien>();
        try{
            FileInputStream fis = new FileInputStream("QLSinhVien/data.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bfr = new BufferedReader(isr);
            String line = bfr.readLine();
            while(line != null)
            {
                String []x = line.split(",");
                if(x.length == 5)
                {
                    SinhVienKinhTe kt = new SinhVienKinhTe(x[0],x[1],x[2],Double.parseDouble(x[3]),Double.parseDouble(x[4]));
                    a.add(kt);
                }
                else
                {
                    SinhVienCNTT cntt = new SinhVienCNTT(x[0],x[1],x[2],Double.parseDouble(x[3]),Double.parseDouble(x[4]),Double.parseDouble(x[5]));
                    a.add(cntt);
                }
                line = bfr.readLine();
            }
            fis.close();
            isr.close();
            bfr.close();
            System.out.println("Doc file thanh cong.");
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Loi doc file");
        }
    }
    public void xuatDanhSach()
    {
        for(int i=0;i<a.size();i++)
            System.out.println(a.get(i).toString());
    }
    public void timSinhVienTheoTen()
    {
        Scanner scanner = new Scanner(System.in);
        String ten;
        System.out.print("Nhap ten sinh vien can tim : ");
        ten=scanner.nextLine();
        System.out.println("Danh sach sinh vien co ten "+ten+" la : \n");
        for(int i=0;i<a.size();i++)
            if(a.get(i).getHoTen().equals(ten))
                System.out.println(a.get(i).toString());
    }
    public void thongKeDSTheoKhoa()
    {
        System.out.println("Danh sach sinh vien khoa kinh te :");
        for(int i=0;i<a.size();i++)
            if(a.get(i).getClass()==SinhVienKinhTe.class)
                System.out.println(a.get(i).toString());
        System.out.println("Danh sach sinh vien khoa cong nghe thong tin :");
        for(int i=0;i<a.size();i++)
            if(a.get(i).getClass()==SinhVienCNTT.class)
                System.out.println(a.get(i).toString());
    }
    public void sapXepGiamDanTheoDTB()
    {
        for(int i=0;i<a.size()-1;i++)
           for(int j=i+1;j<a.size();j++)
                if(a.get(i).getDTB()<a.get(j).getDTB())
                {
                    SinhVien tam=a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tam);
                }
    } 
    public void luuFile()
    {
        try {
            FileWriter writer = new FileWriter("QLSinhVien/data.txt");
            for(int i=0;i<a.size();i++)
                writer.write(a.get(i).getDinhDangLuuFile()+"\n");
            writer.close();

            System.out.println("Luu file thanh cong.");
        } catch (IOException e) {
            System.out.println("Loi luu file.");
        }
    }
}
