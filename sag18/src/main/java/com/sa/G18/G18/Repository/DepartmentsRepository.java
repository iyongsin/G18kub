package com.sa.G18.G18.Repository;
import com.sa.G18.G18.Entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:8080")
    public interface DepartmentsRepository extends JpaRepository<Departments,Long>{
    Departments findByNameDepartment(String nameDepartment);
}
