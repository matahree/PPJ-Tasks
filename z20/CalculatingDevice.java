public class CalculatingDevice {
    private String name;
    public CalculatingDevice(String name) {
        this.name = name;
    }
    public String calculate(double x, double y){
        double addition = x+y;
        return name + ": " + addition;
    }
    public static void printRes(CalculatingDevice[] arr, double x, double y){
        for(int i = 0; i < arr.length; i++){
            String result = arr[i].calculate(x, y);
            System.out.println(result);
        }
    }
}