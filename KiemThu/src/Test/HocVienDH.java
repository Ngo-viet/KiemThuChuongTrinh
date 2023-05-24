package Test;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Ngo Dinh Viet
 */
public class HocVienDH extends HocVien implements Comparable<HocVienDH>, Serializable{
    private int soBuoi;
    private double donGiaDH;

    public HocVienDH() {
    }
    public HocVienDH(int soBuoi, double donGiaDH, String hoTen, String diaChi, String loaiCT, int loaiUT) {
        super(hoTen, diaChi, loaiCT, loaiUT);
        this.soBuoi = soBuoi;
        this.donGiaDH = donGiaDH;
    }

    public HocVienDH(int soBuoi, double donGiaDH) {
        this.soBuoi = soBuoi;
        this.donGiaDH = donGiaDH;
    }

   
    
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap don gia DH: ");
        donGiaDH= sc.nextDouble();       
        try {
        	System.out.print("Nhap so buoi hoc: ");
            soBuoi = sc.nextInt();
            if(soBuoi<0) {
            	throw new Exception("Can nhap so buoi lon hon 0");
            }
        }catch(Exception ex){
        	System.out.println(ex.getMessage());
        	System.exit(0);
        }
    }

    @Override
    public double hocPhi() {
        if(getLoaiUT()==1){
            return soBuoi*donGiaDH-1000000;
        }
        else if(getLoaiUT()==2){
            return soBuoi*donGiaDH-500000;
        }
        else{
            return soBuoi*donGiaDH;
        }
    }
    //Kiểm tra so sánh học phí
    @Override
    public int compareTo(HocVienDH o) {
        if (this.hocPhi()>o.hocPhi()){
            return 1;
        }else if(this.hocPhi() < o.hocPhi()) {
        	return -1;
        }
        else
            return 0;
    }
    @Override
    public String toString(){
        return super.toString()+ String.format("%-15s %-15s %-15s", soBuoi, donGiaDH , hocPhi());
    }
    
}
