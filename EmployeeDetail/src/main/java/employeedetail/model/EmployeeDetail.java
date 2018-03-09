package employeedetail.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import employeedetail.view.EmployeeDetailView;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames="empId")})
public class EmployeeDetail {
    @Id @GeneratedValue
    private Long id;    
    private String name;
    private String empId;
    private String role;
    private BigDecimal salary;
    private String roleDescription;

    public EmployeeDetail() {}
    public EmployeeDetail(EmployeeDetailView employeeDetailView) {
        id = employeeDetailView.getId();
        name = employeeDetailView.getName();
        role = employeeDetailView.getRole();
        salary = employeeDetailView.getSalary();
        roleDescription = employeeDetailView.getRoleDescription();
        empId = employeeDetailView.getEmpId();
    }
    
    public EmployeeDetailView asEmployeeDetailView() {
        EmployeeDetailView employeeDetailView = new EmployeeDetailView();
        employeeDetailView.setId(id);
        employeeDetailView.setName(name);
        employeeDetailView.setEmpId(empId);
        employeeDetailView.setRole(role);
        employeeDetailView.setSalary(salary);
        employeeDetailView.setRoleDescription(roleDescription);
        return employeeDetailView;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public String getRoleDescription() {
        return roleDescription;
    }
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

}