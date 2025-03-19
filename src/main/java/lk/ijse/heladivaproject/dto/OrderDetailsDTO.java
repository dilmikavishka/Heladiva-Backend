package lk.ijse.heladivaproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailsDTO {
    private Long orderDetailId;
    private Long orderId;
    private Long productId;
    private Integer quantity;
    private Double price;
}

