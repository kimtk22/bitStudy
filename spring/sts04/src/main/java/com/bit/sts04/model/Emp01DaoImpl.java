package com.bit.sts04.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Emp01DaoImpl implements EmpDao<EmpVo> {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	RowMapper<EmpVo> mapper = new RowMapper<EmpVo>() {
		
		@Override
		public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new EmpVo(
					rs.getInt("empno"),
					rs.getInt("sal"),
					rs.getString("ename"),
					rs.getString("job"),
					rs.getTimestamp("hiredate")
					);
		}
	};

	@Override
	public List<EmpVo> findAll() throws SQLException {
		String sql = "select * from emp";
		return jdbcTemplate.query(sql, mapper);
		
	}

	@Override
	public EmpVo find(int empno) throws SQLException {
		String sql = "select * from emp where empno = ?";
		return jdbcTemplate.queryForObject(sql, mapper, empno);
	}

	@Override
	public void insertOne(EmpVo bean) throws SQLException {
		String sql = "insert into emp (empno, ename, sal, job, hiredate) values (?,?,?,?,now())";
		jdbcTemplate.update(sql, bean.getEmpno(), bean.getEname(), bean.getSal(), bean.getJob());
	}

	@Override
	public int updateOne(EmpVo bean) throws SQLException {
		String sql = "update emp set ename = ?, sal = ?, job = ? where empno = ?";
		return jdbcTemplate.update(sql, bean.getEname(), bean.getSal(), bean.getJob(), bean.getEmpno());
	}

	@Override
	public int deleteOne(int empno) throws SQLException {
		String sql = "delete from emp where empno = ?";
		return jdbcTemplate.update(sql, empno);
	}

}
