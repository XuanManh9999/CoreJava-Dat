package inheritance;
// msv
// mnv
public class Person {
    protected String username;
    protected Integer age;
    protected String address;
    protected String job = "developer";

    public Person () {
        System.out.println("GOI HAM TẠO KHÔNG THAM SỐ");
    }

    public Person(String username, Integer age, String address, String job) {
        System.out.println("Có gọi vào ");
        this.username = username;
        this.age = age;
        this.address = address;
        this.job = job;
    }

    protected String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "username='" + username + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                ", job='" + job + '\'' +
//                '}';
//    }
}
