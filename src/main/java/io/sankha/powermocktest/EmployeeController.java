package io.sankha.powermocktest;

/**
 * Created by User on 04-06-2017.
 */
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public int getProjectedEmployeeCount()
    {
        final int actualEmployeeCount = employeeService.getEmployeeCount();
        return actualEmployeeCount * 2;
    }

    public void saveEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
    }
}