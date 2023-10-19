public class Problem2{
    public static void main(String[] args){
        double firstRoll = 0;
        double lotsOfRolls = 0;
        for(int i = 1; i<=1_000_000; i++){
            int numberOfRolls = roll();
            if(numberOfRolls == 1) firstRoll++;
            else if(numberOfRolls >= 90) lotsOfRolls++;
        }
        double percentageFirst = firstRoll / 1_000_0D;
        double percentageLots = lotsOfRolls / 1_000_0D;
        System.out.println("In first roll: " + percentageFirst + "%");
        System.out.println("In 90 or more rolls: " + percentageLots + "%");
    }
    public static int roll(){
        int firstThrow, secondThrow;
        int count = 0;
        do{
            firstThrow = 1 + (int)(Math.random() * 6);
            secondThrow = 1 + (int)(Math.random() * 6);
            count++;
        }while((firstThrow + secondThrow) != 12);
        return count;
    }
}