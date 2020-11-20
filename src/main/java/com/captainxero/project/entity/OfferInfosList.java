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
@TableName("offer_infos_list")
public class OfferInfosList extends Model<OfferInfosList> {

    private static final long serialVersionUID = 1L;

    /**
     * 消费类别ID
     */
    @TableId("Offer_ID")
    private String offerId;
    /**
     * 消费类别
     */
    @TableField("Offer_Nm")
    private String offerNm;
    /**
     * 卡号
     */
    @TableField("Card_No")
    private String cardNo;
    /**
     * 卡银行与卡别
     */
    @TableField("Bank_Card_Typ")
    private String bankCardTyp;
    /**
     * 卡类型
     */
    @TableField("Card_Typ")
    private String cardTyp;
    /**
     * 静态资源地址
     */
    @TableField("Bank_Logo_Add")
    private String bankLogoAdd;
    /**
     * offer内容
     */
    private String content;
    @TableField("Tail_Number")
    private String tailNumber;


    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferNm() {
        return offerNm;
    }

    public void setOfferNm(String offerNm) {
        this.offerNm = offerNm;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    @Override
    protected Serializable pkVal() {
        return this.offerId;
    }

    @Override
    public String toString() {
        return "OfferInfosList{" +
        "offerId=" + offerId +
        ", offerNm=" + offerNm +
        ", cardNo=" + cardNo +
        ", bankCardTyp=" + bankCardTyp +
        ", cardTyp=" + cardTyp +
        ", bankLogoAdd=" + bankLogoAdd +
        ", content=" + content +
        ", tailNumber=" + tailNumber +
        "}";
    }
}
