package Entity;

public class Book {
    private int bid;           // 图书ID
    private String bookname;   // 图书名称
    private String bookisbn;  // 图书ISBN
    private String publisher;  // 出版社
    private float price;       // 价格
    private String imgurl;     // 图片URL

    // Getter 和 Setter 方法
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookisbn() {
        return bookisbn;
    }

    public void setBookisbn(String booksisbn) {
        this.bookisbn = booksisbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
