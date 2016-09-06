/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;




/**
 *
 * @author kevinjerke
 */
public class HrDepartment {
    // private String Requirements;
        private Employee employee;
     
        // Added in class
        private static int cubeId;
        
      // Added in class
        
//    public void trainNewEmployee(Employee employee){
//        employee.completeEmployeeOrientation("" + cubeId++);
//    }
            
    public void trainNewEmployee(String firstName, String lastname, String ssn){
        Employee e = new Employee();
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        e.doTraining("A101");
        e.completeEmployeeTraining(completeEmployeeTraining);
        employee = e;
        
    }

    public String getEmployeeStatus(){
        return employee.getStatus();
    }
}
//   private void MeetWithHRAboutSalaryAndBenefits(){
//       SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
//        String fmtDate = sdf.format(currentDate);
//        System.out.println("Met with Hr on " + fmtDate);
//        metWithHr = true;
//       System.out.println("Employee Meeting Date With HR has been Set.");
//      
//   }
//   private void MeetDepartmentStaff(){
//        System.out.println("Employees have met with HR Department Staff");
//        
//    }
//   private void ReviewDepartmentPolicies(){
//       System.out.println("Department Policies have been reviewd.");
//   }
//   
//   private void MoveIntoCubical(){
//       System.out.println("Employee Move in Date has been set");
//   }
//    
//    private void GetEmployeeStatus(){
//       System.out.println("Employee Status is Aquired.");
//   }
   
   
   
   
   
   
   
   
  
