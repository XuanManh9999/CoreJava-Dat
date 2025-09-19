package polymorphism;

public class  Person {

    private String username;
    private Integer age;
    private String address;
    private String job = "developer";

    public Person () {
        System.out.println("GOI HAM TẠO KHÔNG THAM SỐ");
    }

    public Person(String username, Integer age, String address, String job) {
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


    // Overloading

    public void sleep() {
        System.out.println("NGU");
    }

    public int sleep(Integer hour) {
        System.out.println("Ngu " + hour);
        return 0;
    }

    public void sleep(String username) {
        System.out.println(username + " Đang ngủ");
    }


    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}


