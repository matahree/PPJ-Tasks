public class ISBN {
    //checks if provided character is an int between 0 and 9
    public static boolean isBetween(char n){
        String test = "";
        String provided = String.valueOf(n);
        for(int i = 0; i<10; i++){
            test = String.valueOf(i);
            if(provided.equals(test)) return true;
        }
        return false;
    }
    //checks if there are any characters other than [0,9], X, -
    public static String isValidCharacter(String a){
        boolean check = false;
        String offendingCharacter = "";
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) == 'X') check = true;
            else if(a.charAt(i) == '-') check = true;
            else if(isBetween(a.charAt(i))) check = true;
            else{
                offendingCharacter = String.valueOf(a.charAt(i));
                break;
            }
        }
        return offendingCharacter;
    }
    //checks the number of digits in the ISBN
    public static int countNumbers(String a){
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if(isBetween(a.charAt(i)) || a.charAt(i) =='X') count++;
        }
        return count;
    }
    //checks if the calculation of subsequent numbers is a multiple of 11
    public static String correctValue(String a){
        int[] arr = new int[10];
        String result = "";
        int indexNumbers = 0;
        //array with all digits of ISBN:
        for(int i = 0; i<a.length(); i++){
            if(isBetween(a.charAt(i))){
                arr[indexNumbers] = Integer.parseInt(String.valueOf(a.charAt(i)));
                indexNumbers++;
            }
            else if(a.charAt(i) == 'X'){
                arr[indexNumbers] = 10;
                indexNumbers++;
            }
        }
        //initial calculation without the last digit
        int calc = 0;
        for(int i = 10, j=0; i>1; i--, j++){
            calc += (i * arr[j]);
        }
        //with the last digit and checking if it is correct
        int total = calc + arr[9];
        int correct = 0;
        if(total % 11 != 0){
            for(int i = 10; i>=0; i--){
                if((calc + i) % 11 == 0){
                    correct = i;
                    break;
                }
            }
            if(correct == 10) result = "X";
            else result = String.valueOf(correct);
        }
        else{
            result = "";
        }
        return result;
    }
    //checks all the conditions
    static void checkISBN(String isbn) {
        for(int i = 0; i < isbn.length(); i++){
            if(!isValidCharacter(isbn).equals("")){
                System.out.println(isbn + ": ERROR. Invalid character " + isValidCharacter(isbn));
                break;
            }
            else if(countNumbers(isbn) < 10){
                System.out.println(isbn + ": ERROR. Not enough digits.");
                break;
            }
            else if(countNumbers(isbn) > 10){
                System.out.println(isbn + ": ERROR. Too many digits.");
                break;
            }
            else if(!correctValue(isbn).equals("")){
                System.out.println(isbn + ": ERROR. Last digit should be " + correctValue(isbn));
                break;
            }
            else{
                System.out.println(isbn + ": OK");
                break;
            }
        }
    }
    public static void main(String[] args) {
        String[] isbns = {
                "960-425-059-0", "80-902744-1-6", "85-359-0277-5",
                "0-8044-2958-X", "0-943396-04-2", "0-9752298-0-5",
                "9971-5-02l0-0", "93-8654--21-4", "99921-588-107",
        };
        for (int i = 0; i < isbns.length; ++i){
            checkISBN(isbns[i]);
        }
    }
}