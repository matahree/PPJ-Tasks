public class Problem2{
    public static void main(String[] args) {
        char[][] passwords = {
                "AbcDe93".toCharArray(),
                "A1b:A1b>".toCharArray(),
                "Ab:Acb<".toCharArray(),
                "abc123><".toCharArray(),
                "Zorro@123".toCharArray()
        };
        for(int i = 0; i< passwords.length; i++){
            System.out.println("Checking " + String.valueOf(passwords[i]));
            checkPswd(passwords[i]);
            System.out.println();
        }
    }
    public static void checkPswd(char[] arr){
        //try regex later
/*        char[] numbers = "0123456789".toCharArray();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] upperCaseChars = upper.toCharArray();
        char[] lowerCaseChars = (upper.toLowerCase()).toCharArray();*/
        boolean[] checks = new boolean[6];
        if(arr.length >= 8) checks[0] = true;

        String s = String.valueOf(arr);
        long numUnique = s.chars().distinct().count();
        if(numUnique >= 6) checks[1] = true;

        for(int i = 0; i<arr.length; i++){
/*            for(int j = 0; j<numbers.length; j++) {
                if (arr[i] == numbers[j]) {
                    checks[2] = true;
                    break;
                }
            }*/
            if(Character.isDigit(arr[i])){
                checks[2] = true;
                break;
            }
        }
        for(int i = 0; i<arr.length; i++){
/*            for(int j = 0; j< upperCaseChars.length; j++){
                if(arr[i] == upperCaseChars[j]){
                    checks[3] = true;
                    break;
                }
            }*/
            if(Character.isUpperCase(arr[i])){
                checks[3] = true;
                break;
            }
        }
        for(int i = 0; i<arr.length; i++){
/*            for(int j = 0; j< lowerCaseChars.length; j++){
                if(arr[i] == lowerCaseChars[j]){
                    checks[4] = true;
                    break;
                }
            }*/
            if(Character.isLowerCase(arr[i])){
                checks[4] = true;
                break;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(!Character.isLetterOrDigit(arr[i])){
                checks[5] = true;
                break;
            }
        }
        if(!checks[0]) System.out.println("Too short");
        if(!checks[1]) System.out.println("Too few different characters");
        if(!checks[2]) System.out.println("No digit");
        if(!checks[3]) System.out.println("No uppercase letter");
        if(!checks[4]) System.out.println("No lowercase letter");
        if(!checks[5]) System.out.println("No special character");
        boolean isAll = true;
        for(int i = 0; i<checks.length && isAll; i++){
            isAll &= checks[i];
        }
        if(isAll) System.out.println("OK");
    }
}