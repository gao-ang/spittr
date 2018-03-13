package com.gasyz.spittr.domain;

public class SpitterOrder {
    private Long id;
    private String email;
    private String orderName;

    public SpitterOrder(Long id, String email, String orderName) {
        this.id = id;
        this.email = email;
        this.orderName = orderName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
