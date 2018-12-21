package com.app.zzm.card_slave.entity;

public class userItem {
    // id
    private Long id;

    // 账单名称
    private String name ;

    // 是否为分期
    private Boolean isDevide;

    // 分期数
    private Integer periodsNumber;

    // 每期钱数
    private Double money;

    // 开始年月
    private Long startYYYYmm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDevide() {
        return isDevide;
    }

    public void setDevide(Boolean devide) {
        isDevide = devide;
    }

    public Integer getPeriodsNumber() {
        return periodsNumber;
    }

    public void setPeriodsNumber(Integer periodsNumber) {
        this.periodsNumber = periodsNumber;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Long getStartYYYYmm() {
        return startYYYYmm;
    }

    public void setStartYYYYmm(Long startYYYYmm) {
        this.startYYYYmm = startYYYYmm;
    }
}
