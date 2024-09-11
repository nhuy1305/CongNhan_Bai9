package NhuY23718321;

public class CongNhan {

    private String maCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    // Constructor không tham số
    public CongNhan() {}

    // Constructor với tham số
    public CongNhan(String maCN, String hoTen, int mSoSP) {
        this.maCN = maCN;
        if (hoTen != null && !hoTen.trim().isEmpty()) {
            String[] parts = hoTen.split(" ");
            if (parts.length > 1) {
                this.mHo = parts[0];
                this.mTen = String.join(" ", java.util.Arrays.copyOfRange(parts, 1, parts.length));
            } else {
                this.mHo = "";
                this.mTen = parts[0];
            }
        } else {
            this.mHo = "";
            this.mTen = "";
        }
        this.mSoSP = mSoSP;
    }

    // Getter cho maCN
    public String getMaCN() {
        return maCN;
    }

    // Setter cho maCN
    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    // Getter cho mHo
    public String getHo() {
        return mHo;
    }

    // Setter cho mHo
    public void setHo(String mHo) {
        this.mHo = mHo;
    }

    // Getter cho mTen
    public String getTen() {
        return mTen;
    }

    // Setter cho mTen
    public void setTen(String mTen) {
        this.mTen = mTen;
    }

    // Getter cho mSoSP
    public int getSoSP() {
        return mSoSP;
    }

    // Setter cho mSoSP
    public void setSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }

    // Phương thức tính lương
    public double tinhLuong() {
        double donGia;
        if (mSoSP <= 199) {
            donGia = 0.5;
        } else if ( mSoSP <= 399 ) {
            donGia = 0.55;
        } else if (  mSoSP <= 599 ) {
            donGia = 0.6;
        } else {
            donGia = 0.65;
        }
        return mSoSP * donGia;
    }

    @Override
    public String toString() {
        return "Mã CN: " + maCN + ", Họ tên: " + mHo + " " + mTen + ", Số SP: " + mSoSP + ", Lương: " + tinhLuong();
    }
}
