package SPT_Builder_DP;

public final class PersonBuilder implements Builder{
    public PersonBuilder(String name, int age, String address) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private final String name;
    private int age;
    private String address;

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        Person person = new Person(this);
        return person;
    }
}
