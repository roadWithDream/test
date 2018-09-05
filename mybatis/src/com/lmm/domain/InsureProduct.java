/********************************************
* �ļ�����: InsureProduct.java
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

public class InsureProduct{
	//��Ʒ����
	private String prdCode = " ";
	public String getPrdCode(){
		return prdCode;
	}
	public void setPrdCode(String prdCode){
		this.prdCode = prdCode;
	}

	//��˾����
	private String taCode = " ";
	public String getTaCode(){
		return taCode;
	}
	public void setTaCode(String taCode){
		this.taCode = taCode;
	}

	//��Ʒ����
	private String prdName = " ";
	public String getPrdName(){
		return prdName;
	}
	public void setPrdName(String prdName){
		this.prdName = prdName;
	}

	//��Ʒ����2
	private String prdName2 = " ";
	public String getPrdName2(){
		return prdName2;
	}
	public void setPrdName2(String prdName2){
		this.prdName2 = prdName2;
	}

	//��Ʒ����
	private String prdType = " ";
	public String getPrdType(){
		return prdType;
	}
	public void setPrdType(String prdType){
		this.prdType = prdType;
	}

	//��Ʒ������
	private String prdSubType = " ";
	public String getPrdSubType(){
		return prdSubType;
	}
	public void setPrdSubType(String prdSubType){
		this.prdSubType = prdSubType;
	}

	//��ƷӦ�ñ�ʶ
	private String prdBusinFlag = " ";
	public String getPrdBusinFlag(){
		return prdBusinFlag;
	}
	public void setPrdBusinFlag(String prdBusinFlag){
		this.prdBusinFlag = prdBusinFlag;
	}

	//��Ʒ׼��״̬
	private String prdLimitFlag = " ";
	public String getPrdLimitFlag(){
		return prdLimitFlag;
	}
	public void setPrdLimitFlag(String prdLimitFlag){
		this.prdLimitFlag = prdLimitFlag;
	}

	//���ױ���
	private String currType = " ";
	public String getCurrType(){
		return currType;
	}
	public void setCurrType(String currType){
		this.currType = currType;
	}

	//�Ƿ�����
	private String onlineFlag = " ";
	public String getOnlineFlag(){
		return onlineFlag;
	}
	public void setOnlineFlag(String onlineFlag){
		this.onlineFlag = onlineFlag;
	}

	//��Լ��ʼ����
	private int beginDate = 0;
	public int getBeginDate(){
		return beginDate;
	}
	public void setBeginDate(int beginDate){
		this.beginDate = beginDate;
	}

	//��Լ��������
	private int endDate = 0;
	public int getEndDate(){
		return endDate;
	}
	public void setEndDate(int endDate){
		this.endDate = endDate;
	}

	//���޸����ձ�־
	private String prdAddFlag = " ";
	public String getPrdAddFlag(){
		return prdAddFlag;
	}
	public void setPrdAddFlag(String prdAddFlag){
		this.prdAddFlag = prdAddFlag;
	}

	//���չ�˾��Ʒ����
	private String targPrdCode = " ";
	public String getTargPrdCode(){
		return targPrdCode;
	}
	public void setTargPrdCode(String targPrdCode){
		this.targPrdCode = targPrdCode;
	}

	//��ԥ������
	private int waverDays = 0;
	public int getWaverDays(){
		return waverDays;
	}
	public void setWaverDays(int waverDays){
		this.waverDays = waverDays;
	}

	//������������������
	private double masterAgiorate = 0.0;
	public double getMasterAgiorate(){
		return masterAgiorate;
	}
	public void setMasterAgiorate(double masterAgiorate){
		this.masterAgiorate = masterAgiorate;
	}

	//�˱���ʽ
	private String checkType = " ";
	public String getCheckType(){
		return checkType;
	}
	public void setCheckType(String checkType){
		this.checkType = checkType;
	}

	//���Ʊ�־
	private String controlFlag = " ";
	public String getControlFlag(){
		return controlFlag;
	}
	public void setControlFlag(String controlFlag){
		this.controlFlag = controlFlag;
	}
	
	//������С���ѽ��
	private double pminAmt = 0.0;
	public double getPminAmt(){
		return pminAmt;
	}
	public void setPminAmt(double pminAmt){
		this.pminAmt = pminAmt;
	}
	
	//������С���ѽ��
	private double ominAmt = 0.0;
	public double getOminAmt(){
		return ominAmt;
	}
	public void setOminAmt(double ominAmt){
		this.ominAmt = ominAmt;
	}
	
	//������󱣷ѽ��
	private double pmaxAmt = 0.0;
	public double getPmaxAmt(){
		return pmaxAmt;
	}
	public void setPmaxAmt(double pmaxAmt){
		this.pmaxAmt = pmaxAmt;
	}
	
	//������󱣷ѽ��
	private double omaxAmt = 0.0;
	public double getOmaxAmt(){
		return omaxAmt;
	}
	public void setOmaxAmt(double omaxAmt){
		this.omaxAmt = omaxAmt;
	}
	
	//������С���ѵ�λ
	private double punitAmt = 0.0;
	public double getPunitAmt(){
		return punitAmt;
	}
	public void setPunitAmt(double punitAmt){
		this.punitAmt = punitAmt;
	}
	
	//������С���ѵ�λ
	private double ounitAmt = 0.0;
	public double getOunitAmt(){
		return ounitAmt;
	}
	public void setOunitAmt(double ounitAmt){
		this.ounitAmt = ounitAmt;
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

	//�����ֶ�3
	private String reserve3 = " ";
	public String getReserve3(){
		return reserve3;
	}
	public void setReserve3(String reserve3){
		this.reserve3 = reserve3;
	}

	//�����ֶ�4
	private String reserve4 = " ";
	public String getReserve4(){
		return reserve4;
	}
	public void setReserve4(String reserve4){
		this.reserve4 = reserve4;
	}
	
	//�������1
	private double amt1 = 0.0;
	public double getAmt1(){
		return amt1;
	}
	public void setAmt1(double amt1){
		this.amt1 = amt1;
	}
	
	//�������2
	private double amt2 = 0.0;
	public double getAmt2(){
		return amt2;
	}
	public void setAmt2(double amt2){
		this.amt2 = amt2;
	}
	
	//�������3
	private double amt3 = 0.0;
	public double getAmt3(){
		return amt3;
	}
	public void setAmt3(double amt3){
		this.amt3 = amt3;
	}


}
