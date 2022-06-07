public static void miniMaxSum(List<Integer> arr){
        long min = 0;
        long max = 0;
        int size = arr.size();

        int[] sorted = new int[size];

        for(int i = 0; i < size; i++){
            sorted[i] = arr.get(i);
        }

        java.util.Arrays.sort(sorted);
        for(int i = 0; i < size; i++){
            if(i == 0){
                min += sorted[i];
            }else if(i == size - 1){
                max += sorted[i];
            }else{
                min += sorted[i];
                max += sorted[i];
            }
        }

        System.out.println(min + " " + max);
    }