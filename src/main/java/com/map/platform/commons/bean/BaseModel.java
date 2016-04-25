package com.map.platform.commons.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Model基类
 * @author Guosw
 * 2016年4月25日14:00:18
 */
public abstract class BaseModel implements Serializable {
    protected static Logger log = LoggerFactory.getLogger(BaseModel.class);
    protected static final long serialVersionUID = 1L;
    protected Integer startRow = 0;//当前页面开始行
    protected Integer pageSize = 20;//每页显示多少条
    protected Integer rowNum; //总共多少条
    protected Integer pageNum = 1;//当前页
    protected String orderFieldName;//要排序的字段名
    protected String orderByRule;//排序规则
    protected String letterIndex;//字母索引
    protected String beginTime;//开始时间
    protected String endTime;//结束时间
    protected String tableName;//表名
    protected String tableType;//类型
    protected int searchTableType;//查询表的类型：0：当前表  1：一个月以前的，2：一年以前的
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getRowNum() {
		return rowNum;
	}
	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public String getOrderFieldName() {
		return orderFieldName;
	}
	public void setOrderFieldName(String orderFieldName) {
		this.orderFieldName = orderFieldName;
	}
	public String getOrderByRule() {
		return orderByRule;
	}
	public void setOrderByRule(String orderByRule) {
		this.orderByRule = orderByRule;
	}
	public String getLetterIndex() {
		return letterIndex;
	}
	public void setLetterIndex(String letterIndex) {
		this.letterIndex = letterIndex;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableType() {
		return tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
	public int getSearchTableType() {
		return searchTableType;
	}
	public void setSearchTableType(int searchTableType) {
		this.searchTableType = searchTableType;
	}

}
