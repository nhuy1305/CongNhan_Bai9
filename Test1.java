


package NhuY23718321;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        DanhSachCongNhan ds = new DanhSachCongNhan();
        try (Scanner scanner = new Scanner(System.in)) {
			char tieptuc;
			do {
			    System.out.print("Nhập mã công nhân: ");
			    String maCN = scanner.nextLine();

			    System.out.print("Nhập tên công nhân: ");
			    String tenCN = scanner.nextLine();

			    System.out.print("Nhập số sản phẩm: ");
			    int soSP = scanner.nextInt();
			    scanner.nextLine(); // Đọc bỏ ký tự xuống dòng

			    CongNhan congNhan = new CongNhan(maCN, tenCN, soSP);
			    ds.themCongNhan(congNhan);

			    System.out.print("Bạn có muốn nhập tiếp (y/n)? ");
			    tieptuc = scanner.nextLine().charAt(0);
			} while (tieptuc == 'y' || tieptuc == 'Y');
		}

        ds.inDanhSach();
        System.out.println("Tổng số sản phẩm: " + ds.tongSoSP());
    }
}