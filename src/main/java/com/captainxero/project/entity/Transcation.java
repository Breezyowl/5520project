package com.captainxero.project.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Dylan
 * @since 2020-11-17
 */
@TableName("transcation")
public class Transcation extends Model<Transcation> {

    private static final long serialVersionUID = 1L;

    /**
     * 客户号
     */
    @TableField("Cust_ID")
    private String custId;
    /**
     * 交易卡号
     */
    @TableId("Card_No")
    private String cardNo;
    /**
     * 交易号
     */
    @TableField("Trx_Id")
    private String trxId;
    /**
     * 交易时间
     */
    @TableField("Trx_Time")
    private String trxTime;
    /**
     * 交易金额
     */
    @TableField("Trx_Amt")
    private BigDecimal trxAmt;
    /**
     * 收入支出类别
     */
    @TableField("Trx_Type")
    private String trxType;
    /**
     * 消费类别
     */
    @TableField("Consume_Type")
    private String consumeType;
    /**
     * 商户名
     */
    @TableField("Mch_Nm")
    private String mchNm;
    /**
     * 商户logo静态资源地址
     */
    @TableField("Consume_Logo_Add")
    private String consumeLogoAdd;


    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public String getTrxTime() {
        return trxTime;
    }

    public void setTrxTime(String trxTime) {
        this.trxTime = trxTime;
    }

    public BigDecimal getTrxAmt() {
        return trxAmt;
    }

    public void setTrxAmt(BigDecimal trxAmt) {
        this.trxAmt = trxAmt;
    }

    public String getTrxType() {
        return trxType;
    }

    public void setTrxType(String trxType) {
        this.trxType = trxType;
    }

    public String getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType;
    }

    public String getMchNm() {
        return mchNm;
    }

    public void setMchNm(String mchNm) {
        this.mchNm = mchNm;
    }

    public String getConsumeLogoAdd() {
        return consumeLogoAdd;
    }

    public void setConsumeLogoAdd(String consumeLogoAdd) {
        this.consumeLogoAdd = consumeLogoAdd;
    }

    @Override
    protected Serializable pkVal() {
        return this.cardNo;
    }

    @Override
    public String toString() {
        return "Transcation{" +
        "custId=" + custId +
        ", cardNo=" + cardNo +
        ", trxId=" + trxId +
        ", trxTime=" + trxTime +
        ", trxAmt=" + trxAmt +
        ", trxType=" + trxType +
        ", consumeType=" + consumeType +
        ", mchNm=" + mchNm +
        ", consumeLogoAdd=" + consumeLogoAdd +
        "}";
    }
}
