import java.util.ArrayList;

public class TwoMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        int[] list2 = {1,2,3,4,3};

//        for (int i = 0; i < list.size(); i++) {
//            int k = (int)(Math.random() * 10);
//            list.add(9);
//            list2[i] = k;
//            if (!hasDuplicates(list2)) {
//                i -= 1;
//            }
//            else
//                continue;
//        }
        System.out.println(list);
        if (hasDuplicates(list2)) {
            System.out.println("Number of odd numbers is " + countOdd(list));
        }
        else
            System.out.println("There are duplicates");
    }

    public static int countOdd(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 2) == 1) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasDuplicates(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            for (int j = k + 1; j < arr.length; j++) {
                if (arr[k] == arr[j])
                    return false;
            }
        }
        return true;
    }
}
