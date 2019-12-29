/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;
import java.lang.Comparable;
/**
 *
 * @author Admin
 */
public class Employee implements Comparable {
    private String code;
    private String name;
    private int salary;

    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    
    
    public int compareTo(Object emp){
        return this.getCode().compareTo(((Employee)emp).getCode());
    }

    void print() {
        System.out.println("Employee{"+" code= "+ code + ", name= "+ name +", salary= "+ salary + '}');  
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
