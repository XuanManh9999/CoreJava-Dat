public class ViDu1 {
    // set gia tri default
    private String ten = "Manh";
    private int tuoi = 23;

    ViDu1() {
        // constructor default
    }
    ViDu1(String ten) {
        this.ten = ten;
    }

     String getTen() {
        return ten;
    }

     void setTen(String ten) {
        this.ten = ten;
    }

     int getTuoi() {
        return tuoi;
    }

     void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    void sleep() {
        System.out.println("NGU");
    }

}
