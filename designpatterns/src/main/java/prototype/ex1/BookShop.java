package prototype.ex1;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String shopname;
    private List<Book> books = new ArrayList<>();

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for(int i=1;i<=10;i++) {
            Book book  = new Book();
            book.setId(i);
            book.setName("book"+i);
            getBooks().add(book);
        }
    }

    @Override
    protected BookShop clone() {
        BookShop shop = new BookShop();
        for(Book book : this.getBooks()) {
            shop.getBooks().add(book);
        }
        return shop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopname='" + shopname + '\'' +
                ", books=" + books +
                '}';
    }
}
