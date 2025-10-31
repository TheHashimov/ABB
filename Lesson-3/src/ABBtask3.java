public class ABBtask3 {
    public static void main(String[] args) {


////        TASK-1
//                int[] numbers = {4, 7, -2, 15, 0, 99, -100};
//
//                int max = numbers[0];
//                int min = numbers[0];
//
//                for (int i = 1; i < numbers.length; i++) {
//                    if (numbers[i] > max) {
//                        max = numbers[i];
//                    }
//                    if (numbers[i] < min) {
//                        min = numbers[i];
//                    }
//                }
//
//                System.out.println("Ən böyük ədəd: " + max);
//                System.out.println("Ən kiçik ədəd: " + min);


/// TASK-2

//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int mainSum = 0;
//        int secondarySum = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {
//                    mainSum += matrix[i][j];
//                }
//                if (i + j == matrix.length - 1) {
//                    secondarySum += matrix[i][j];
//                }
//            }
//        }
//
//        System.out.println("Əsas diaqonal cəmi: " + mainSum);
//        System.out.println("Köməkçi diaqonal cəmi: " + secondarySum);

        /// TASK-3

//        int[][][] cube = {
//        {{1, 2}, {3, 4}},
//        {{5, 6}, {7, 8}}
//        };
//
//        System.out.print("6-dan böyük ədədlər: ");
//
//        for (int i = 0; i < cube.length; i++) {
//            for (int j = 0; j < cube[i].length; j++) {
//                for (int k = 0; k < cube[i][j].length; k++) {
//                    if (cube[i][j][k] > 6) {
//                        System.out.print(cube[i][j][k] + " ");
//                    }
//                }
//            }
//        }
//
///  TASK-4
//        int[] arr = {10, 5, 8, 3, 1};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.print("Tərsinə sort edilmiş array: ");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }


/// TASK-5
//
//        String input = "Pekka";
//        String reversed = "";
//
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversed += input.charAt(i);
//        }
//
//        System.out.println("Tərsinə çevrilmiş string: " + reversed);
//
/// TASK-6
//
//        String word = "araz";
//        String reversed = "";
//
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversed += word.charAt(i);
//        }
//
//        if (word.equals(reversed)) {
//            System.out.println(word + " palindrome-dur.");
//        } else {
//            System.out.println(word + " palindrome deyil.");
//        }

/// TASK-7

        String sentence = "Chetindir ama duzelecek";
        sentence = sentence.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ch) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(ch + " - " + count);
            }
        }
    }
}