/********************************************
* �ļ�����: InsurerInfo.java
* ϵͳ����: �ۺ���ƹ���ƽ̨V3.0
* ģ������:
* �����Ȩ: �������ӹɷ����޹�˾
* ����˵��: 
* ϵͳ�汾: 3.0.0.1
* ������Ա: �ۺ������Ŀ��
* ����ʱ��:  
* �����Ա:
* ����ĵ�:
* �޸ļ�¼: �޸�����    �޸���Ա    �޸�˵��
*********************************************/
package com.lmm.domain;


public class InsurerInfo{
	//��˾����
	private String ta_code = " ";
	public String getTaCode(){
		return ta_code;
	}
	public void setTaCode(String taCode){
		this.ta_code = taCode;
	}
	
	//���չ�˾���д���
	private String insureBankNo = " ";
	public String getInsureBankNo() {
		return insureBankNo;
	}
	public void setInsureBankNo(String insureBankNo) {
		this.insureBankNo = insureBankNo;
	}

	//��˾����
	private String ta_name = " ";
	public String getTaName(){
		return ta_name;
	}
	public void setTaName(String taName){
		this.ta_name = taName;
	}

	//��˾��ƴ
	private String taShortName = " ";
	public String getTaShortName(){
		return taShortName;
	}
	public void setTaShortName(String taShortName){
		this.taShortName = taShortName;
	}

	//#��˾Ӧ�ñ�ʶ
	private String taBusinName = " ";
	public String getTaBusinName(){
		return taBusinName;
	}
	public void setTaBusinName(String taBusinName){
		this.taBusinName = taBusinName;
	}

	//��˾���
	private String taType = " ";
	public String getTaType(){
		return taType;
	}
	public void setTaType(String taType){
		this.taType = taType;
	}

	//��˾׼��״̬
	private String taLimitFlag = " ";
	public String getTaLimitFlag(){
		return taLimitFlag;
	}
	public void setTaLimitFlag(String taLimitFlag){
		this.taLimitFlag = taLimitFlag;
	}

	//��������ȡ��ʽ
	private String chargeFlag = " ";
	public String getChargeFlag(){
		return chargeFlag;
	}
	public void setChargeFlag(String chargeFlag){
		this.chargeFlag = chargeFlag;
	}

	//#��Լ��ʼ����
	private int beginDate = 0;
	public int getBeginDate(){
		return beginDate;
	}
	public void setBeginDate(int beginDate){
		this.beginDate = beginDate;
	}

	//#��Լ��������
	private int endDate = 0;
	public int getEndDate(){
		return endDate;
	}
	public void setEndDate(int endDate){
		this.endDate = endDate;
	}

	//�����ڲ��������
	private String masterInternal = " ";
	public String getMasterInternal(){
		return masterInternal;
	}
	public void setMasterInternal(String masterInternal){
		this.masterInternal = masterInternal;
	}

	//����������
	private String masterBranch = " ";
	public String getMasterBranch(){
		return masterBranch;
	}
	public void setMasterBranch(String masterBranch){
		this.masterBranch = masterBranch;
	}

	//ǩԼ�ʺ�
	private String insurerAcc = " ";
	public String getInsurerAcc(){
		return insurerAcc;
	}
	public void setInsurerAcc(String insurerAcc){
		this.insurerAcc = insurerAcc;
	}

	//���մ���ҵ����
	private String inBusinNo = " ";
	public String getInBusinNo(){
		return inBusinNo;
	}
	public void setInBusinNo(String inBusinNo){
		this.inBusinNo = inBusinNo;
	}

	//��������ҵ����
	private String outBusinNo = " ";
	public String getOutBusinNo(){
		return outBusinNo;
	}
	public void setOutBusinNo(String outBusinNo){
		this.outBusinNo = outBusinNo;
	}

	//#����ǰ��IP
	private String ipAddress = " ";
	public String getIpAddress(){
		return ipAddress;
	}
	public void setIpAddress(String ipAddress){
		this.ipAddress = ipAddress;
	}

	//#����ǰ�ö˿ں�
	private String port = " ";
	public String getPort(){
		return port;
	}
	public void setPort(String port){
		this.port = port;
	}

	//#����ǰ�ó�ʱ��
	private int waitTime = 0;
	public int getWaitTime(){
		return waitTime;
	}
	public void setWaitTime(int waitTime){
		this.waitTime = waitTime;
	}
	
	//�����ļ�������ip
	private String fileIp = " ";
	public String getFileIp() {
		return fileIp;
	}
	public void setFileIp(String fileIp) {
		this.fileIp = fileIp;
	}
	
	//�����ļ��������˿�
	private String filePort = " ";
	public String getFilePort() {
		return filePort;
	}
	public void setFilePort(String filePort) {
		this.filePort = filePort;
	}
	
	//�����ļ�����ʱʱ��
	private int fileWaitTime = 0;
	public int getFileWaitTime() {
		return fileWaitTime;
	}
	public void setFileWaitTime(int fileWaitTime) {
		this.fileWaitTime = fileWaitTime;
	}

	//��ϵ��
	private String linkName = " ";
	public String getLinkName(){
		return linkName;
	}
	public void setLinkName(String linkName){
		this.linkName = linkName;
	}

	//��ϵ�绰
	private String linkTel = " ";
	public String getLinkTel(){
		return linkTel;
	}
	public void setLinkTel(String linkTel){
		this.linkTel = linkTel;
	}

	//ǩ����־
	private String signinFlag = " ";
	public String getSigninFlag(){
		return signinFlag;
	}
	public void setSigninFlag(String signinFlag){
		this.signinFlag = signinFlag;
	}

	//ǩ������
	private int signinDate = 0;
	public int getSigninDate(){
		return signinDate;
	}
	public void setSigninDate(int signinDate){
		this.signinDate = signinDate;
	}

	//��PKG��Կ
	private String mPkgKey = " ";
	public String getMPkgKey(){
		return mPkgKey;
	}
	public void setMPkgKey(String mPkgKey){
		this.mPkgKey = mPkgKey;
	}

	//��PWD��Կ
	private String mPwdKey = " ";
	public String getMPwdKey(){
		return mPwdKey;
	}
	public void setMPwdKey(String mPwdKey){
		this.mPwdKey = mPwdKey;
	}

	//��MAC��Կ
	private String mMacKey = " ";
	public String getMMacKey(){
		return mMacKey;
	}
	public void setMMacKey(String mMacKey){
		this.mMacKey = mMacKey;
	}

	//PKG��Կ
	private String pkgKey = " ";
	public String getPkgKey(){
		return pkgKey;
	}
	public void setPkgKey(String pkgKey){
		this.pkgKey = pkgKey;
	}

	//PWD��Կ
	private String pwdKey = " ";
	public String getPwdKey(){
		return pwdKey;
	}
	public void setPwdKey(String pwdKey){
		this.pwdKey = pwdKey;
	}

	//MAC��Կ
	private String macKey = " ";
	public String getMacKey(){
		return macKey;
	}
	public void setMacKey(String macKey){
		this.macKey = macKey;
	}

	//���Ʊ�־
	private String controlFlag = " ";
	public String getControlFlag(){
		return controlFlag;
	}
	public void setControlFlag(String controlFlag){
		this.controlFlag = controlFlag;
	}

	//����ʱ��
	private int openTime = 0;
	public int getOpenTime(){
		return openTime;
	}
	public void setOpenTime(int openTime){
		this.openTime = openTime;
	}

	//����ʱ��
	private int closeTime = 0;
	public int getCloseTime(){
		return closeTime;
	}
	public void setCloseTime(int closeTime){
		this.closeTime = closeTime;
	}

	//�����ֶ�1
	private String reserve1 = " ";
	public String getReserve1(){
		return reserve1;
	}
	public void setReserve1(String reserve1){
		this.reserve1 = reserve1;
	}

	//�����ֶ�2
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

