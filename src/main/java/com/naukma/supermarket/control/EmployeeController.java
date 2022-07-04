package com.naukma.supermarket.control;

import com.naukma.supermarket.model.Employee;
import com.naukma.supermarket.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private long oldKey;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    //@PreAuthorize("hasAuthority('category:read')")
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<Employee> employeeList = employeeRepository.findAll();
        modelAndView.setViewName("/employee/employeeDetails");
        modelAndView.addObject("employeeList", employeeList);
        return modelAndView;
    }

    @GetMapping({"/employeeAddForm"})
    //@PreAuthorize("hasAuthority('category:write')")
    public ModelAndView employeeAddForm() {
        ModelAndView mav = new ModelAndView("/employee/employee-add-form");
        Employee employee = new Employee();
        mav.addObject("employee", employee);
        return mav;
    }

    @PostMapping("/saveEmployee")
    //@PreAuthorize("hasAuthority('category:write')")
    public String saveEmployee(@ModelAttribute Employee employee) {
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        employeeRepository.save(employee);
        return "redirect:/employees";
    }

    @GetMapping("/employeeEditForm")
    //@PreAuthorize("hasAuthority('category:write')")
    public ModelAndView employeeEditForm(@RequestParam Long id) {
        ModelAndView mav = new ModelAndView("/employee/employee-edit-form");
        Employee employee = employeeRepository.findById(id);
        oldKey = id;
        mav.addObject("employee", employee);
        return mav;
    }

    @PostMapping("/editEmployee")
    //@PreAuthorize("hasAuthority('category:write')")
    public String editEmployee(@ModelAttribute Employee employee) {
        employeeRepository.update(employee, oldKey);
        return "redirect:/employees";
    }
}
