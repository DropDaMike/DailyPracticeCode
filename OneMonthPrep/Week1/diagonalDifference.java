public static int diagonalDifference(List<List<Integer>> arr){
        int lrDiagonal = 0;
        int rlDiagonal = 0;
        int lrPointer = 0;
        int rlPointer = arr.size() - 1;
        for(List<Integer> a: arr){
            lrDiagonal += a.get(lrPointer);
            lrPointer++;
            rlDiagonal += a.get(rlPointer);
            rlPointer--;
        }

        return Math.abs(lrDiagonal - rlDiagonal);
}