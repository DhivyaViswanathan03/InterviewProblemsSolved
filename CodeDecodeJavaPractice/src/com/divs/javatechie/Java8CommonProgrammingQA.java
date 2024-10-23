package com.divs.javatechie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CommonProgrammingQA {
	
	public static void main(String args[]) {
        List<Student> studentList = Stream.of(
                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());
        
        //get student whose rank 50 to 100
        studentList.stream().filter(s->s.getRank()>50 && s.getRank()<100).forEach(System.out::println);
         System.out.println();
        //find students stays in karnataka and sort them by their names
        studentList.stream().filter(s->s.getCity().equalsIgnoreCase("Karnataka"))
        .sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println();
        // find all department names
        studentList.stream().map(s->s.getDept()).distinct().forEach(System.out::println);
        System.out.println();
        System.out.println(studentList.stream().map(Student::getDept)
        		.collect(Collectors.toSet()));
        System.out.println();
        //find all contact numbers
        studentList.stream().flatMap(s->s.getContacts().stream()).distinct().forEach(System.out::println);
        System.out.println();
       //group the student by department names
        Map<String,List<Student>> result=studentList.stream().collect(Collectors.groupingBy(Student::getDept));
        System.out.println(result);
        System.out.println();
        Map<String,List<String>> result1=studentList.stream().collect(Collectors.groupingBy(Student::getDept,
        		Collectors.mapping(Student::getFirstName, Collectors.toList())));
        System.out.println(result1);
        System.out.println();
        Map<String,Long> result2=studentList.stream()
        		.collect(Collectors.groupingBy(Student::getDept,Collectors.counting()));
        System.out.println(result2);
        System.out.println();
       System.out.println(result2.entrySet().stream()
        .max(Map.Entry.comparingByValue()).map(s->s.getKey()).get());
       System.out.println();
       //find average age of male and female students
       System.out.println(studentList.stream().collect(Collectors
    		   .groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge))));
       System.out.println();
        //Find highest rank in each department
       System.out.println(studentList.stream()
       .collect(Collectors.groupingBy(Student::getDept
    		   ,Collectors.minBy(Comparator.comparing(Student::getRank)))));
       System.out.println();
       //find student who has second rank
       System.out.println(studentList.stream()
    		   .sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get());
       
	}
}
