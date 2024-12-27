import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import Entity.Book;
import Mapper.BookDao;

import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // 从XML配置文件中构建SqlSessionFactory
        String resource = "mybatisconfig.xml";  // mybatis配置文件的路径
        SqlSession sqlSession;
        try {
            // 加载 MyBatis 配置文件
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();

            // 获取 BookDao 的映射
            BookDao mapper = sqlSession.getMapper(BookDao.class);

            // 使用 getList() 方法查询图书
            List<Book> books = mapper.getList("java");
            for (Book book : books) {
                System.out.println(book.getBookname() + " " + book.getPrice()+ " " + book.getBookisbn()
                + " " +book.getBid()+" " +book.getImgurl()+ " " + book.getPublisher());
            }

            // 使用 insertBook() 方法插入新的图书
            Book newBook = new Book();
            newBook.setBookname("hh");
            newBook.setBookisbn("12345");
            newBook.setPublisher("hh");
            newBook.setPrice(29.99f);
            newBook.setImgurl("hh");

            mapper.insertBook(newBook);
            sqlSession.commit();  // 提交事务

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
             // 关闭SqlSession
        }

        System.out.println("Hello World!");
    }
}
