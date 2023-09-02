package com.vivek.employsapis.service;


import com.vivek.employsapis.entity.employes;

import java.util.List;

public interface employesService {
   public employes saveEmployes(employes employes);

    public  List<employes> getEmployes();

    public employes getEmploye(Long empId);

    public void deleteEmployes(Long employes);
}
