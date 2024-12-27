package Entity;



import Entity.Book;
import Entity.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/books")
    public class BookController {

        @Autowired
        private BookService bookService;

        // 根据书名模糊查询图书
        @GetMapping("/getBooks")
        public List<Book> getBooks(@RequestParam String bookname) {
            return bookService.getBooks(bookname);
        }

        // 添加新的图书
        @PostMapping("/addBook")
        public boolean addBook(@RequestBody Book book) {
            return bookService.addBook(book);
        }
    }


