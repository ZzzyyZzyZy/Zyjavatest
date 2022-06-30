package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zy
 * @date 2022/5/25 07:49
 */
public class CollectionIterator {
  public CollectionIterator() {}

  public static void main(String[] args) {
    //
    ArrayList<Object> list = new ArrayList<>();

    list.add(new Book("sangujo", "luogz", 32));
    list.add(new Book("shuhu", "shina", 34));
    list.add(new Book("xyj", "wcn", 28));
    list.add(new Book("xyj3", "wcn", 21));
    list.add(new Book("xyj4", "wcn", 228));

    Iterator<Object> iterator = list.iterator();

    // 快捷键 itit快速生成迭代器
//    while (iterator.hasNext()) {
//      Object next = iterator.next();
//      System.out.println(next);
//    }

    // 增强for 可以再collection集合使用,也可在数组中使用 快捷键 I 或者 list.for
    for (Object book : list) {
      System.out.println(book);
    }


    System.out.println("排序后");

    sort(list);

    for (Object o : list) {
      //
      System.out.println(o);
    }
  }

  public static void sort(List list) {
    int listsize = list.size();

    for (int i = 0; i < listsize - 1; i++) {
      for (int j = 0; j < listsize - 1 - i; j++) {
        Book book1 = (Book) list.get(j);
        Book book2 = (Book) list.get(j + 1);
        if (book1.getPrice() > book2.getPrice()) {
          list.set(j, book2);
          list.set(j + 1, book1);
        }
      }
    }
  }
}

class Book {
  private String name;
  private String author;
  private double price;

  public Book(String name, String author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{"
        + "name='"
        + name
        + '\''
        + ", author='"
        + author
        + '\''
        + ", price="
        + price
        + '}';
  }
}
