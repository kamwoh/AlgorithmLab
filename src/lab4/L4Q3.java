package lab4;

public class L4Q3 {
    public static void main(String[] args){
        int[] values = {100, 200, 10, 20, 30, 1, 2, 3};
        shuffle(values);

        for (int value : values) {
            System.out.println(value);
        }
    }
    static void shuffle(int[] array){
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            int j = i + (int) (Math.random() * (n - i));
            int randomElement = array[j];
            array[j] = array[i];
            array[i] = randomElement;
        }
    }
}
