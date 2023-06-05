/* 3) Priority Queue on Objects */
import java.util.*;
public class LQ3
{
    // we have implemented a special interface
    // this gives a power to class so that classes could copare their objects
    static class Student implements Comparable<Student>
    {
        String name;
        int rank;
        public Student(String name, int rank)
        {
            this.name = name;
            this.rank = rank;
        }
        // when there is a function in parent class and child class is implementing that function, this is called overriding
        @Override
        public int compareTo(Student s2)
        {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args)
    {
        PriorityQueue<Student> PQ = new PriorityQueue<>();
        // when we want in reverse order we use comparator
        // PriorityQueue<Student> PQ = new PriorityQueue<>(Comparator.reverseOrder());
        PQ.add(new Student("A", 4));
        PQ.add(new Student("B", 5));
        PQ.add(new Student("C", 2));
        PQ.add(new Student("D", 12));
        while (!PQ.isEmpty())
        {
            System.out.println(PQ.peek().name + " -> " + PQ.peek().rank);
            PQ.remove();
        }
    }
}
