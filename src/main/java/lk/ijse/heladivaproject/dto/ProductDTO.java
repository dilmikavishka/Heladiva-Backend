package lk.ijse.heladivaproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private String productId;
    private String name;
    private String scientificName;
    private String seasonality;
    private String location;
    private String uses;
    private String description;
    private String type;
    private String healthBenefits;
    private String mapCoordinates;
    private Double price;
    private Integer stockAvailability;
    private String ImageUrl;
}
