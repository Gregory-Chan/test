class Average {
    int getAverage(int[] a) {
        int total = 0;
        int count = 0;
        if(a.length == 0) {
            return -1;
        }
        for(int i = 0; i < a.length; i++) {
            if(a[i] > 0) {
                total += a[i];
                count ++;
            }
        }
        return total/count;
    }
}
