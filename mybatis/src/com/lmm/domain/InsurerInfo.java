/********************************************
* 文件名称: InsurerInfo.java
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


public class InsurerInfo{
	//公司代码
	private String ta_code = " ";
	public String getTaCode(){
		return ta_code;
	}
	public void setTaCode(String taCode){
		this.ta_code = taCode;
	}
	
	//保险公司银行代码
	private String insureBankNo = " ";
	public String getInsureBankNo() {
		return insureBankNo;
	}
	public void setInsureBankNo(String insureBankNo) {
		this.insureBankNo = insureBankNo;
	}

	//公司名称
	private String ta_name = " ";
	public String getTaName(){
		return ta_name;
	}
	public void setTaName(String taName){
		this.ta_name = taName;
	}

	//公司简拼
	private String taShortName = " ";
	public String getTaShortName(){
		return taShortName;
	}
	public void setTaShortName(String taShortName){
		this.taShortName = taShortName;
	}

	//#公司应用标识
	private String taBusinName = " ";
	public String getTaBusinName(){
		return taBusinName;
	}
	public void setTaBusinName(String taBusinName){
		this.taBusinName = taBusinName;
	}

	//公司类别
	private String taType = " ";
	public String getTaType(){
		return taType;
	}
	public void setTaType(String taType){
		this.taType = taType;
	}

	//公司准入状态
	private String taLimitFlag = " ";
	public String getTaLimitFlag(){
		return taLimitFlag;
	}
	public void setTaLimitFlag(String taLimitFlag){
		this.taLimitFlag = taLimitFlag;
	}

	//手续费收取方式
	private String chargeFlag = " ";
	public String getChargeFlag(){
		return chargeFlag;
	}
	public void setChargeFlag(String chargeFlag){
		this.chargeFlag = chargeFlag;
	}

	//#合约开始日期
	private int beginDate = 0;
	public int getBeginDate(){
		return beginDate;
	}
	public void setBeginDate(int beginDate){
		this.beginDate = beginDate;
	}

	//#合约结束日期
	private int endDate = 0;
	public int getEndDate(){
		return endDate;
	}
	public void setEndDate(int endDate){
		this.endDate = endDate;
	}

	//主办内部机构编号
	private String masterInternal = " ";
	public String getMasterInternal(){
		return masterInternal;
	}
	public void setMasterInternal(String masterInternal){
		this.masterInternal = masterInternal;
	}

	//主办机构编号
	private String masterBranch = " ";
	public String getMasterBranch(){
		return masterBranch;
	}
	public void setMasterBranch(String masterBranch){
		this.masterBranch = masterBranch;
	}

	//签约帐号
	private String insurerAcc = " ";
	public String getInsurerAcc(){
		return insurerAcc;
	}
	public void setInsurerAcc(String insurerAcc){
		this.insurerAcc = insurerAcc;
	}

	//代收代理业务编号
	private String inBusinNo = " ";
	public String getInBusinNo(){
		return inBusinNo;
	}
	public void setInBusinNo(String inBusinNo){
		this.inBusinNo = inBusinNo;
	}

	//代付代理业务编号
	private String outBusinNo = " ";
	public String getOutBusinNo(){
		return outBusinNo;
	}
	public void setOutBusinNo(String outBusinNo){
		this.outBusinNo = outBusinNo;
	}

	//#保险前置IP
	private String ipAddress = " ";
	public String getIpAddress(){
		return ipAddress;
	}
	public void setIpAddress(String ipAddress){
		this.ipAddress = ipAddress;
	}

	//#保险前置端口号
	private String port = " ";
	public String getPort(){
		return port;
	}
	public void setPort(String port){
		this.port = port;
	}

	//#保险前置超时间
	private int waitTime = 0;
	public int getWaitTime(){
		return waitTime;
	}
	public void setWaitTime(int waitTime){
		this.waitTime = waitTime;
	}
	
	//保险文件服务器ip
	private String fileIp = " ";
	public String getFileIp() {
		return fileIp;
	}
	public void setFileIp(String fileIp) {
		this.fileIp = fileIp;
	}
	
	//保险文件服务器端口
	private String filePort = " ";
	public String getFilePort() {
		return filePort;
	}
	public void setFilePort(String filePort) {
		this.filePort = filePort;
	}
	
	//保险文件服务超时时间
	private int fileWaitTime = 0;
	public int getFileWaitTime() {
		return fileWaitTime;
	}
	public void setFileWaitTime(int fileWaitTime) {
		this.fileWaitTime = fileWaitTime;
	}

	//联系人
	private String linkName = " ";
	public String getLinkName(){
		return linkName;
	}
	public void setLinkName(String linkName){
		this.linkName = linkName;
	}

	//联系电话
	private String linkTel = " ";
	public String getLinkTel(){
		return linkTel;
	}
	public void setLinkTel(String linkTel){
		this.linkTel = linkTel;
	}

	//签到标志
	private String signinFlag = " ";
	public String getSigninFlag(){
		return signinFlag;
	}
	public void setSigninFlag(String signinFlag){
		this.signinFlag = signinFlag;
	}

	//签到日期
	private int signinDate = 0;
	public int getSigninDate(){
		return signinDate;
	}
	public void setSigninDate(int signinDate){
		this.signinDate = signinDate;
	}

	//主PKG密钥
	private String mPkgKey = " ";
	public String getMPkgKey(){
		return mPkgKey;
	}
	public void setMPkgKey(String mPkgKey){
		this.mPkgKey = mPkgKey;
	}

	//主PWD密钥
	private String mPwdKey = " ";
	public String getMPwdKey(){
		return mPwdKey;
	}
	public void setMPwdKey(String mPwdKey){
		this.mPwdKey = mPwdKey;
	}

	//主MAC密钥
	private String mMacKey = " ";
	public String getMMacKey(){
		return mMacKey;
	}
	public void setMMacKey(String mMacKey){
		this.mMacKey = mMacKey;
	}

	//PKG密钥
	private String pkgKey = " ";
	public String getPkgKey(){
		return pkgKey;
	}
	public void setPkgKey(String pkgKey){
		this.pkgKey = pkgKey;
	}

	//PWD密钥
	private String pwdKey = " ";
	public String getPwdKey(){
		return pwdKey;
	}
	public void setPwdKey(String pwdKey){
		this.pwdKey = pwdKey;
	}

	//MAC密钥
	private String macKey = " ";
	public String getMacKey(){
		return macKey;
	}
	public void setMacKey(String macKey){
		this.macKey = macKey;
	}

	//控制标志
	private String controlFlag = " ";
	public String getControlFlag(){
		return controlFlag;
	}
	public void setControlFlag(String controlFlag){
		this.controlFlag = controlFlag;
	}

	//开市时间
	private int openTime = 0;
	public int getOpenTime(){
		return openTime;
	}
	public void setOpenTime(int openTime){
		this.openTime = openTime;
	}

	//闭市时间
	private int closeTime = 0;
	public int getCloseTime(){
		return closeTime;
	}
	public void setCloseTime(int closeTime){
		this.closeTime = closeTime;
	}

	//备用字段1
	private String reserve1 = " ";
	public String getReserve1(){
		return reserve1;
	}
	public void setReserve1(String reserve1){
		this.reserve1 = reserve1;
	}

	//备用字段2
	private String reserve2 = " ";
	public String getReserve2(){
		return reserve2;
	}
	public void setReserve2(String reserve2){
		this.reserve2 = reserve2;
	}

    public String toString() {
        return "InsurerInfo [ta_code=" + ta_code + "]";
    }

}

