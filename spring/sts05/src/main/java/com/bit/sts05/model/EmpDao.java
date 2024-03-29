package com.bit.sts05.model;

import java.sql.SQLException;
import java.util.List;

public interface EmpDao<T> {
	List<T> findAll() throws SQLException;
	T findOne(int idx) throws SQLException;
	void insertOne(T t) throws SQLException;
	int updateOne(T t) throws SQLException;
	int deleteOne(int idx) throws SQLException;
}
