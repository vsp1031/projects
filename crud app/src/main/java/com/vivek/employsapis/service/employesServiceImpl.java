package com.vivek.employsapis.service;

import com.vivek.employsapis.entity.employes;
import com.vivek.employsapis.repository.employesrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employesServiceImpl implements employesService {
    @Autowired
    private employesrepo employesRepo;

    @Override
    public List<employes> getEmployes() {
        return employesRepo.findAll();
    }

    @Override
    public employes getEmploye(Long empId) {
        return employesRepo.findById(empId).get();
    }

    @Override
    public void deleteEmployes(Long employes) {
        employesRepo.deleteById(employes);
    }

    @Override
    public employes saveEmployes(employes Employes) {
        return employesRepo.save(Employes);
    }


}
