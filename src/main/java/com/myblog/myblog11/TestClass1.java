package com.myblog.myblog11;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestClass1 {

    public static  void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("mike", 30, "chennai"),
                new Employee("stallin", 34, "chennai"),
                new Employee("adam", 32, "bengaluru"),
                new Employee("sam", 36, "pune")

        );

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getCity()));

//        for(Employee employee: employees){
//            List<Employee> e = collect.get(employee.getAge());
//
//            for(Employee x : e){
//                System.out.println(x.getName());
//                System.out.println(x.getAge());
//                System.out.println(x.getCity());
//
//            }
          for (Map.Entry<String, List<Employee>> entry : collect.entrySet()){
              String city = entry.getKey();
              List<Employee> employeesWithAge = entry.getValue();
              System.out.println("City:"+city+"---");
              for(Employee e: employeesWithAge){
                  System.out.println(e.getCity());
                  System.out.println(e.getName());
              }


        }



    }

}