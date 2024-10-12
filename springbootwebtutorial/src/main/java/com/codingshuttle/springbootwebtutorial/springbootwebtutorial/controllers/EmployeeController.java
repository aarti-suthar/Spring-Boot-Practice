package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.controllers;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.exceptions.ResourceNotFoundException;
import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret Message: asdfal@DA$D";
//    }

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable(name= "employeeId") Long id){
        //return new EmployeeDTO(id, "Aarti", "09aartisuthar@gmail.com",24, LocalDate.of(2024,1,2),true);
        Optional<EmployeeDTO> employeeDTO = employeeService.getEmployeebyId(id);
        return employeeDTO
                .map(employeeDTO1 -> ResponseEntity.ok(employeeDTO1))
                .orElseThrow(() -> new ResourceNotFoundException("Employee not Found with id: " + id));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
                                                @RequestParam(required = false) String sortBy){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> createNewEmployee(@Valid @RequestBody EmployeeDTO inputEmployee){
        //inputEmployee.setId(100L);
        EmployeeDTO savedEmployee = employeeService.createNewEmployee(inputEmployee);
        return new ResponseEntity<EmployeeDTO>(savedEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<EmployeeDTO> updateEmployeeById(@PathVariable(name = "employeeId") Long id, @Valid @RequestBody EmployeeDTO inputEmployee){
        return ResponseEntity.ok(employeeService.updateEmployeeById(id, inputEmployee));
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<Boolean> deleteEmployeeById(@PathVariable(name = "employeeId") Long id){
        boolean gotDeleted = employeeService.deleteEmployeeById(id);
        if(!gotDeleted){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(true);
    }

    //I ave created it by myself and it was not taught in the course
    @DeleteMapping
    public void deleteAllEmployees(){
        employeeService.deleteAllEmployees();
    }

    @PatchMapping("/{employeeId}")
    public ResponseEntity<EmployeeDTO> updatePartialEmployeeById(@RequestBody Map<String, Object> updates, @PathVariable Long id){
        EmployeeDTO updatedEmployee = employeeService.updatePartialEmployeeById(id, updates);
        if(updatedEmployee == null){
            return  ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedEmployee);
    }
}