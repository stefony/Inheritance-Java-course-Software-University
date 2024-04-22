package P06_Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            String type = scanner.nextLine();
            if (type.equals("Beast!")) {
                break;
            }
            String[] info = scanner.nextLine().split("\\s+");
            String name = info[0];
            int age = Integer.parseInt(info[1]);
            String gender = info[2];
            Animal animal;

            try {
                switch (type) {
                    case "Dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "Cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(name, age);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(name, age);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid input!");
                }
                animals.add(animal);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal.getAnimalType());
            System.out.println(animal.getName() + " " + animal.getAge() + " " + animal.getGender());
            System.out.println(animal.produceSound());
        }
    }
}
