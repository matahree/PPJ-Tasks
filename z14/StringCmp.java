public class StringCmp{

    public static boolean isLess(String a, String b){
        int n =0;
        if(a.length() == b.length()){
            n = a.compareTo(b);
        }
        else{
            n = a.length() > b.length() ? 1 : -1;
        }
        if(n==0) return false;
        return n>0;
    }
    public static String[] sortSel(String[] arr){
        for(int i =0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(!isLess(arr[j], arr[min])) min = j;
            }
            String tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        return arr;
    }
}