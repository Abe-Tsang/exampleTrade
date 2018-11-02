public class Item {
    private String name;
    private int price;
    private int quantity;
    public Item(String _name, int _price, int _quantity){
        name = _name;
        price = _price;
        quantity = _quantity;
    }
    public void setQuantity(int _quantity){ quantity = _quantity; }
    public String getName(){ return name; }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
