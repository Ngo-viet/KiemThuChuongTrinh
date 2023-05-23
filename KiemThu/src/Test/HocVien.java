package Test;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Ngo Dinh Viet
 */
public abstract class HocVien implements Serializable{
    private String hoTen;
    private String diaChi;
    private String loaiCT;
    private int loaiUT;

    public HocVien(String hoTen, String diaChi, String loaiCT, int loaiUT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiCT = loaiCT;
        this.loaiUT=loaiUT;
    }

    public HocVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getLoaiCT() {
        return loaiCT;
    }

    public int getLoaiUT() {
        return loaiUT;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiCT(String loaiCT) {
        this.loaiCT = loaiCT;
    }

    public void setLoaiUT(int loaiUT) {
        this.loaiUT = loaiUT;
    }
    
    public void nhapThongTin(){
    	Scanner sc = new Scanner(System.in);
    	
    	try {
    		System.out.print("Nhap ho ten: ");      
            hoTen= sc.nextLine();
            if(hoTen.isEmpty()) {
            	throw new Exception("Can nhap ten thong tin day du");             	
            }
            
    	}catch(Exception ex) {
    		System.out.println(ex.getMessage());
    		System.exit(0);
    	}     
    	/*System.out.print("Nhap ho ten: ");      
        hoTen= sc.nextLine();*/
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap loai chuong trinh: ");
        loaiCT = sc.nextLine();
        System.out.print("Nhap loai uu tien: ");
        loaiUT = sc.nextInt();
    }
    abstract public double hocPhi();
    @Override
    public String toString(){
        return String.format("%-15s %-15s %-15s %-15s", hoTen,diaChi,loaiCT,loaiUT);
    }
    
}