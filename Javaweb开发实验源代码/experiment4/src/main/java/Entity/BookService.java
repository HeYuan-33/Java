package Entity;

import Mapper.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    // 根据图书名称模糊查询
    public List<Book> getBooks(String bookname) {
        return bookDao.getList(bookname);
    }

    // 插入新图书
    public boolean addBook(Book book) {
        try {
            bookDao.insertBook(book);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
