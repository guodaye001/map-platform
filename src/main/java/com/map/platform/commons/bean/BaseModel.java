package com.map.platform.commons.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Model基类
 * Title: 擎动综合支付业务管理系统
 * Description:
 * Company: 武汉天喻信息产业股份有限公司
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
    protected String proCode = null; //省代码
    protected String cityCode = null;//市代码
    protected String exportFileType; //导出文件的格式
    protected String totalNumber; //总笔数
    protected String totalAmount; //总金额
    //商户总订单开始日期
    private String mchntMergerBeginOrderDate;
    //商户总订单结束日期
    private String mchntMergerEndOrderDate;
    //商户子订单开始日期
    private String orderBeginDate;
    //商户子订单结束日期
    private String orderEndDate;
    //开始交易金额
    private String beginTransAmt;
    //结束交易金额
    private String endTransAmt;

    private String oclKey;    //oracle 关键字 and or where 等

    public int getSearchTableType() {
        return searchTableType;
    }

    public void setSearchTableType(int searchTableType) {
        this.searchTableType = searchTableType;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(String totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getExportFileType() {
        return exportFileType;
    }

    public void setExportFileType(String exportFileType) {
        this.exportFileType = exportFileType;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 过滤空格
     *
     * @param o 要过滤的对象
     * @return 返回过滤后的结果
     */
    public String filter(Object o) {
        if (o == null)
            return "";
        if ("null".equals(o))
            return "";
        return o.toString().trim();
    }

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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
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

    /**
     * @return the mchntMergerBeginOrderDate
     */
    public String getMchntMergerBeginOrderDate() {
        return mchntMergerBeginOrderDate;
    }

    /**
     * @param mchntMergerBeginOrderDate the mchntMergerBeginOrderDate to set
     */
    public void setMchntMergerBeginOrderDate(String mchntMergerBeginOrderDate) {
        this.mchntMergerBeginOrderDate = mchntMergerBeginOrderDate;
    }

    /**
     * @return the mchntMergerEndOrderDate
     */
    public String getMchntMergerEndOrderDate() {
        return mchntMergerEndOrderDate;
    }

    /**
     * @param mchntMergerEndOrderDate the mchntMergerEndOrderDate to set
     */
    public void setMchntMergerEndOrderDate(String mchntMergerEndOrderDate) {
        this.mchntMergerEndOrderDate = mchntMergerEndOrderDate;
    }

    /**
     * @return the orderBeginDate
     */
    public String getOrderBeginDate() {
        return orderBeginDate;
    }

    /**
     * @param orderBeginDate the orderBeginDate to set
     */
    public void setOrderBeginDate(String orderBeginDate) {
        this.orderBeginDate = orderBeginDate;
    }

    /**
     * @return the orderEndDate
     */
    public String getOrderEndDate() {
        return orderEndDate;
    }

    /**
     * @param orderEndDate the orderEndDate to set
     */
    public void setOrderEndDate(String orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    /**
     * @return the beginTransAmt
     */
    public String getBeginTransAmt() {
        return beginTransAmt;
    }

    /**
     * @param beginTransAmt the beginTransAmt to set
     */
    public void setBeginTransAmt(String beginTransAmt) {
        this.beginTransAmt = beginTransAmt;
    }

    /**
     * @return the endTransAmt
     */
    public String getEndTransAmt() {
        return endTransAmt;
    }

    /**
     * @param endTransAmt the endTransAmt to set
     */
    public void setEndTransAmt(String endTransAmt) {
        this.endTransAmt = endTransAmt;
    }

    public String getOclKey() {
        return oclKey;
    }

    public void setOclKey(String oclKey) {
        this.oclKey = oclKey;
    }
}
