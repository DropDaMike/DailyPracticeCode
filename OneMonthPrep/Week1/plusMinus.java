public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double pos = 0;
        double neg = 0;
        double zeros = 0;
        int size = arr.size();

        for(int i = 0; i < size; i++){
            if(arr.get(i) > 0){
                pos++;
            }else if(arr.get(i) < 0){
                neg++;
            }else{
                zeros++;
            }

        }

        System.out.println(pos/size);
        System.out.println(neg/size);
        System.out.println(zeros/size);

    }