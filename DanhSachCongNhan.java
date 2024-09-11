
package NhuY23718321;

import java.util.ArrayList;
import java.util.List;

public class DanhSachCongNhan {

    private List<CongNhan> danhSach;

    public DanhSachCongNhan() {
        danhSach = new ArrayList<>();
    }

    public void themCongNhan(CongNhan cn) {
        danhSach.add(cn);
    }

    public void inDanhSach() {
        for (CongNhan cn : danhSach) {
            System.out.println(cn);
        }
    }

    public int tongSoSP() {
        int tong = 0;
        for (CongNhan cn : danhSach) {
            tong += cn.getSoSP(); // Sử dụng getSoSP() cho phương thức getter
        }
        return tong;
    }
}


