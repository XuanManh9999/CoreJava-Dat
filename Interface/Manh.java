package Interface;

public class Manh implements MuaNha {


    public String getTenHopDong() {
        return TenHopDong; // cách dùng thuộc tính khi thực thi lớp
    }

//    public void setTenHopDong(String newTenHopDong) {
//        TenHopDong = newTenHopDong;
//    }


    @Override
    public void xacMinhThuNhap() {
        System.out.println(TenHopDong);
    }

    @Override
    public void xacMinhSoVon() {

    }

    @Override
    public void xacMinhSucKhoe() {

    }

    @Override
    public void XacMinhGioiTinh() {

    }

}
