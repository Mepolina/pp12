public class SStudent {

    private String name = "nazwa domyślna.";

    public SStudent(){}

    public SStudent(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
