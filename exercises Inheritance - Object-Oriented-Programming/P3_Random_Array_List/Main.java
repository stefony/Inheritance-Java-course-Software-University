package P3_Random_Array_List;

public class Main {
    public static void main(String[] args) {

        RandomArrayList <Integer> randomArrayList= new RandomArrayList<>();

        randomArrayList.add(13);
        randomArrayList.add(42);
        randomArrayList.add(59);
        randomArrayList.add(79);
        randomArrayList.add(96);

        System.out.println(randomArrayList.getRandomElement());
    }
}
