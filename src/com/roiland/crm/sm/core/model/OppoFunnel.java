/**
 * NewHeight.com Inc.
 * Copyright (c) 2008-2010 All Rights Reserved.
 */
package com.roiland.crm.sm.core.model;

/**
 * <pre>
 * 2.11 销售漏斗统计实体
 * </pre>
 *
 * @author JKim
 * @version $Id: OppoReport.java, v 0.1 2013-6-2 下午10:00:24 cjyy Exp $
 */
public class OppoFunnel {
    private long   recordNum;       //记录数
    private long   revenueNum;      //台数
    private float weightTotalCount; //加权后台数
    private long   firstNum;        //初次接触总数
    private long   needNum;         //弄清需求总数
    private long   displayNum;      //新车展示总数
    private long   driveNum;        //试车总数
    private long   orderNum;        //签订单总数
    private long   priceNum;        //报价总数

    public long getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(long recordNum) {
        this.recordNum = recordNum;
    }

    public long getRevenueNum() {
        return revenueNum;
    }

    public void setRevenueNum(long revenueNum) {
        this.revenueNum = revenueNum;
    }

    public float getWeightTotalCount() {
        return weightTotalCount;
    }

    public void setWeightTotalCount(float weightTotalCount) {
        this.weightTotalCount = weightTotalCount;
    }

    public long getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(long firstNum) {
        this.firstNum = firstNum;
    }

    public long getNeedNum() {
        return needNum;
    }

    public void setNeedNum(long needNum) {
        this.needNum = needNum;
    }

    public long getDisplayNum() {
        return displayNum;
    }

    public void setDisplayNum(long displayNum) {
        this.displayNum = displayNum;
    }

    public long getDriveNum() {
        return driveNum;
    }

    public void setDriveNum(long driveNum) {
        this.driveNum = driveNum;
    }

    public long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(long orderNum) {
        this.orderNum = orderNum;
    }

    public long getPriceNum() {
        return priceNum;
    }

    public void setPriceNum(long priceNum) {
        this.priceNum = priceNum;
    }

}
