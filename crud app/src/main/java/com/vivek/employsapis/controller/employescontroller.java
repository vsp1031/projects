package com.vivek.employsapis.controller;

import com.vivek.employsapis.entity.employes;
import com.vivek.employsapis.service.employesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class employescontroller {

    @Autowired
    private employesService employesservice;
    @PostMapping("/emp")
    public employes saveEmployes(@RequestBody employes Employes){
        return employesservice.saveEmployes(Employes);
    }

    @GetMapping("/emp")
    public List<employes>getEmployes(){
        return employesservice.getEmployes();
    }

    @GetMapping("/emp/{Employes}")
    public employes getEmploye(@PathVariable Long Employes ){
        return  employesservice.getEmploye(Employes);
    }

    @DeleteMapping("/emp/{Employes}")
    public String deleteEmployes(@PathVariable Long Employes){
        employesservice.deleteEmployes(Employes);
        return "Delete Sucessfully";
    }
}
