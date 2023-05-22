package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Ngo Dinh Viet
 */
public class Demo {

    static TreeSet<HocVienDH> ts = new TreeSet<HocVienDH>();
    

    public static void fakeData(){
         
         HocVienDH hv1 = new HocVienDH(1, 6000000, "Nguyen van A", "Ha Noi", "DH",1);
         HocVienDH hv2 = new HocVienDH(2, 6000000, "Nguyen van A", "Ha Noi", "DH",1);
         HocVienDH hv3 = new HocVienDH(2, 4000000, "Nguyen van C", "Ha Noi", "DH",1);
         ts.add(hv1);
         ts.add(hv2);
         ts.add(hv3);
         
     }
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Ho ten","Dia chi", "Loai CT","Loai UT","So buoi", "Don gia","Hoc phi");
    }
    public static void hienThiDL(TreeSet ts){
        inTieuDe();
        Iterator bir = ts.iterator();
         while(bir.hasNext()){        	 
             HocVienDH hv = (HocVienDH) bir.next();
             System.out.println(hv);
         }
    }
    
    public static void themHV(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc vien moi: ");
        n = sc.nextInt();
        HocVienDH[] dshvmoi = new HocVienDH[n];
        for(int i = 0;i<n;i++){
            dshvmoi[i] = new HocVienDH();
            dshvmoi[i].nhapThongTin();
            if(dshvmoi[i].getHoTen().equals("")){
                break;
            }
            ts.add(dshvmoi[i]);
        }
    }
    
    public static void timMax(){
        CompareByHocPhi hp = new CompareByHocPhi();
        HocVienDH hpMax = Collections.max(ts,hp);
        System.out.println("===DANH SACH HOC VIEN CO HOC PHI LON NHAT ===");
        inTieuDe();
        //duyệt các phần tử từ đầu đến cuối
        Iterator bir = ts.iterator();
        //lấy ra các phần tử
         while(bir.hasNext()){            
             HocVienDH hv = (HocVienDH) bir.next();
             if(hv.hocPhi() == hpMax.hocPhi())
             System.out.println(hv);
         }
    }
    public static void main(String[] args) {
        
        fakeData();
        System.out.println("====Danh sach hoc vien mau ====");
        
        hienThiDL(ts);
        themHV();
        System.out.println("====Danh sach hoc vien sau khi them ====");
        
        hienThiDL(ts);
        timMax();
        
        
    }
    
}
