package com.lmm.domain;

public class VoucherReq{
	//系统流水号
	private String serialNo = " ";
	public String getSerialNo(){
		return serialNo;
	}
	public void setSerialNo(String serialNo){
		this.serialNo = serialNo;
	}

	//银行编号
	private String bankNo = " ";
	public String getBankNo(){
		return bankNo;
	}
	public void setBankNo(String bankNo){
		this.bankNo = bankNo;
	}

	//关联流水号
	private String assoSerial = " ";
	public String getAssoSerial(){
		return assoSerial;
	}
	public void setAssoSerial(String assoSerial){
		this.assoSerial = assoSerial;
	}

	//变动日期
	private int modiDate = 0;
	public int getModiDate(){
		return modiDate;
	}
	public void setModiDate(int modiDate){
		this.modiDate = modiDate;
	}

	//交易时间
	private int transTime = 0;
	public int getTransTime(){
		return transTime;
	}
	public void setTransTime(int transTime){
		this.transTime = transTime;
	}

	//交易代码
	private String transCode = " ";
	public String getTransCode(){
		return transCode;
	}
	public void setTransCode(String transCode){
		this.transCode = transCode;
	}

	//交易名称
	private String transName = " ";
	public String getTransName(){
		return transName;
	}
	public void setTransName(String transName){
		this.transName = transName;
	}

	//凭证种类
	private String voucherType = " ";
	public String getVoucherType(){
		return voucherType;
	}
	public void setVoucherType(String voucherType){
		this.voucherType = voucherType;
	}

	//变动数量
	private int count = 0;
	public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count = count;
	}

	//凭证起始号码
	private String startNo = " ";
	public String getStartNo(){
		return startNo;
	}
	public void setStartNo(String startNo){
		this.startNo = startNo;
	}

	//凭证截止号码
	private String endNo = " ";
	public String getEndNo(){
		return endNo;
	}
	public void setEndNo(String endNo){
		this.endNo = endNo;
	}

	//主机日期
	private int hostDate = 0;
	public int getHostDate(){
		return hostDate;
	}
	public void setHostDate(int hostDate){
		this.hostDate = hostDate;
	}

	//主机流水号
	private String hostSerial = " ";
	public String getHostSerial(){
		return hostSerial;
	}
	public void setHostSerial(String hostSerial){
		this.hostSerial = hostSerial;
	}

	//主机交易代码
	private String hostTransCode = " ";
	public String getHostTransCode(){
		return hostTransCode;
	}
	public void setHostTransCode(String hostTransCode){
		this.hostTransCode = hostTransCode;
	}

	//响应码
	private String errCode = " ";
	public String getErrCode(){
		return errCode;
	}
	public void setErrCode(String errCode){
		this.errCode = errCode;
	}

	//响应信息
	private String errMsg = " ";
	public String getErrMsg(){
		return errMsg;
	}
	public void setErrMsg(String errMsg){
		this.errMsg = errMsg;
	}

	//交易状态
	private String status = " ";
	public String getStatus(){
		return status;
	}
	public void setStatus(String status){
		this.status = status;
	}

	//交易渠道
	private String channel = " ";
	public String getChannel(){
		return channel;
	}
	public void setChannel(String channel){
		this.channel = channel;
	}

	//终端号
	private String term = " ";
	public String getTerm(){
		return term;
	}
	public void setTerm(String term){
		this.term = term;
	}

	//授权柜员
	private String authOper = " ";
	public String getAuthOper(){
		return authOper;
	}
	public void setAuthOper(String authOper){
		this.authOper = authOper;
	}

	//目标柜员
	private String targOper = " ";
	public String getTargOper(){
		return targOper;
	}
	public void setTargOper(String targOper){
		this.targOper = targOper;
	}

	//操作柜员
	private String operNo = " ";
	public String getOperNo(){
		return operNo;
	}
	public void setOperNo(String operNo){
		this.operNo = operNo;
	}

	//目标机构
	private String targBranchNo = " ";
	public String getTargBranchNo(){
		return targBranchNo;
	}
	public void setTargBranchNo(String targBranchNo){
		this.targBranchNo = targBranchNo;
	}

	//交易机构
	private String branchNo = " ";
	public String getBranchNo(){
		return branchNo;
	}
	public void setBranchNo(String branchNo){
		this.branchNo = branchNo;
	}

	//公司代码
	private String taCode = " ";
	public String getTaCode(){
		return taCode;
	}
	public void setTaCode(String taCode){
		this.taCode = taCode;
	}

	//产品代码
	private String prdCode = " ";
	public String getPrdCode(){
		return prdCode;
	}
	public void setPrdCode(String prdCode){
		this.prdCode = prdCode;
	}

	//保留整型1
	private int int1 = 0;
	public int getInt1(){
		return int1;
	}
	public void setInt1(int int1){
		this.int1 = int1;
	}

	//保留整型2
	private int int2 = 0;
	public int getInt2(){
		return int2;
	}
	public void setInt2(int int2){
		this.int2 = int2;
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
}
