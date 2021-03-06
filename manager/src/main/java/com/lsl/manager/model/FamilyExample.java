package com.lsl.manager.model;

import java.util.ArrayList;
import java.util.List;

public class FamilyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public FamilyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFolknameIsNull() {
            addCriterion("folkName is null");
            return (Criteria) this;
        }

        public Criteria andFolknameIsNotNull() {
            addCriterion("folkName is not null");
            return (Criteria) this;
        }

        public Criteria andFolknameEqualTo(String value) {
            addCriterion("folkName =", value, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameNotEqualTo(String value) {
            addCriterion("folkName <>", value, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameGreaterThan(String value) {
            addCriterion("folkName >", value, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameGreaterThanOrEqualTo(String value) {
            addCriterion("folkName >=", value, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameLessThan(String value) {
            addCriterion("folkName <", value, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameLessThanOrEqualTo(String value) {
            addCriterion("folkName <=", value, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameLike(String value) {
            addCriterion("folkName like", value, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameNotLike(String value) {
            addCriterion("folkName not like", value, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameIn(List<String> values) {
            addCriterion("folkName in", values, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameNotIn(List<String> values) {
            addCriterion("folkName not in", values, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameBetween(String value1, String value2) {
            addCriterion("folkName between", value1, value2, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolknameNotBetween(String value1, String value2) {
            addCriterion("folkName not between", value1, value2, "folkname");
            return (Criteria) this;
        }

        public Criteria andFolksexIsNull() {
            addCriterion("folkSex is null");
            return (Criteria) this;
        }

        public Criteria andFolksexIsNotNull() {
            addCriterion("folkSex is not null");
            return (Criteria) this;
        }

        public Criteria andFolksexEqualTo(String value) {
            addCriterion("folkSex =", value, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexNotEqualTo(String value) {
            addCriterion("folkSex <>", value, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexGreaterThan(String value) {
            addCriterion("folkSex >", value, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexGreaterThanOrEqualTo(String value) {
            addCriterion("folkSex >=", value, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexLessThan(String value) {
            addCriterion("folkSex <", value, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexLessThanOrEqualTo(String value) {
            addCriterion("folkSex <=", value, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexLike(String value) {
            addCriterion("folkSex like", value, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexNotLike(String value) {
            addCriterion("folkSex not like", value, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexIn(List<String> values) {
            addCriterion("folkSex in", values, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexNotIn(List<String> values) {
            addCriterion("folkSex not in", values, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexBetween(String value1, String value2) {
            addCriterion("folkSex between", value1, value2, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolksexNotBetween(String value1, String value2) {
            addCriterion("folkSex not between", value1, value2, "folksex");
            return (Criteria) this;
        }

        public Criteria andFolkageIsNull() {
            addCriterion("folkAge is null");
            return (Criteria) this;
        }

        public Criteria andFolkageIsNotNull() {
            addCriterion("folkAge is not null");
            return (Criteria) this;
        }

        public Criteria andFolkageEqualTo(String value) {
            addCriterion("folkAge =", value, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageNotEqualTo(String value) {
            addCriterion("folkAge <>", value, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageGreaterThan(String value) {
            addCriterion("folkAge >", value, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageGreaterThanOrEqualTo(String value) {
            addCriterion("folkAge >=", value, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageLessThan(String value) {
            addCriterion("folkAge <", value, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageLessThanOrEqualTo(String value) {
            addCriterion("folkAge <=", value, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageLike(String value) {
            addCriterion("folkAge like", value, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageNotLike(String value) {
            addCriterion("folkAge not like", value, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageIn(List<String> values) {
            addCriterion("folkAge in", values, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageNotIn(List<String> values) {
            addCriterion("folkAge not in", values, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageBetween(String value1, String value2) {
            addCriterion("folkAge between", value1, value2, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkageNotBetween(String value1, String value2) {
            addCriterion("folkAge not between", value1, value2, "folkage");
            return (Criteria) this;
        }

        public Criteria andFolkrelationIsNull() {
            addCriterion("folkRelation is null");
            return (Criteria) this;
        }

        public Criteria andFolkrelationIsNotNull() {
            addCriterion("folkRelation is not null");
            return (Criteria) this;
        }

        public Criteria andFolkrelationEqualTo(String value) {
            addCriterion("folkRelation =", value, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationNotEqualTo(String value) {
            addCriterion("folkRelation <>", value, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationGreaterThan(String value) {
            addCriterion("folkRelation >", value, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationGreaterThanOrEqualTo(String value) {
            addCriterion("folkRelation >=", value, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationLessThan(String value) {
            addCriterion("folkRelation <", value, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationLessThanOrEqualTo(String value) {
            addCriterion("folkRelation <=", value, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationLike(String value) {
            addCriterion("folkRelation like", value, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationNotLike(String value) {
            addCriterion("folkRelation not like", value, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationIn(List<String> values) {
            addCriterion("folkRelation in", values, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationNotIn(List<String> values) {
            addCriterion("folkRelation not in", values, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationBetween(String value1, String value2) {
            addCriterion("folkRelation between", value1, value2, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andFolkrelationNotBetween(String value1, String value2) {
            addCriterion("folkRelation not between", value1, value2, "folkrelation");
            return (Criteria) this;
        }

        public Criteria andSpare1IsNull() {
            addCriterion("spare1 is null");
            return (Criteria) this;
        }

        public Criteria andSpare1IsNotNull() {
            addCriterion("spare1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare1EqualTo(String value) {
            addCriterion("spare1 =", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotEqualTo(String value) {
            addCriterion("spare1 <>", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1GreaterThan(String value) {
            addCriterion("spare1 >", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1GreaterThanOrEqualTo(String value) {
            addCriterion("spare1 >=", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1LessThan(String value) {
            addCriterion("spare1 <", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1LessThanOrEqualTo(String value) {
            addCriterion("spare1 <=", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1Like(String value) {
            addCriterion("spare1 like", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotLike(String value) {
            addCriterion("spare1 not like", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1In(List<String> values) {
            addCriterion("spare1 in", values, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotIn(List<String> values) {
            addCriterion("spare1 not in", values, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1Between(String value1, String value2) {
            addCriterion("spare1 between", value1, value2, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotBetween(String value1, String value2) {
            addCriterion("spare1 not between", value1, value2, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare2IsNull() {
            addCriterion("spare2 is null");
            return (Criteria) this;
        }

        public Criteria andSpare2IsNotNull() {
            addCriterion("spare2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare2EqualTo(String value) {
            addCriterion("spare2 =", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotEqualTo(String value) {
            addCriterion("spare2 <>", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2GreaterThan(String value) {
            addCriterion("spare2 >", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2GreaterThanOrEqualTo(String value) {
            addCriterion("spare2 >=", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2LessThan(String value) {
            addCriterion("spare2 <", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2LessThanOrEqualTo(String value) {
            addCriterion("spare2 <=", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2Like(String value) {
            addCriterion("spare2 like", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotLike(String value) {
            addCriterion("spare2 not like", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2In(List<String> values) {
            addCriterion("spare2 in", values, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotIn(List<String> values) {
            addCriterion("spare2 not in", values, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2Between(String value1, String value2) {
            addCriterion("spare2 between", value1, value2, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotBetween(String value1, String value2) {
            addCriterion("spare2 not between", value1, value2, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare3IsNull() {
            addCriterion("spare3 is null");
            return (Criteria) this;
        }

        public Criteria andSpare3IsNotNull() {
            addCriterion("spare3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare3EqualTo(String value) {
            addCriterion("spare3 =", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotEqualTo(String value) {
            addCriterion("spare3 <>", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3GreaterThan(String value) {
            addCriterion("spare3 >", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3GreaterThanOrEqualTo(String value) {
            addCriterion("spare3 >=", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3LessThan(String value) {
            addCriterion("spare3 <", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3LessThanOrEqualTo(String value) {
            addCriterion("spare3 <=", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3Like(String value) {
            addCriterion("spare3 like", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotLike(String value) {
            addCriterion("spare3 not like", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3In(List<String> values) {
            addCriterion("spare3 in", values, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotIn(List<String> values) {
            addCriterion("spare3 not in", values, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3Between(String value1, String value2) {
            addCriterion("spare3 between", value1, value2, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotBetween(String value1, String value2) {
            addCriterion("spare3 not between", value1, value2, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare4IsNull() {
            addCriterion("spare4 is null");
            return (Criteria) this;
        }

        public Criteria andSpare4IsNotNull() {
            addCriterion("spare4 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare4EqualTo(String value) {
            addCriterion("spare4 =", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4NotEqualTo(String value) {
            addCriterion("spare4 <>", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4GreaterThan(String value) {
            addCriterion("spare4 >", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4GreaterThanOrEqualTo(String value) {
            addCriterion("spare4 >=", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4LessThan(String value) {
            addCriterion("spare4 <", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4LessThanOrEqualTo(String value) {
            addCriterion("spare4 <=", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4Like(String value) {
            addCriterion("spare4 like", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4NotLike(String value) {
            addCriterion("spare4 not like", value, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4In(List<String> values) {
            addCriterion("spare4 in", values, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4NotIn(List<String> values) {
            addCriterion("spare4 not in", values, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4Between(String value1, String value2) {
            addCriterion("spare4 between", value1, value2, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare4NotBetween(String value1, String value2) {
            addCriterion("spare4 not between", value1, value2, "spare4");
            return (Criteria) this;
        }

        public Criteria andSpare5IsNull() {
            addCriterion("spare5 is null");
            return (Criteria) this;
        }

        public Criteria andSpare5IsNotNull() {
            addCriterion("spare5 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare5EqualTo(String value) {
            addCriterion("spare5 =", value, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5NotEqualTo(String value) {
            addCriterion("spare5 <>", value, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5GreaterThan(String value) {
            addCriterion("spare5 >", value, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5GreaterThanOrEqualTo(String value) {
            addCriterion("spare5 >=", value, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5LessThan(String value) {
            addCriterion("spare5 <", value, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5LessThanOrEqualTo(String value) {
            addCriterion("spare5 <=", value, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5Like(String value) {
            addCriterion("spare5 like", value, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5NotLike(String value) {
            addCriterion("spare5 not like", value, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5In(List<String> values) {
            addCriterion("spare5 in", values, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5NotIn(List<String> values) {
            addCriterion("spare5 not in", values, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5Between(String value1, String value2) {
            addCriterion("spare5 between", value1, value2, "spare5");
            return (Criteria) this;
        }

        public Criteria andSpare5NotBetween(String value1, String value2) {
            addCriterion("spare5 not between", value1, value2, "spare5");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table familyTb
     *
     * @mbg.generated do_not_delete_during_merge Fri Jan 17 22:15:00 GMT+08:00 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table familyTb
     *
     * @mbg.generated Fri Jan 17 22:15:00 GMT+08:00 2020
     */
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