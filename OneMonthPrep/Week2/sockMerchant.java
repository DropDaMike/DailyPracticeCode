public static int sockMerchant(int n, List<Integer> ar){
        //Make a hashmap containing the num of socks
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(ar.get(i))){
                map.put(ar.get(i), map.get(ar.get(i)) + 1);
            }else{
                map.put(ar.get(i), 1);
            }
        }

        //Now let us traverse through the map to see how many pairs of socks we have
        int ans = 0;
        for(Map.Entry mapEntry : map.entrySet()){
            int socks = (int)mapEntry.getValue();
            if(socks > 1){
                while(socks > 1){
                    socks -= 2;
                    ans++;
                }
            }
        }
        return ans;
}