package com.captainxero.project.entity;

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
 * @since 2020-11-20
 */
@TableName("card_infos")
public class CardInfos extends Model<CardInfos> {

    private static final long serialVersionUID = 1L;

    /**
     * 客户号
     */
    @TableId("Cust_ID")
    private String custId;
    /**
     * 卡号
     */
    @TableField("Card_No")
    private String cardNo;
    /**
     * 卡序号:第几张卡
     */
    @TableField("Card_Seq")
    private Integer cardSeq;
    /**
     * 卡的银行与卡别:如:HSBC Master Card
     */
    @TableField("Bank_Card_Typ")
    private String bankCardTyp;
    /**
     * 卡类型：Credit:信用卡;Debit:借记卡
     */
    @TableField("Card_Typ")
    private String cardTyp;
    /**
     * 静态资源地址
     */
    @TableField("Bank_Logo_Add")
    private String bankLogoAdd;
    @TableField("Tail_Number")
    private String tailNumber;


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

    public Integer getCardSeq() {
        return cardSeq;
    }

    public void setCardSeq(Integer cardSeq) {
        this.cardSeq = cardSeq;
    }

    public String getBankCardTyp() {
        return bankCardTyp;
    }

    public void setBankCardTyp(String bankCardTyp) {
        this.bankCardTyp = bankCardTyp;
    }

    public String getCardTyp() {
        return cardTyp;
    }

    public void setCardTyp(String cardTyp) {
        this.cardTyp = cardTyp;
    }

    public String getBankLogoAdd() {
        return bankLogoAdd;
    }

    public void setBankLogoAdd(String bankLogoAdd) {
        this.bankLogoAdd = bankLogoAdd;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    @Override
    protected Serializable pkVal() {
        return this.custId;
    }

    @Override
    public String toString() {
        return "CardInfos{" +
        "custId=" + custId +
        ", cardNo=" + cardNo +
        ", cardSeq=" + cardSeq +
        ", bankCardTyp=" + bankCardTyp +
        ", cardTyp=" + cardTyp +
        ", bankLogoAdd=" + bankLogoAdd +
        ", tailNumber=" + tailNumber +
        "}";
    }
}
