import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoustamArrayList {
    public static void main(String[] args) {
        Student student=new Student(1,"Alok","lucknow",27);
        Student student1=new Student(2,"amit","kanpur",25);
        List<Student> studentList=new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        Book book=new Book("MyBook");
        Book book1=new Book("MyBook1");
        List<Book> bookList=new ArrayList<>();
        bookList.add(book);

        Map<List<Book>,List<Student>> map=new HashMap<>();
        bookList.add(book1);
       map.put(bookList,studentList);
        System.out.println(map);
        for(Map.Entry newmap:map.entrySet()){
            System.out.println(book.bookName+" "+newmap.getValue());
        }
    }
}
class Student{
    int rollNo;
    String name;
    String address;
    int age;

    public Student(int rollNo, String name, String address, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
class Book{
    String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}