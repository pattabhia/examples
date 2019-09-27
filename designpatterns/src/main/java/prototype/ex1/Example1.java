package prototype.ex1;

public class Example1 {
    public static void main(String[] args) {

        BookShop shop1 = new BookShop();
        shop1.setShopname("SHOP1");
        shop1.loadData();

        BookShop shop2 = new BookShop();
        shop2.setShopname("SHOP2");
        shop1.getBooks().remove(2);
        shop2.loadData();

        System.out.println("shop1" + shop1);
        System.out.println("shop2" + shop2);


    }
}
