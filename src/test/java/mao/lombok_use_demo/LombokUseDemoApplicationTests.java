package mao.lombok_use_demo;

import lombok.extern.slf4j.Slf4j;
import mao.lombok_use_demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class LombokUseDemoApplicationTests
{

    @Test
    void contextLoads()
    {
    }

    /**
     * test1 ，测试set方法和toString方法
     */
    @Test
    void test1()
    {
        Student student = new Student();
        student.setId(2L);
        student.setName("张三");
        student.setAge(18);
        log.info(student.toString());
    }

    /**
     * test2，测试get方法
     */
    @Test
    void test2()
    {
        Student student = new Student();
        student.setId(2L);
        student.setName("张三");
        student.setAge(18);
        log.info(student.getName());
    }

    /**
     * test3 ，测试equals和hashcode方法
     */
    @Test
    void test3()
    {
        Student student1 = new Student();
        student1.setId(2L);
        student1.setName("张三");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setId(2L);
        student2.setName("张三");
        student2.setAge(19);

        Student student3 = new Student();
        student3.setId(2L);
        student3.setName("张三");
        student3.setAge(18);

        log.info("student1 equals student2:" + student1.equals(student2));
        log.info("student1 equals student3:" + student1.equals(student3));

        log.info("student1 hashcode:" + student1.hashCode());
        log.info("student2 hashcode:" + student2.hashCode());
        log.info("student3 hashcode:" + student3.hashCode());

    }

    /**
     * test4，测试所有参数的构造方法
     */
    @Test
    void test4()
    {
        Student student = new Student(2009L, "李四", "女", 18, null, "18888888888", new Date());
        log.info(student.toString());
    }


    /**
     * test5
     */
    @Test
    void test5()
    {
        Student student = Student.builder().id(12L).name("张三").phone("1666666666").build();
        log.info(student.toString());
    }
}
