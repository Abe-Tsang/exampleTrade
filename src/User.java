public class User {
    private String userName;
    private Item[] inventory;
    private static int count;
    public User(String _name){
        userName = _name;
        inventory = new Item[2];
        count = 0;
    }
    public String getName(){
        return userName;
    }
    public Item[] getInventory(){ return inventory; }
    public void postItem(String name, int price, int quantity){
        Item i = new Item(name, price, quantity);
        inventory[count] = i;
        count++;
    }
    public void buyItem(String name, int quantity){
        //System.out.println(inventory[1].getName()); This doesn't work
        /*
        for(int i = 0; i < 2; i++){
            if(name.equals(inventory[i].getName())){
                if(quantity > inventory[i].getQuantity()){
                    inventory[i].setQuantity(inventory[i].getQuantity() - quantity);
                }
                else{
                    System.out.println("No enough quantity!");
                }
            }
        }
        */
    }
    public String inventoryToString(){
        //System.out.println(inventory[1].getName()); But this does
        String inventoryString = "";
        for(int i = 0; i < 2; i++){
            inventoryString += inventory[i].getName() + " " + inventory[i].getPrice() + " " + inventory[i].getQuantity() + "\n";
        }
        return userName + ": " + "\n" + inventoryString;
    }
}
