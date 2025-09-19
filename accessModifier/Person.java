package accessModifier;
// Tính đóng gói
// +, Access Modifier (phạm vi truy cập): private, public, protected,
// private -> riêng tư tức là nếu thuộc tính hoặc phương nào có kiểu là private thì ta chỉ có thể truy cập được ở bên trong lớp đó
// public -> cộng cộng, nếu thuộc tính hoặc phương thức, lớp có kiểu là public thì có thể truy cập được ở mọi nơi trong chương trình
// protected -> kế thừa, nếu có thì chỉ có thể truy cập được nội bộ lớp đó, hoặc các class kế thừa từ nó

// Đối với lớp nếu ta không khai báo gì thì mặc định nó sẽ có phạm vi trong package
// Cú pháp:
// public class -> của lớp
// public int tuoi -> thuộc tính
// public void sleep(){}

// Package (gói)-> bên trong nó chưa nhiều class, interface, abstract
// Nếu lớp, thuộc tính, phương thức mà không chỉ định rõ  Access Modifier (public, private, protected) -> thì nó mặc đinh các giá trị đó sẽ có phạm vi
// bên trong gói đó

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
        setUsername("ABC");
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

