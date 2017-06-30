package com.barmiy.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import com.barmiy.dao.IEmpDAO;
import com.barmiy.vo.Emp;

public class EmpDAOImpl implements IEmpDAO {

	@Override
	public boolean doCreate(Emp vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doUpdate(Emp vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemoveBatch(Set<Integer> ids) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Emp findById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> findAllSplit(Integer currentPage, Integer linesize, String column, String keyword)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getAllCount(String column, String keyword) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
