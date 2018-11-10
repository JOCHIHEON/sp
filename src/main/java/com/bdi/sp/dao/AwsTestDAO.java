package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.AwsTestVO;

public interface AwsTestDAO {
	
	public List<AwsTestVO> selectAWSList();
	public AwsTestVO selectAWS(int atnum);
	public Integer insertAWS(AwsTestVO aws);
	public Integer updateAWS(AwsTestVO aws);
	public Integer deleteAWS(int aws);
}
