public static int lonelyInteger(List<Integer> a){
        int ans = 0;
        if(a.size() == 1){
            return a.get(0);
        }
        //convert a into an array to sort
        int[] arr = new int[a.size()];
        for(int i = 0; i < a.size(); i++){
            arr[i] = a.get(i);
        }
        java.util.Arrays.sort(arr);
        //check if first array input is unique and check if the last array input is unique

        if(arr[0] != arr[1]){
            return arr[0];
        }else if(arr[arr.length - 1] != arr[arr.length - 2]){
            return arr[arr.length - 1];
        }else{
            for(int i = 1; i < arr.length - 1; i++){
                if(arr[i] != arr[i - 1] && arr[i] != arr[i + 1]){
                    ans = arr[i];
                    break;
                }
            }
        }
        return ans;
    }