package com.DBattempt;

import com.google.common.collect.Lists;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Repository
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findALL() {
        return Lists.newArrayList(employeeRepository.findAll()); //Lists ????
    }

    @Override
    public Employee findById(Long Id) {
//        return employeeRepository.findOne(Id);
//        return employeeRepository.findById(Id);
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Page<Employee> findAllByPage(Pageable pageable) {
//        ???↓ + Pageable
        return employeeRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }
}
