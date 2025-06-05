package StriversAtoZDSACourse.Arrays;

public class FindTheOnlyNumberThatAppearsOnce {

    public int findTheSingleOccurrence(int[] arr){
        int unique = 0;
        for(int i = 0; i < arr.length; i++){
            unique = unique^arr[i];
        }
        return unique;
    }

    public static void main(String[] args) {
        FindTheOnlyNumberThatAppearsOnce obj = new FindTheOnlyNumberThatAppearsOnce();
        System.out.println(obj.findTheSingleOccurrence(new int[]{1,2,1,2,3,4,4,5,5}));
    }
}
