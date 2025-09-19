package polymorphism;

public class Student extends Person {
    private Integer msv;

    public Student() {
    }

    public Student(Integer msv, String username, Integer age, String address, String job) {
        super(username, age, address, job);
        this.msv = msv;
    }

    public Integer getMsv() {
        return msv;
    }
    public void setMsv(Integer msv) {
        this.msv = msv;
    }

    @Override
    public void sleep() {
        System.out.println("KHON");
    }



}
