public class Vehicle {
    int horsePower ;
    String type;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color = "red";

    public void print(int horsePower){
        System.out.println(horsePower);
    }
    public void setType(String type){
     this.type=type;
    }

}
