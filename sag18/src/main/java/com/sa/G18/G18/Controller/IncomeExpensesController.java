package com.sa.G18.G18.Controller;
import com.sa.G18.G18.Entity.AccountRecord;
import com.sa.G18.G18.Entity.Departments;
import com.sa.G18.G18.Entity.GiveTo;
import com.sa.G18.G18.Entity.IncomeExpenses;
import com.sa.G18.G18.Repository.AccountRecordRepository;
import com.sa.G18.G18.Repository.DepartmentsRepository;
import com.sa.G18.G18.Repository.GiveToRepository;
import com.sa.G18.G18.Repository.IncomeExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins =  "http://localhost:4200")

public class IncomeExpensesController {
    @Autowired    private IncomeExpensesRepository incomeexpensesrepository;

    @Autowired IncomeExpensesController(IncomeExpensesRepository incomeexpensesrepository){
        this.incomeexpensesrepository = incomeexpensesrepository;
    }
    @GetMapping(path = "/IncomeExpenses",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<IncomeExpenses> IncomeExpenses(){
        return incomeexpensesrepository.findAll().stream().collect(Collectors.toList());
    }

}
