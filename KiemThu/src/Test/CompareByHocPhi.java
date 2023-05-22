package Test;

import java.util.Comparator;

import Test.HocVienDH;
/**
 *
 * @author Ngo Dinh Viet
 */
public class CompareByHocPhi implements Comparator<HocVienDH>{
	@Override
    public int compare(HocVienDH o1, HocVienDH o2){
        if(o1.hocPhi()>o2.hocPhi())
            return 1;
        else
            return 0;
    }
}

