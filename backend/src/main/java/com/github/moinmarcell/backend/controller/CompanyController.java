package com.github.moinmarcell.backend.controller;

import com.github.moinmarcell.backend.model.Company;
import org.springframework.web.bind.annotation.*;
import com.github.moinmarcell.backend.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping("api/companies")
public class CompanyController {

    CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getAllCompanies(){
        return this.companyService.getAllCompanies();
    }

    @PostMapping
    public Company saveCompany(@RequestBody Company company){
        return companyService.addCompany(company);
    }

}
