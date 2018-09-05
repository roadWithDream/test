/********************************************
* 文件名称: InsureProduct.java
* 系统名称: 综合理财管理平台V3.0
* 模块名称:
* 软件版权: 恒生电子股份有限公司
* 功能说明: 
* 系统版本: 3.0.0.1
* 开发人员: 综合理财项目组
* 开发时间:  
* 审核人员:
* 相关文档:
* 修改记录: 修改日期    修改人员    修改说明
*********************************************/
package com.lmm.domain;

public class InsureProduct{
	//产品代码
	private String prdCode = " ";
	public String getPrdCode(){
		return prdCode;
	}
	public void setPrdCode(String prdCode){
		this.prdCode = prdCode;
	}

	//公司代码
	private String taCode = " ";
	public String getTaCode(){
		return taCode;
	}
	public void setTaCode(String taCode){
		this.taCode = taCode;
	}

	//产品名称
	private String prdName = " ";
	public String getPrdName(){
		return prdName;
	}
	public void setPrdName(String prdName){
		this.prdName = prdName;
	}

	//产品名称2
	private String prdName2 = " ";
	public String getPrdName2(){
		return prdName2;
	}
	public void setPrdName2(String prdName2){
		this.prdName2 = prdName2;
	}

	//产品类型
	private String prdType = " ";
	public String getPrdType(){
		return prdType;
	}
	public void setPrdType(String prdType){
		this.prdType = prdType;
	}

	//产品子类型
	private String prdSubType = " ";
	public String getPrdSubType(){
		return prdSubType;
	}
	public void setPrdSubType(String prdSubType){
		this.prdSubType = prdSubType;
	}

	//产品应用标识
	private String prdBusinFlag = " ";
	public String getPrdBusinFlag(){
		return prdBusinFlag;
	}
	public void setPrdBusinFlag(String prdBusinFlag){
		this.prdBusinFlag = prdBusinFlag;
	}

	//产品准入状态
	private String prdLimitFlag = " ";
	public String getPrdLimitFlag(){
		return prdLimitFlag;
	}
	public void setPrdLimitFlag(String prdLimitFlag){
		this.prdLimitFlag = prdLimitFlag;
	}

	//交易币种
	private String currType = " ";
	public String getCurrType(){
		return currType;
	}
	public void setCurrType(String currType){
		this.currType = currType;
	}

	//是否联机
	private String onlineFlag = " ";
	public String getOnlineFlag(){
		return onlineFlag;
	}
	public void setOnlineFlag(String onlineFlag){
		this.onlineFlag = onlineFlag;
	}

	//合约开始日期
	private int beginDate = 0;
	public int getBeginDate(){
		return beginDate;
	}
	public void setBeginDate(int beginDate){
		this.beginDate = beginDate;
	}

	//合约结束日期
	private int endDate = 0;
	public int getEndDate(){
		return endDate;
	}
	public void setEndDate(int endDate){
		this.endDate = endDate;
	}

	//有无附加险标志
	private String prdAddFlag = " ";
	public String getPrdAddFlag(){
		return prdAddFlag;
	}
	public void setPrdAddFlag(String prdAddFlag){
		this.prdAddFlag = prdAddFlag;
	}

	//保险公司产品代码
	private String targPrdCode = " ";
	public String getTargPrdCode(){
		return targPrdCode;
	}
	public void setTargPrdCode(String targPrdCode){
		this.targPrdCode = targPrdCode;
	}

	//犹豫期天数
	private int waverDays = 0;
	public int getWaverDays(){
		return waverDays;
	}
	public void setWaverDays(int waverDays){
		this.waverDays = waverDays;
	}

	//主办行手续费折算率
	private double masterAgiorate = 0.0;
	public double getMasterAgiorate(){
		return masterAgiorate;
	}
	public void setMasterAgiorate(double masterAgiorate){
		this.masterAgiorate = masterAgiorate;
	}

	//核保方式
	private String checkType = " ";
	public String getCheckType(){
		return checkType;
	}
	public void setCheckType(String checkType){
		this.checkType = checkType;
	}

	//控制标志
	private String controlFlag = " ";
	public String getControlFlag(){
		return controlFlag;
	}
	public void setControlFlag(String controlFlag){
		this.controlFlag = controlFlag;
	}
	
	//个人最小保费金额
	private double pminAmt = 0.0;
	public double getPminAmt(){
		return pminAmt;
	}
	public void setPminAmt(double pminAmt){
		this.pminAmt = pminAmt;
	}
	
	//机构最小保费金额
	private double ominAmt = 0.0;
	public double getOminAmt(){
		return ominAmt;
	}
	public void setOminAmt(double ominAmt){
		this.ominAmt = ominAmt;
	}
	
	//个人最大保费金额
	private double pmaxAmt = 0.0;
	public double getPmaxAmt(){
		return pmaxAmt;
	}
	public void setPmaxAmt(double pmaxAmt){
		this.pmaxAmt = pmaxAmt;
	}
	
	//机构最大保费金额
	private double omaxAmt = 0.0;
	public double getOmaxAmt(){
		return omaxAmt;
	}
	public void setOmaxAmt(double omaxAmt){
		this.omaxAmt = omaxAmt;
	}
	
	//个人最小保费单位
	private double punitAmt = 0.0;
	public double getPunitAmt(){
		return punitAmt;
	}
	public void setPunitAmt(double punitAmt){
		this.punitAmt = punitAmt;
	}
	
	//机构最小保费单位
	private double ounitAmt = 0.0;
	public double getOunitAmt(){
		return ounitAmt;
	}
	public void setOunitAmt(double ounitAmt){
		this.ounitAmt = ounitAmt;
	}

	//保留字段1
	private String reserve1 = " ";
	public String getReserve1(){
		return reserve1;
	}
	public void setReserve1(String reserve1){
		this.reserve1 = reserve1;
	}

	//保留字段2
	private String reserve2 = " ";
	public String getReserve2(){
		return reserve2;
	}
	public void setReserve2(String reserve2){
		this.reserve2 = reserve2;
	}

	//保留字段3
	private String reserve3 = " ";
	public String getReserve3(){
		return reserve3;
	}
	public void setReserve3(String reserve3){
		this.reserve3 = reserve3;
	}

	//保留字段4
	private String reserve4 = " ";
	public String getReserve4(){
		return reserve4;
	}
	public void setReserve4(String reserve4){
		this.reserve4 = reserve4;
	}
	
	//保留金额1
	private double amt1 = 0.0;
	public double getAmt1(){
		return amt1;
	}
	public void setAmt1(double amt1){
		this.amt1 = amt1;
	}
	
	//保留金额2
	private double amt2 = 0.0;
	public double getAmt2(){
		return amt2;
	}
	public void setAmt2(double amt2){
		this.amt2 = amt2;
	}
	
	//保留金额3
	private double amt3 = 0.0;
	public double getAmt3(){
		return amt3;
	}
	public void setAmt3(double amt3){
		this.amt3 = amt3;
	}


}
