public class Coupons {
    public static void main(String[] args) {
        final int N = 90;
        final int NUM_OF_SIMULATIONS = 100000;
        int totalBoxes = 0;
        for (int i = 0; i < NUM_OF_SIMULATIONS; ++i) {
            totalBoxes += boxesBought(N);
        }
        double aver = totalBoxes/(double)NUM_OF_SIMULATIONS;
        System.out.println("***** N = " + N);
        System.out.println("Average : " + aver);
        System.out.println("Expected: " + N*harmo(N));
    }
    static int boxesBought(int coupons) {
        int boxes = 0;
        boolean allCoupons = false;
        double probability = 1D/coupons;
        //create an array with coupon size; assign max values
        double[] arr = new double[coupons];
        for(int i = 0; i<coupons; i++){
            arr[i] = probability * (i+1);
        }
        boolean[] check = new boolean[coupons];

        while(allCoupons == false) {
            double typeOfCoupon = Math.random();
            for(int i = 0; i<coupons; i++){
                if(i == 0){
                    if(typeOfCoupon <= arr[0]){
                        check[0] = true;
                    }
                }
                else if(i == coupons-1){
                    if(typeOfCoupon > arr[coupons-2]){
                        check[coupons-1] = true;
                    }
                }
                else if(typeOfCoupon <= arr[i] && typeOfCoupon > arr[i-1]){
                    check[i] = true;
                }

            }
            //check if all elements are true
            for(boolean v : check){
                if(!v){
                    allCoupons = false;
                    break;
                }
                else{
                    allCoupons = true;
                }
            }
            boxes++;
        }

        return boxes;
    }
    static double harmo(int n) {
        //sum of 1/i, 1/i+1, 1/n
        double res = 0;
        for(int i = 1; i<=n; i++){
            res += 1D/i;
        }
        return res;
    }
}