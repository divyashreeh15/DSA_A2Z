class MaxContainer {

    public static void main(String args[])
    {
        int[] h = {1,8,6,2,5,4,8,3,7};
        int l=0;
        int r = h.length-1;
        int area = 0;
        int max = 0;
        while(l<r)
        {
            area = Math.min(h[r],h[l]) * r-l;
            max = Math.max(area,max);
            l++;
            r--;
        }
        System.out.print(max);
    }
}