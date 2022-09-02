public class Main {

    public static void main(String[] args) {
        int[] array = generateRandomArray();

        int sun = 0;
        for (int spending : array) {
            sun += spending;

        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", sun);

        int min = array[0];
        int max = array[0];
        for (int spending : array) {
            if (min > spending) {
                min = spending;
            } else if (max < spending) {
                max = spending;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей.\n" +
                "Максимальная сумма трат за день составила %s рублей.\n", min, max);

        double averegeDouble = (double) sun / array.length;
        String avarege = String.format("%.2f", averegeDouble);
        System.out.println("Средняя сумма трат за месяц составила " + avarege + " рублей.");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        for (int i = reverseFullName.length - 1; i >= 0; i--) {
//            System.out.print(reverseFullName[i]);
//        }
        char symbl;
        for (int i = 0; i < reverseFullName.length/2; i++) {
            symbl = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = symbl;

        }
        System.out.println(reverseFullName);


    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

}