public class Driver {
    public static void main(String[] args){
        User buyer = new User("Abe");
        User seller = new User("Tsang");
        seller.postItem("Item1", 50, 2);
        seller.postItem("Item2", 100, 3);
        buyer.buyItem("Item2", 1);
        System.out.println(seller.inventoryToString());
    }
}
