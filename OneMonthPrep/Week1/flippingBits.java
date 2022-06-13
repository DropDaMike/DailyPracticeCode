public static long flippingBits(long n){
        long base = 2;
        long pow = 32;
        long ans = 1;
        long count = 1;
        while(count <= pow){
            ans *= base;
            count++;
        }
        /*To flip the bits in a 32 bit fashion with a long you must first
        get what 2^32 is. After this is done we can flip the bits by adding 2 ^ 32
        to the compliment of n.
         */
        return ans + ~n;
}