package com.github.moinmarcell.backend.service;

import com.github.moinmarcell.backend.model.Company;
import org.springframework.stereotype.Service;
import com.github.moinmarcell.backend.repository.CompanyRepository;

import java.util.List;

@Service
public class CompanyService {

    CompanyRepository companyRepository;
    IdService idService;

    public CompanyService(CompanyRepository companyRepository, IdService idService) {
        this.companyRepository = companyRepository;
        this.idService = idService;
    }

    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }
    public Company addCompany(Company company){
        Company companyToSave = new Company(
                idService.generateUuid(),
                company.name(),
                company.employees(),
                company.email(),
                company.phoneNumber(),
                company.customers(),
                company.products(),
                company.address()
        );
        companyRepository.save(companyToSave);
        return companyToSave;
    }
}
