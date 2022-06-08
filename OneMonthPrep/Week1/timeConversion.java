public static String timeConversion(String s){
        StringBuilder ans = new StringBuilder();
        String[] arr = s.split(":");
        String hour = arr[0];
        String min = arr[1];
        String temp = arr[2];
        //get rid of the PM or AM at the end of temp to get seconds
        String sec = temp.substring(0, temp.length()/2);
        String ampm = temp.substring(temp.length()/2, temp.length());
        int h = Integer.parseInt(hour);

        if(ampm.equals("PM")){
            //add 12 to the hour unless h + 12 is equal to 24 or h equals 12
            if(h == 12){
                ans.append(hour + ":");
            }else if(h + 12 == 24){
                ans.append("00:");
            }else{
                h += 12;
                ans.append(Integer.toString(h) + ":");
            }
            //append min and sec
            ans.append(min + ":" + sec);
        }else{
            //check if h == 12 and add a 0 to the ans if h < 10
            if(h == 12){
                ans.append("00:");
            }else if(h > 9){
                ans.append(hour + ":");
            }else{
                ans.append("0" + Integer.toString(h) + ":");
            }
            //append min and sec
            ans.append(min + ":" + sec);
        }

        return ans.toString();
    }