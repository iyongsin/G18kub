package com.sa.G18.G18;

import com.sa.G18.G18.Entity.AccountRecord;
import com.sa.G18.G18.Entity.Departments;
import com.sa.G18.G18.Entity.GiveTo;
import com.sa.G18.G18.Entity.IncomeExpenses;
import com.sa.G18.G18.Repository.AccountRecordRepository;
import com.sa.G18.G18.Repository.DepartmentsRepository;
import com.sa.G18.G18.Repository.GiveToRepository;
import com.sa.G18.G18.Repository.IncomeExpensesRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.stream.Stream;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200/")
public class G18Application {

	public static void main(String[] args) {
		SpringApplication.run(G18Application.class, args);
	}
	@Bean
	ApplicationRunner init(AccountRecordRepository accountrecordrepository, DepartmentsRepository departmentsrepository,
						   GiveToRepository givetorepository, IncomeExpensesRepository incomeexpensesrepository) {
		return args -> {
			//AccountRecord account = new AccountRecord();
            Stream.of("รายรับ","รายจ่าย").forEach(incomes -> {
                IncomeExpenses income = new IncomeExpenses();
                income.setIncomeExpenses(incomes);
                incomeexpensesrepository.save(income);
            });

			Stream.of("พยาบาล","ดูแลผู้ป่วย","โรงครัว","พัสดุ/เครื่องมือ","กิจกรรม").forEach(Departmentss -> {
				Departments departs = new Departments();
				departs.setNamedepartment(Departmentss);
				departmentsrepository.save(departs);
			});
			Stream.of("ภายใน","ภายนอก").forEach(givetos -> {
				GiveTo giveto = new GiveTo();
				giveto.setGiveTo(givetos);
				givetorepository.save(giveto);
			});




		};
}
}
