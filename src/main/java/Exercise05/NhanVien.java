package Exercise05;

public class NhanVien extends CanBo{
    private String congviec;

    public NhanVien(String hoTen, String diachi, GioiTinh gioitinh, int tuoi, String congviec) {
        super(hoTen, diachi, gioitinh, tuoi);
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congviec='" + congviec + '\'' +
                ", diachi='" + diachi + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh=" + gioitinh +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
