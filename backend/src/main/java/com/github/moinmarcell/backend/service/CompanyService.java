package com.github.moinmarcell.backend.service;

import com.github.moinmarcell.backend.model.Company;
import org.springframework.stereotype.Service;
import com.github.moinmarcell.backend.repository.CompanyRepository;

import java.util.List;

@Service
public class CompanyService {

    CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }
}
