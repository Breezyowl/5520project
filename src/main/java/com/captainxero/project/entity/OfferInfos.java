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
 * @since 2020-11-19
 */
@TableName("offer_infos")
public class OfferInfos extends Model<OfferInfos> {

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
     * 启用标志
     */
    @TableField("Open_Ind")
    private Integer openInd;
    /**
     * 静态资源地址
     */
    @TableField("Offer_Logo_Add")
    private String offerLogoAdd;
    /**
     * 内容
     */
    private String content;
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

    public Integer getOpenInd() {
        return openInd;
    }

    public void setOpenInd(Integer openInd) {
        this.openInd = openInd;
    }

    public String getOfferLogoAdd() {
        return offerLogoAdd;
    }

    public void setOfferLogoAdd(String offerLogoAdd) {
        this.offerLogoAdd = offerLogoAdd;
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
        return "OfferInfos{" +
        "offerId=" + offerId +
        ", offerNm=" + offerNm +
        ", cardNo=" + cardNo +
        ", openInd=" + openInd +
        ", offerLogoAdd=" + offerLogoAdd +
        ", content=" + content +
        ", tailNumber=" + tailNumber +
        "}";
    }
}
