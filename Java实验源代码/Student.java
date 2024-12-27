import java.sql.*;
import java.util.Date;
import java.util.ArrayList;

public class Student {
    private Integer sid; // 学生ID
    private String name; // 学生姓名
    private Integer age; // 学生年龄
    private Date birthday; // 学生生日

    // 构造方法
    public Student(Integer sid, String name, Integer age, Date birthday) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    // Getter 和 Setter 方法
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
class JDBCUtils {
    public static void main(String[] args) throws Exception {
        // 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 连接连接 --DriverManger类的getConnection()方法获取连接对象
        DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1405269390a");
        System.out.println("连接成功");
    }
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER = "root"; //
    private static final String PASSWORD = "1405269390a";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void close(Connection con, Statement stat, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (stat != null) stat.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection con, Statement stat) {
        close(con, stat, null);
    }
}


interface StudentDao {
    ArrayList<Student> findAll();
    Student findById(Integer id);
    int insert(Student stu);
    int update(Student stu);
    int delete(Integer id);
}
class StudentDaoImpl implements StudentDao {

    @Override
    public ArrayList<Student> findAll() {
        ArrayList<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection con = JDBCUtils.getConnection();
             Statement stat = con.createStatement();
             ResultSet rs = stat.executeQuery(sql)) {

            while (rs.next()) {
                Integer sid = rs.getInt("sid");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                students.add(new Student(sid, name, age, birthday));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public Student findById(Integer id) {
        Student student = null;
        String sql = "SELECT * FROM students WHERE sid = ?";

        try (Connection con = JDBCUtils.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Integer sid = rs.getInt("sid");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                student = new Student(sid, name, age, birthday);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public int insert(Student stu) {
        String sql = "INSERT INTO students (name, age, birthday) VALUES (?, ?, ?)";
        try (Connection con = JDBCUtils.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, stu.getName());
            pst.setInt(2, stu.getAge());
            pst.setDate(3, new java.sql.Date(stu.getBirthday().getTime()));
            return pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Student stu) {
        String sql = "UPDATE students SET name = ?, age = ?, birthday = ? WHERE sid = ?";
        try (Connection con = JDBCUtils.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, stu.getName());
            pst.setInt(2, stu.getAge());
            pst.setDate(3, new java.sql.Date(stu.getBirthday().getTime()));
            pst.setInt(4, stu.getSid());
            return pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(Integer id) {
        String sql = "DELETE FROM students WHERE sid = ?";
        try (Connection con = JDBCUtils.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            return pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}


interface StudentService {
    ArrayList<Student> findAll();
    Student findById(Integer id);
    String insert(Student stu);
    String update(Student stu);
    String delete(Integer id);
}
class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl() {
        this.studentDao = new StudentDaoImpl();
    }

    @Override
    public ArrayList<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return studentDao.findById(id);
    }

    @Override
    public String insert(Student stu) {
        int result = studentDao.insert(stu);
        return result > 0 ? "插入成功" : "插入失败";
    }

    @Override
    public String update(Student stu) {
        int result = studentDao.update(stu);
        return result > 0 ? "更新成功" : "更新失败";
    }

    @Override
    public String delete(Integer id) {
        int result = studentDao.delete(id);
        return result > 0 ? "删除成功" : "删除失败";
    }
}

 class StudentController {
    private StudentService studentService;

    public StudentController() {
        this.studentService = new StudentServiceImpl();
    }

    public void findAll() {
        ArrayList<Student> students = studentService.findAll();
        for (Student student : students) {
            System.out.println(student.getSid() + " " + student.getName() + " " + student.getAge() + " " + student.getBirthday());
        }
    }

    public void findById(Integer id) {
        Student student = studentService.findById(id);
        if (student != null) {
            System.out.println(student.getSid() + " " + student.getName() + " " + student.getAge() + " " + student.getBirthday());
        } else {
            System.out.println("未找到学生信息");
        }
    }

    public void insert(Student stu) {
        String message = studentService.insert(stu);
        System.out.println(message);
    }

    public void update(Student stu) {
        String message = studentService.update(stu);
        System.out.println(message);
    }

    public void delete(Integer id) {
        String message = studentService.delete(id);
        System.out.println(message);
    }
}

 class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();

        // 插入示例
        Student newStudent = new Student(null, "张三", 20, new Date());
        controller.insert(newStudent);

        // 查询所有学生
        controller.findAll();

        // 根据ID查询学生
        controller.findById(1); // 修改为实际的ID

        // 更新示例
        Student updateStudent = new Student(1, "李四", 21, new Date()); // 修改为实际的ID
        controller.update(updateStudent);

        // 删除示例
        controller.delete(1); // 修改为实际的ID

        // 查询所有学生
        controller.findAll();
    }
}







