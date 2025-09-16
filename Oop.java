public class Oop {

    static class ConNguoi {
        // Thuộc tính (các đặc điểm của lớp(đối tượng)
        String hoTen;
        int tuoi;
        String diaChi;

        float tien;

        float no;

        // Hàm khởi tạo

        ConNguoi () {
            // mặc đinh java nó có sẵn cái này
//            System.out.println("Vào đây");
        }

        ConNguoi (String hoTen, int tuoi, String diaChi, float tien, float no) {
            this.hoTen = hoTen;
            this.diaChi = diaChi;
            this.no = no;
            this.tien = tien;
            this.tuoi = tuoi;
        }

        // VD người -> mắt, mũi, miệng, chân, tay
        // getter (đối tượng dùng để lấy lên), setter (đặt giá trị vào đối tượng)

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public float getTien() {
            return tien;
        }

        public void setTien(float tien) {
            this.tien = tien;
        }

        public float getNo() {
            return no;
        }

        public void setNo(float no) {
            this.no = no;
        }


        // Phương thức (các hành động của đối tượng)
        // VD người -> đi tắm, đi ăn, đi ngủ, đi làm, nói, đấm


        float soTienConLai() {
            return this.tien - this.no;
        }

        // ODM -> JSONBLOB

    }



    public static void main(String[] args) {
//        # Lập trình hường đối tượng -> nó sẽ giúp ta mô tả các đối tượng thực tế bên ngoài và trong chương trình máy tính

         // Tên của tối tượng sẽ bắt bằng chứ in hoa đâầu tiên
        // VD: ConNguoi, XeDap// cách đặt tên đối tượng
        // conNguoi() -> hàm
        // int a = 1;
        // final PI = 3.14


//        +, Class & Object: các tạo lớp, thuộc tính, phương thức, khởi tạo đối tượng
//        +, Constructor: mặc định, có tham số
//        +, Encapsulation: đóng gói getter, setter, package
//        +, Inheritance: kế thề với extends
//        +, Polymorphism: Đa hình (Overriding, Overloading)
//        +, Abstract & Interface: lớp trừu tượng
//                +, Access Modifier: private, public, protected,
//
//        # Collection
//        +, List, Map, Set



        ConNguoi Dat = new  ConNguoi(); // khoi tao doi tuong dat, với class ConNguoi


        // Dùng setter để gán giá trị cho thuộc tính của đối tượng nếu không muốn khởi tạo trong hàm tạo
        Dat.setHoTen("Đỗ Tiến Đạt");
        System.out.println(Dat.getHoTen());
        System.out.println(Dat.soTienConLai());

        ConNguoi Manh = new ConNguoi("Nguyễn Xuân Mạnh",  22, "Hà Nội", 123.500F, 100F);

        // dùng get để truy cập các thuộc tính
        System.out.println(Manh.getHoTen());

        // truy cập các phương thức của nó





    }
}
