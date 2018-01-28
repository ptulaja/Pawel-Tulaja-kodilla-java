package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
            employeeDao.delete(johnSmith);
            employeeDao.delete(stephanieClarckson);
            employeeDao.delete(lindaKovalsky);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testEmployeeNamedQuery() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int employee1 = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int employee2 = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int employee3 = lindaKovalsky.getId();

        //When
        List<Employee> showLastname = employeeDao.retrieveEmployeeLastname("Kovalsky");

        //Then
        Assert.assertEquals(1, showLastname.size());

        //CleanUp
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
        employeeDao.delete(employee3);
    }

    @Test
    public void testCompanyNamedNativeQuery() {
        //Given
        Company company1 = new Company("Software Machine");
        Company company2 = new Company("Data Maesters");
        Company company3 = new Company("Grey Matter");

        //when
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        List<Company> showCompanyName = companyDao.retrieveCompanyNameFirstLetters("dat");

        //Then
        Assert.assertEquals(1, showCompanyName.size());

        //CleanUp
        try {
            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);
        } catch (Exception e) {
            //do nothing
        }
    }

}

