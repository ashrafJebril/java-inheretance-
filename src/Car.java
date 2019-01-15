public class Car extends Vehicle {

  private int price ;
    private int Id;


    public int price(int price){
     return  price + 10;
    }

    public void setType(String type) {
        super.type = type;
    }

    public void getType() {
       System.out.println(type);
    }
}
