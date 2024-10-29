package com.example.demo;

import com.example.demo.db.TestingEntity;
import com.example.demo.db.TestingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests
{
	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	TestingService testingService;

	@Test
	void contextLoads() {
	}

	@Test
	void jdbcTest()
	{
		int a = 2;

		List<TestingEntity> res = testingService.getTestingObjects();

		SqlRowSet result = jdbcTemplate.queryForRowSet("select * from test_table");

		while (result.next())
		{
			System.out.print(result.getInt(1) + " " +
					result.getInt(2) + " " +
					result.getString(3) + " " + "\n");

		}


		System.out.println(a);
	}

}
