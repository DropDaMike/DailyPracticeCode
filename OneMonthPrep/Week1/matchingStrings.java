 public static List<Integer> matchingStrings(List<String> strings, List<String> queries){
        List<Integer> ans = new ArrayList<Integer>();
        //make a hashmap that keeps track of how many times a string is repeated.
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < strings.size(); i++){
            //check if map contains string and add one if it does
            if(map.containsKey(strings.get(i))){
                map.put(strings.get(i), map.get(strings.get(i)) + 1);
            }else{
                map.put(strings.get(i), 1);
            }
        }

        //Go through queries to see if it has any values in the map
        for (int i = 0; i < queries.size(); i++){
            if(map.containsKey(queries.get(i))){
                ans.add(map.get(queries.get(i)));
            }else{
                ans.add(0);
            }
        }

        return ans;
    }