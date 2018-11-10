package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.AwsTestDAO;
import com.bdi.sp.service.AwsTestService;
import com.bdi.sp.vo.AwsTestVO;

@Service
public class AwsTestServiceImpl implements AwsTestService {

	@Autowired
	private AwsTestDAO atdao;
	
	@Override
	public List<AwsTestVO> selectAWSList() {
		return atdao.selectAWSList();
	}

	@Override
	public AwsTestVO selectAWS(int atnum) {
		return atdao.selectAWS(atnum);
	}

	@Override
	public Integer insertAWS(AwsTestVO aws) {
		return atdao.insertAWS(aws);
	}

	@Override
	public Integer updateAWS(AwsTestVO aws) {
		return atdao.updateAWS(aws);
	}

	@Override
	public Integer deleteAWS(int atnum) {
		return atdao.deleteAWS(atnum);
	}

}
