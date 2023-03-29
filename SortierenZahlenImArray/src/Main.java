
public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{30200, 53, 15, 2100000, 48, 85, 6, 7, 2, 1};

        //System.out.println(array.length);
        //for (int i = 0; i < array.length; i++){
        //    System.out.println(array[i]);
        //}

        //besser:

        for (int i : array) {
            System.out.println(i);
        }

        //array Vergleich, Loop in Loop
        // Position X, mit Position Y im Array vergleichen. Im Loop, bis fertig?

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Nach Sortieren: ");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
