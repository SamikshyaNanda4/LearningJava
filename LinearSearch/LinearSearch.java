public class LinearSearch {

    public static void main(String[] args) {
        int[] allnums = {1, 2, 55, 66, 445, 6, 354, 324, 5, 67, 43, 4};
        int target = 5;
        int ans = LinearS(allnums, target);
        int ans2 = LinearS2(allnums, target);
        System.out.println("index is: "+ ans +"th");
        System.out.println("number is: " + ans2);

    }

    //search in the array :return index if the item is found
//    if not found otherwise return -1
    static int LinearS(int[] arr, int target) {
        int i = -1;
        if (arr.length == 0) {
            return i;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return i;
    }

    static int LinearS2(int[] arr, int target) {
        int i = Integer.MAX_VALUE;
        if (arr.length == 0) {
            return i;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return element;
            }
        }
        return i;
    }

}
