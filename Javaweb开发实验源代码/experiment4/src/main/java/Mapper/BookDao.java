package Mapper;

import Entity.Book;
import java.util.List;

public interface BookDao {
    // 根据图书名称模糊查询
    List<Book> getList(String bookname);

    // 插入一个 Book 对象
    void insertBook(Book book);
}
