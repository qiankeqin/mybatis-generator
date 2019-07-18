package com.dayuarchi.tool.mybatisgenerator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TpTradeRateCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TpTradeRateCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Byte value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Byte value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Byte value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Byte value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Byte value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Byte> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Byte> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Byte value1, Byte value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankFlagIsNull() {
            addCriterion("bank_flag is null");
            return (Criteria) this;
        }

        public Criteria andBankFlagIsNotNull() {
            addCriterion("bank_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBankFlagEqualTo(String value) {
            addCriterion("bank_flag =", value, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagNotEqualTo(String value) {
            addCriterion("bank_flag <>", value, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagGreaterThan(String value) {
            addCriterion("bank_flag >", value, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagGreaterThanOrEqualTo(String value) {
            addCriterion("bank_flag >=", value, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagLessThan(String value) {
            addCriterion("bank_flag <", value, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagLessThanOrEqualTo(String value) {
            addCriterion("bank_flag <=", value, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagLike(String value) {
            addCriterion("bank_flag like", value, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagNotLike(String value) {
            addCriterion("bank_flag not like", value, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagIn(List<String> values) {
            addCriterion("bank_flag in", values, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagNotIn(List<String> values) {
            addCriterion("bank_flag not in", values, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagBetween(String value1, String value2) {
            addCriterion("bank_flag between", value1, value2, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andBankFlagNotBetween(String value1, String value2) {
            addCriterion("bank_flag not between", value1, value2, "bankFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagIsNull() {
            addCriterion("trade_flag is null");
            return (Criteria) this;
        }

        public Criteria andTradeFlagIsNotNull() {
            addCriterion("trade_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTradeFlagEqualTo(String value) {
            addCriterion("trade_flag =", value, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagNotEqualTo(String value) {
            addCriterion("trade_flag <>", value, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagGreaterThan(String value) {
            addCriterion("trade_flag >", value, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("trade_flag >=", value, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagLessThan(String value) {
            addCriterion("trade_flag <", value, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagLessThanOrEqualTo(String value) {
            addCriterion("trade_flag <=", value, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagLike(String value) {
            addCriterion("trade_flag like", value, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagNotLike(String value) {
            addCriterion("trade_flag not like", value, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagIn(List<String> values) {
            addCriterion("trade_flag in", values, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagNotIn(List<String> values) {
            addCriterion("trade_flag not in", values, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagBetween(String value1, String value2) {
            addCriterion("trade_flag between", value1, value2, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andTradeFlagNotBetween(String value1, String value2) {
            addCriterion("trade_flag not between", value1, value2, "tradeFlag");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNull() {
            addCriterion("rate_type is null");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNotNull() {
            addCriterion("rate_type is not null");
            return (Criteria) this;
        }

        public Criteria andRateTypeEqualTo(String value) {
            addCriterion("rate_type =", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotEqualTo(String value) {
            addCriterion("rate_type <>", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThan(String value) {
            addCriterion("rate_type >", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rate_type >=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThan(String value) {
            addCriterion("rate_type <", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThanOrEqualTo(String value) {
            addCriterion("rate_type <=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLike(String value) {
            addCriterion("rate_type like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotLike(String value) {
            addCriterion("rate_type not like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeIn(List<String> values) {
            addCriterion("rate_type in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotIn(List<String> values) {
            addCriterion("rate_type not in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeBetween(String value1, String value2) {
            addCriterion("rate_type between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotBetween(String value1, String value2) {
            addCriterion("rate_type not between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andFixrateIsNull() {
            addCriterion("fixRate is null");
            return (Criteria) this;
        }

        public Criteria andFixrateIsNotNull() {
            addCriterion("fixRate is not null");
            return (Criteria) this;
        }

        public Criteria andFixrateEqualTo(String value) {
            addCriterion("fixRate =", value, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateNotEqualTo(String value) {
            addCriterion("fixRate <>", value, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateGreaterThan(String value) {
            addCriterion("fixRate >", value, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateGreaterThanOrEqualTo(String value) {
            addCriterion("fixRate >=", value, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateLessThan(String value) {
            addCriterion("fixRate <", value, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateLessThanOrEqualTo(String value) {
            addCriterion("fixRate <=", value, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateLike(String value) {
            addCriterion("fixRate like", value, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateNotLike(String value) {
            addCriterion("fixRate not like", value, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateIn(List<String> values) {
            addCriterion("fixRate in", values, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateNotIn(List<String> values) {
            addCriterion("fixRate not in", values, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateBetween(String value1, String value2) {
            addCriterion("fixRate between", value1, value2, "fixrate");
            return (Criteria) this;
        }

        public Criteria andFixrateNotBetween(String value1, String value2) {
            addCriterion("fixRate not between", value1, value2, "fixrate");
            return (Criteria) this;
        }

        public Criteria andPercentRateIsNull() {
            addCriterion("percent_rate is null");
            return (Criteria) this;
        }

        public Criteria andPercentRateIsNotNull() {
            addCriterion("percent_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPercentRateEqualTo(String value) {
            addCriterion("percent_rate =", value, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateNotEqualTo(String value) {
            addCriterion("percent_rate <>", value, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateGreaterThan(String value) {
            addCriterion("percent_rate >", value, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateGreaterThanOrEqualTo(String value) {
            addCriterion("percent_rate >=", value, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateLessThan(String value) {
            addCriterion("percent_rate <", value, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateLessThanOrEqualTo(String value) {
            addCriterion("percent_rate <=", value, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateLike(String value) {
            addCriterion("percent_rate like", value, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateNotLike(String value) {
            addCriterion("percent_rate not like", value, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateIn(List<String> values) {
            addCriterion("percent_rate in", values, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateNotIn(List<String> values) {
            addCriterion("percent_rate not in", values, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateBetween(String value1, String value2) {
            addCriterion("percent_rate between", value1, value2, "percentRate");
            return (Criteria) this;
        }

        public Criteria andPercentRateNotBetween(String value1, String value2) {
            addCriterion("percent_rate not between", value1, value2, "percentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateIsNull() {
            addCriterion("summary_percent_rate is null");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateIsNotNull() {
            addCriterion("summary_percent_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateEqualTo(String value) {
            addCriterion("summary_percent_rate =", value, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateNotEqualTo(String value) {
            addCriterion("summary_percent_rate <>", value, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateGreaterThan(String value) {
            addCriterion("summary_percent_rate >", value, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateGreaterThanOrEqualTo(String value) {
            addCriterion("summary_percent_rate >=", value, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateLessThan(String value) {
            addCriterion("summary_percent_rate <", value, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateLessThanOrEqualTo(String value) {
            addCriterion("summary_percent_rate <=", value, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateLike(String value) {
            addCriterion("summary_percent_rate like", value, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateNotLike(String value) {
            addCriterion("summary_percent_rate not like", value, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateIn(List<String> values) {
            addCriterion("summary_percent_rate in", values, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateNotIn(List<String> values) {
            addCriterion("summary_percent_rate not in", values, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateBetween(String value1, String value2) {
            addCriterion("summary_percent_rate between", value1, value2, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andSummaryPercentRateNotBetween(String value1, String value2) {
            addCriterion("summary_percent_rate not between", value1, value2, "summaryPercentRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateIsNull() {
            addCriterion("need_summary_rate is null");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateIsNotNull() {
            addCriterion("need_summary_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateEqualTo(Boolean value) {
            addCriterion("need_summary_rate =", value, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateNotEqualTo(Boolean value) {
            addCriterion("need_summary_rate <>", value, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateGreaterThan(Boolean value) {
            addCriterion("need_summary_rate >", value, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("need_summary_rate >=", value, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateLessThan(Boolean value) {
            addCriterion("need_summary_rate <", value, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateLessThanOrEqualTo(Boolean value) {
            addCriterion("need_summary_rate <=", value, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateIn(List<Boolean> values) {
            addCriterion("need_summary_rate in", values, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateNotIn(List<Boolean> values) {
            addCriterion("need_summary_rate not in", values, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateBetween(Boolean value1, Boolean value2) {
            addCriterion("need_summary_rate between", value1, value2, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andNeedSummaryRateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("need_summary_rate not between", value1, value2, "needSummaryRate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedIsNull() {
            addCriterion("is_deprecated is null");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedIsNotNull() {
            addCriterion("is_deprecated is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedEqualTo(Boolean value) {
            addCriterion("is_deprecated =", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedNotEqualTo(Boolean value) {
            addCriterion("is_deprecated <>", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedGreaterThan(Boolean value) {
            addCriterion("is_deprecated >", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deprecated >=", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedLessThan(Boolean value) {
            addCriterion("is_deprecated <", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deprecated <=", value, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedIn(List<Boolean> values) {
            addCriterion("is_deprecated in", values, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedNotIn(List<Boolean> values) {
            addCriterion("is_deprecated not in", values, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deprecated between", value1, value2, "isDeprecated");
            return (Criteria) this;
        }

        public Criteria andIsDeprecatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deprecated not between", value1, value2, "isDeprecated");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}