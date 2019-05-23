package com.DBattempt;

import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;


public interface EmployeeService {
    List <Employee> findALL();
    Employee findById(Long Id);
    Employee save(Employee employee);
    Page<Employee> findAllByPage(Pageable pageable);
}
