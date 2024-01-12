package Filters;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filters {

    public static void main(String[] args){

        Student s1 = new Student("Cris", 7.8);
        Student s2 = new Student("Jacob", 3.2);
        Student s3 = new Student("Martin", 5.9);
        Student s4 = new Student("Jackon", 4.7);
        Student s5 = new Student("Ana", 8.5);
        Student s6 = new Student("Lisa", 9.2);

        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6);
        Predicate<Student> aprove = a -> a.classification >=6;
        Predicate<Student> disapproved = a -> a.classification <6;

        Function<Student, String> announceAprove =
                a -> "Congratulations " + a.name + "! You were approved!";

        Function<Student, String> announceDisapproved =
                a ->  a.name + " You were disapproved! Better luck next time ;)";

        students.stream()
                .filter(aprove)
                .map(announceAprove)
                .forEach(System.out::println);

        students.stream()
                .filter(disapproved)
                .map(announceDisapproved)
                .forEach(System.out::println);
    }

}
