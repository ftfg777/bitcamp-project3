package bitcamp.project3.vo;

public class BookInfo {
  private String bookName;
  private int stock;
  private int price;

  public BookInfo(String bookName, int stock, int price) {
    this.bookName = bookName;
    this.stock = stock;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return bookName + ", " + stock + ", " + price;
  }

  public String toStock() {
    return String.valueOf(stock);
  }

}
