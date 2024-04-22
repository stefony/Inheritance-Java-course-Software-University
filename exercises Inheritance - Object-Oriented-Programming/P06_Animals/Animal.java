package P06_Animals;

public abstract class Animal {

    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        if (name.isEmpty() || age < 0 || gender.isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public abstract String produceSound();

    public String getAnimalType() {
        return this.getClass().getSimpleName();
    }
}

