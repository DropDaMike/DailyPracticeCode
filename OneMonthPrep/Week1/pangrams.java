public static String pangrams(String s){
        String lc = s.toLowerCase();
        lc.replaceAll(" ", "");
        char st = 'a';
        HashMap<Character, Integer> map = new HashMap<>();
        while(st <= 'z'){
            map.put(st, 0);
            st++;
        }

        for(int i = 0; i < lc.length(); i++){
            map.put(lc.charAt(i), 1);
        }

        st ='a';
        while(st <= 'z'){
            if(map.get(st) == 0){
                return "not pangram";
            }
            st++;
        }
        return "pangram";
}