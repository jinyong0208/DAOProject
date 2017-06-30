package com.barmiy.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import com.barmiy.vo.Emp;
/**
 * 定义Emp数据层的开发标准
 * @author jinyong
 *
 */
public interface IEmpDAO {
	/**
	 * 数据增加操作
	 * @param vo需要传入的VO对象
	 * @return 增加成功返回true ，否则返回false
	 * @throws SQLException SQL执行异常
	 */
	public boolean doCreate (Emp vo)throws SQLException ;
	/**
	 * 根据ID更新修改数据操作
	 * @param vo 需要更新的VO对象
	 * @return 修改成功返回true,否则返回false
	 * @throws SQLException SQL执行异常
	 */
	public boolean doUpdate(Emp vo)throws SQLException ;
	/**
	 * 批量删除操作，要删除的ID以Set集合保存
	 * @param ids 包含了删除的ID不包含重复的部分
	 * @return 删除成功返回true，否则返回false;
	 * @throws SQLException SQL执行异常
	 */
	public boolean doRemoveBatch(Set<Integer> ids)throws SQLException ;
	/**
	 * 根据雇员编号，查询雇员信息
	 * @param id 要查询的雇员编号
	 * @return 如果查询的雇员信息存在以VO对象的方式返回
	 * @throws SQLException SQL执行异常
	 */
	public Emp findById(Integer id) throws SQLException ;
	/**
	 * 查询所有雇员信息
	 * @return 如果有数据则以VO对象封装然后以List的形式返回；
	 * @throws SQLException SQL执行异常
	 */
	public List<Emp> findAll()throws SQLException ;
	/**
	 * 分页进行模糊查询，查询结果以集合的形式返回
	 * @param currentPage 当前页数
	 * @param linesize每页显示行数
	 * @param column 要进行模糊查询的数据列
	 * @param keyword 要进行模糊查询的关键字
	 * @return 如果有数据则以VO对象封装然后以List的形式返回；
	 * @throws SQLException SQL执行异常
	 */
	public List<Emp>findAllSplit(Integer currentPage ,Integer linesize, String column, String keyword)throws SQLException ;
	/**
	 * 进行模糊查询数据量的统计
	 * @param column 要进行模糊查询的数据列
	 * @param keyword 要进行模糊查询的关键字
	 * @return 返回模糊查询的数据量
	 * @throws SQLException SQL执行异常
	 */
	public Integer getAllCount(String column, String keyword)throws SQLException ;

}
