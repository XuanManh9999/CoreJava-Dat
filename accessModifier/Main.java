package accessModifier;

 class Main {
    public void mainCu () {
        System.out.println("CALL");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getUsername() + " " + person.getAddress() + " " + person.getAge() + " " + person.getJob());
    }
}
