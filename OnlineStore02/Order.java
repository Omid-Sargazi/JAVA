package OnlineStore02;

import java.util.List;
import java.util.Date;

public class Order {
    private String orderId;
    private Customer customer; // Association
    private Date orderDate;
    private double totalAmount;
    private String status;
    private List<OrderItem> orderItems;

    public Order(String orderId, Customer customer, Date orderDate, double totalAmount, String status,
            List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
        this.orderItems = orderItems;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", customer=" + customer + ", orderDate=" + orderDate + ", totalAmount="
                + totalAmount + ", status=" + status + ", orderItems=" + orderItems + ", getOrderId()=" + getOrderId()
                + ", getCustomer()=" + getCustomer() + ", getOrderDate()=" + getOrderDate() + ", getTotalAmount()="
                + getTotalAmount() + ", getStatus()=" + getStatus() + ", getOrderItems()=" + getOrderItems()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
}
