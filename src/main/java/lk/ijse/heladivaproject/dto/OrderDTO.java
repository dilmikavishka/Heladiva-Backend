package lk.ijse.heladivaproject.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class OrderDTO {
    private Long orderId;
    private Long userId;
    private Date orderDate;
    private Double totalPrice;
    private String status;
    private List<OrderDetailsDTO> orderDetails;
}
