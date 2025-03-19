package lk.ijse.heladivaproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    private String orderId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private Date orderDate;
    private Double totalPrice;
    private String status;
}
