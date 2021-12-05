package com.example.edu.cms.mapper;

import com.example.edu.cms.mapper.sql.TestDemoSql;
import com.example.edu.cms.model.TestDemoModel;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDemoMapper {
    @SelectProvider(type = TestDemoSql.class, method = "selectUser")
    List<TestDemoModel> SelectUser();
}
