package com.bdi.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.AwsTestDAO;
import com.bdi.sp.vo.AwsTestVO;

@Repository
public class AwsTestDAOImpl implements AwsTestDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<AwsTestVO> selectAWSList() {
		return ss.selectList("com.bdi.sp.AWS.selectAWSList");
	}

	@Override
	public AwsTestVO selectAWS(int atnum) {
		return ss.selectOne("com.bdi.sp.AWS.selectAWS",atnum);
	}

	@Override
	public Integer insertAWS(AwsTestVO aws) {
		return ss.insert("com.bdi.sp.AWS.insertAWS",aws);
	}

	@Override
	public Integer updateAWS(AwsTestVO aws) {
		return ss.update("com.bdi.sp.AWS.updateAWS",aws);
	}

	@Override
	public Integer deleteAWS(int atnum) {
		return ss.delete("com.bdi.sp.AWS.deleteAWS",atnum);
	}

}
