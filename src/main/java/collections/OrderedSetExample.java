package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

/**
 * Requirements:
 * No duplicates
 * Sorted by name
 * Save student object
  */
public class OrderedSetExample {

    private static final Logger logger = LogManager.getLogger(OrderedSetExample.class);

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(Comparator.naturalOrder());

        students.add(new Student("Zoe", 1));
        students.add(new Student("Alan", 1));
        students.add(new Student("Loly", 1));
        students.add(new Student("Amanda", 1));
        students.add(new Student("John", 1));
        students.add(new Student("Beatrice", 1));

        // Elements should be sorted as they're added
        logger.info("Ordered Set:");
        students.forEach(logger::info);

        SortedSet<Student> newSet = students.headSet(new Student("Loly", 1), true);
        logger.info("Ordered sub set:");
        newSet.forEach(logger::info);
    }

    static class Student implements Comparable<Student> {
        private final String name;
        private final Integer id;

        public Student(String name, Integer id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return name.equals(student.name) && id.equals(student.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }

        @Override
        public int compareTo(Student other) {
            return this.name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
