public static int pageCount(int n, int p) {
    // Write your code here
    int mid = n/2;
    int count = 0;
    if(p <= mid){
        int pg = 2;
        for(int i = 1; i <= mid; i++){
            if(i == p){
                break;
            }else if(pg < 2){
                pg++;
            }else{
                pg = 1;
                count++;
            }
        }
        return count;
    }else{
        int pg;
        if(n % 2 == 0){
            pg = 2;
        }else{
            pg = 1;
        }
        for(int i = n; i > mid; i--){
            if(i == p){
                break;
            }else if(pg < 2){
                pg++;
            }else{
                pg = 1;
                count++;
            }
        }
        return count;
    }

    }
