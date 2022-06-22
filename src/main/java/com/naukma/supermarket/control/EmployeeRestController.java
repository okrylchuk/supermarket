//package com.naukma.supermarket.control;
//
//import com.naukma.supermarket.model.Employee;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//@RestController
//@RequestMapping("/employees")
//public class EmployeeRestController {
//    private List<Employee> Employees = Stream.of(
//            new Employee(1L, "Ivan", "Ivanov"),
//            new Employee(2L, "Sergey", "Sergeev"),
//            new Employee(3L, "Petr", "Petrov")
//    ).collect(Collectors.toList());
//
//    @GetMapping
//    public List<Employee> getAll() {
//        return Employees;
//    }
//
//    @GetMapping("/{id}")
//    public Employee getById(@PathVariable Long id) {
//        return Employees.stream().filter(developer -> developer.getId().equals(id))
//                .findFirst()
//                .orElse(null);
//    }
//
//    @PostMapping
//    public Employee create(@RequestBody Employee developer) {
//        this.Employees.add(developer);
//        return developer;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteById(@PathVariable Long id) {
//        this.Employees.removeIf(developer -> developer.getId().equals(id));
//    }
//}
