package Exercise05;

public class Congnhan extends CanBo{
    private int bac;

    public Congnhan(String hoTen, String diachi, GioiTinh gioitinh, int tuoi, int bac) {
        super(hoTen, diachi, gioitinh, tuoi);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "Congnhan{" +
                "bac=" + bac +
                ", diachi='" + diachi + '\'' +
                ", gioitinh=" + gioitinh +
                ", tuoi=" + tuoi +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
