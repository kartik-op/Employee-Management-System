package com.kartik.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kartik.EmployeeEntity.Employee;
import com.kartik.EmployeeRepo.EmployeeRepo;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepo empRepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "reg";
	}
	
	@RequestMapping("/empsave")
	public String empSave(@RequestParam Integer id,@RequestParam String name,
			@RequestParam String password,@RequestParam String email,
		@RequestParam String address,Employee emp,Model m){
		Employee e1=empRepo.save(emp);
		return "success";	
		}
	/* It provides list of employees in model object */    
    @RequestMapping("/viewemp")    
    public String viewEmp(Model model){    
        model.addAttribute("emps",empRepo.findAll());
        return "viewemp";   
    }
    // Delete Employees 
    @RequestMapping(value="/delete/{id}")    
    public String delete(@PathVariable Integer id){    
    	empRepo.deleteById(id);    
        return "redirect:/viewemp";    
	 
    }
    @RequestMapping(value="/edit/{id}")    
    public String edit(@PathVariable int id, Model m){    
    	Employee emp=empRepo.findById(id).get();    
        m.addAttribute("command",emp);  
        return "edit";    
    }  

    /* It updates model object. */    
    @RequestMapping(value="/editu",method = RequestMethod.POST)    
    public String editsave( @RequestParam String name,
			@RequestParam String password,@RequestParam String email,
		@RequestParam String address,Employee emp,Model m){    
    	Employee e2= empRepo.save(emp);  
    	System.out.println(e2);
        return "redirect:/viewemp";    
    }    

}
