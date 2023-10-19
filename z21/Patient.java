public class Patient {
    private String name;
    private String illness;
    private String treatment;

    public Patient(String name, String illness, String treatment) {
        this.name = name;
        this.illness = illness;
        this.treatment = treatment;
    }

/*    @Override
    public String toString() {
        return "Patient{}";
    }*/

    public String name() {
        return name;
    }

    public String illness() {
        return illness;
    }

    public String treatment() {
        return treatment;
    }
}
