
import java.util.List;
import java.util.ArrayList;

class CombosOfTen {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i < args.length; i++) {
            nums.add(Integer.parseInt(args[i]));
        }

        List<List<Integer>> combos = new ArrayList<>();

        getCombosOfTen(0, nums, new ArrayList<>(), 0, combos);
        
        for(List<Integer> combo: combos) {
            for(int number: combo) {
                System.out.print(number);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }

    private static void getCombosOfTen(int index, List<Integer> nums, List<Integer> curList, int runningSum, List<List<Integer>> combos) {

        if(runningSum == 10) {
            combos.add(curList);
            return;
        }

        for(int i = index; i < nums.size(); i++) {

            List<Integer> newList = new ArrayList<>();
            newList.addAll(curList);
            newList.add(nums.get(i));
            getCombosOfTen(i+1, nums, newList, runningSum+nums.get(i), combos);
        }

    }

}