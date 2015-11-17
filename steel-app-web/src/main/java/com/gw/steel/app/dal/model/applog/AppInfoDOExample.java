package com.gw.steel.app.dal.model.applog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppInfoDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppInfoDOExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("APP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("APP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("APP_NAME =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("APP_NAME <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("APP_NAME >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("APP_NAME >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("APP_NAME <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("APP_NAME <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("APP_NAME like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("APP_NAME not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("APP_NAME in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("APP_NAME not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("APP_NAME between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("APP_NAME not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNull() {
            addCriterion("CONTACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNotNull() {
            addCriterion("CONTACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContactTypeEqualTo(String value) {
            addCriterion("CONTACT_TYPE =", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotEqualTo(String value) {
            addCriterion("CONTACT_TYPE <>", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThan(String value) {
            addCriterion("CONTACT_TYPE >", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_TYPE >=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThan(String value) {
            addCriterion("CONTACT_TYPE <", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_TYPE <=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLike(String value) {
            addCriterion("CONTACT_TYPE like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotLike(String value) {
            addCriterion("CONTACT_TYPE not like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeIn(List<String> values) {
            addCriterion("CONTACT_TYPE in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotIn(List<String> values) {
            addCriterion("CONTACT_TYPE not in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeBetween(String value1, String value2) {
            addCriterion("CONTACT_TYPE between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotBetween(String value1, String value2) {
            addCriterion("CONTACT_TYPE not between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactInfoIsNull() {
            addCriterion("CONTACT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andContactInfoIsNotNull() {
            addCriterion("CONTACT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andContactInfoEqualTo(String value) {
            addCriterion("CONTACT_INFO =", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotEqualTo(String value) {
            addCriterion("CONTACT_INFO <>", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoGreaterThan(String value) {
            addCriterion("CONTACT_INFO >", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_INFO >=", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLessThan(String value) {
            addCriterion("CONTACT_INFO <", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_INFO <=", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLike(String value) {
            addCriterion("CONTACT_INFO like", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotLike(String value) {
            addCriterion("CONTACT_INFO not like", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoIn(List<String> values) {
            addCriterion("CONTACT_INFO in", values, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotIn(List<String> values) {
            addCriterion("CONTACT_INFO not in", values, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoBetween(String value1, String value2) {
            addCriterion("CONTACT_INFO between", value1, value2, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotBetween(String value1, String value2) {
            addCriterion("CONTACT_INFO not between", value1, value2, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("SUBJECT =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("SUBJECT <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("SUBJECT >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("SUBJECT <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("SUBJECT like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("SUBJECT not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("SUBJECT in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("SUBJECT not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("SUBJECT between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("SUBJECT not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeIsNull() {
            addCriterion("RECORD_CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeIsNotNull() {
            addCriterion("RECORD_CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeEqualTo(Date value) {
            addCriterion("RECORD_CRT_TIME =", value, "recordCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeNotEqualTo(Date value) {
            addCriterion("RECORD_CRT_TIME <>", value, "recordCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeGreaterThan(Date value) {
            addCriterion("RECORD_CRT_TIME >", value, "recordCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECORD_CRT_TIME >=", value, "recordCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeLessThan(Date value) {
            addCriterion("RECORD_CRT_TIME <", value, "recordCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECORD_CRT_TIME <=", value, "recordCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeIn(List<Date> values) {
            addCriterion("RECORD_CRT_TIME in", values, "recordCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeNotIn(List<Date> values) {
            addCriterion("RECORD_CRT_TIME not in", values, "recordCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeBetween(Date value1, Date value2) {
            addCriterion("RECORD_CRT_TIME between", value1, value2, "recordCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecordCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECORD_CRT_TIME not between", value1, value2, "recordCrtTime");
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