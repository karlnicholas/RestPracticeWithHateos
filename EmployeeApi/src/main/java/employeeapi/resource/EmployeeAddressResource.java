package employeeapi.resource;

import org.springframework.hateoas.ResourceSupport;

import employeeaddress.item.EmployeeAddressItem;

public class EmployeeAddressResource extends ResourceSupport {
    private Integer empId;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String state;
    private String country;
    
    public void fromEmployeeAddressItem(EmployeeAddressItem item) {
        this.empId = item.getEmpId();
        this.address1 = item.getAddress1();
        this.address2 = item.getAddress2();
        this.address3 = item.getAddress3();
        this.address4 = item.getAddress4();
        this.state = item.getState();
        this.country = item.getCountry();
    }

    public Integer getEmpId() {
        return empId;
    }
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public String getAddress1() {
        return address1;
    }
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getAddress2() {
        return address2;
    }
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getAddress3() {
        return address3;
    }
    public void setAddress3(String address3) {
        this.address3 = address3;
    }
    public String getAddress4() {
        return address4;
    }
    public void setAddress4(String address4) {
        this.address4 = address4;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

}
