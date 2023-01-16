package SPT_Builder_DP;

public class Person {
    private final String name;
    private final int age;
    private final String address;

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    Person(PersonBuilder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
    }
}
