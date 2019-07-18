package com.dayuarchi.tool.mybatisgenerator.model;

import java.io.Serializable;
import java.util.Date;

public class TpTradeRate implements Serializable {
    private Integer id;

    private Byte channel;

    private Integer bankId;

    private String bankFlag;

    private String tradeFlag;

    private String rateType;

    private String fixrate;

    private String percentRate;

    private String summaryPercentRate;

    private Boolean needSummaryRate;

    private Date createTime;

    private Boolean isDeprecated;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getChannel() {
        return channel;
    }

    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankFlag() {
        return bankFlag;
    }

    public void setBankFlag(String bankFlag) {
        this.bankFlag = bankFlag == null ? null : bankFlag.trim();
    }

    public String getTradeFlag() {
        return tradeFlag;
    }

    public void setTradeFlag(String tradeFlag) {
        this.tradeFlag = tradeFlag == null ? null : tradeFlag.trim();
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType == null ? null : rateType.trim();
    }

    public String getFixrate() {
        return fixrate;
    }

    public void setFixrate(String fixrate) {
        this.fixrate = fixrate == null ? null : fixrate.trim();
    }

    public String getPercentRate() {
        return percentRate;
    }

    public void setPercentRate(String percentRate) {
        this.percentRate = percentRate == null ? null : percentRate.trim();
    }

    public String getSummaryPercentRate() {
        return summaryPercentRate;
    }

    public void setSummaryPercentRate(String summaryPercentRate) {
        this.summaryPercentRate = summaryPercentRate == null ? null : summaryPercentRate.trim();
    }

    public Boolean getNeedSummaryRate() {
        return needSummaryRate;
    }

    public void setNeedSummaryRate(Boolean needSummaryRate) {
        this.needSummaryRate = needSummaryRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsDeprecated() {
        return isDeprecated;
    }

    public void setIsDeprecated(Boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", channel=").append(channel);
        sb.append(", bankId=").append(bankId);
        sb.append(", bankFlag=").append(bankFlag);
        sb.append(", tradeFlag=").append(tradeFlag);
        sb.append(", rateType=").append(rateType);
        sb.append(", fixrate=").append(fixrate);
        sb.append(", percentRate=").append(percentRate);
        sb.append(", summaryPercentRate=").append(summaryPercentRate);
        sb.append(", needSummaryRate=").append(needSummaryRate);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDeprecated=").append(isDeprecated);
        sb.append("]");
        return sb.toString();
    }
}