package cn.scnj.domain;

public class Order {
    private String orderId;
    private String userId;
    private Integer orderMoney;

    public Order() {
    }

    public Order(String orderId, String userId, Integer orderMoney) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderMoney = orderMoney;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", orderMoney=" + orderMoney +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Integer orderMoney) {
        this.orderMoney = orderMoney;
    }
}
