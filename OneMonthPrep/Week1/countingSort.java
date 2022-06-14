public static List<Integer> countingSort(List<Integer> arr){
        int[] nums = new int[100];
        //Make a hashmap that counts a variables occurence
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: arr){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }else{
                map.put(x, 1);
            }
        }
        /*Now let us populate the array we created earlier with
        the hashmap values depending on what the pointer value
        equals to in arr*/
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(i)){
                nums[i] = map.get(i);
            }
        }

        //Now let us convert nums to a list
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            ans.add(i, nums[i]);
        }

        return ans;
}