package com.sa.G18.G18.Repository;

import com.sa.G18.G18.Entity.AccountRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:8080")
public interface AccountRecordRepository extends JpaRepository<AccountRecord, Long> {
    AccountRecord findByIdaccount(Long idaccount);
}
