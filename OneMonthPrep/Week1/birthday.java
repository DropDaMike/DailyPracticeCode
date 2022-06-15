public static int birthday(List<Integer> s, int d, int m){
        int ans = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        int n = s.size();
        while(r < n){
            sum += s.get(r);
            if(sum == d && (r - l) + 1 == m){
                ans++;
            }else if(sum > d){
                while(sum > d){
                    if(l == r){
                        l++;
                        r++;
                        sum = s.get(l);
                        break;
                    }
                    sum -= s.get(l);
                    l++;
                }

                if(sum == d && (r - l) + 1 == m){
                    ans++;
                }
            }
            r++;
        }
        return ans;
}