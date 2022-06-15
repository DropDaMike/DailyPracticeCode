 public static String twoArrays(int k, List<Integer> A, List<Integer> B){
        //We need to sort array A in a sorted fashion and array B in a
        //reverse sorted fashion. After this is done we can add
        //every value in the same index to see if it is >= k
        int[] a = new int[A.size()];
        //convert to arrays
        for(int i = 0; i < A.size(); i++){
            a[i] = A.get(i);
        }

        Collections.sort(B, Collections.reverseOrder());
        int[] b = new int[B.size()];
        for(int i = 0; i < B.size(); i++){
            b[i] = B.get(i);
        }
        java.util.Arrays.sort(a);
        //Now we can go through the same indexes on these arrays and
        //see if they are >= k.
        for(int i = 0; i < a.length; i++){
            if(a[i] + b[i] < k){
                return "NO";
            }
        }
        return "YES";
}