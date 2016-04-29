package com.map.platform.interfaces.beans;

public class LocusInfo {
	private Integer id;			
	private Integer userId;		
	private String ak;			//用户的ak，授权使用
	private String serviceId;	//servicede ID，作为其唯一标识
	private String latitude;	//纬度
	private String longitude;	//经度
	private String coordType;	//坐标类型 1：GPS经纬度坐标2：国测局加密经纬度坐标 3：百度加密经纬度坐标
	private String entityName;	//entity唯一标识
}
