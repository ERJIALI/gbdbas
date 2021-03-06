package com.njyb.gbdbase.dao.datasearch.country;


import java.util.List;

import com.njyb.gbdbas.mybatis.annotation.MyBatisReposity;
import com.njyb.gbdbase.model.datasearch.common.SqlModel;
import com.njyb.gbdbase.model.datasearch.panama.PanamaImportModel;

import java.lang.Integer;

/**
 * 
 * PanamaImportMapper数据库操作接口类
 * 
 **/
@MyBatisReposity
public interface IPanamaImportDao{


	/**
	 * 
	 * 查询所有返回List（）
	 * 
	 **/
	List<PanamaImportModel>  queryByPrimaryAll( SqlModel sqlModel);

}