package com.master.details.repository;

import com.master.details.model.ReferenceMaster;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;



    public interface ReferenceMasterRepository extends MongoRepository<ReferenceMaster, String> {
        @Query(value = "{unitMasterNo : ?0}")
        ReferenceMaster findByUnitMasterNo(int no);

    }

