package lk.ijse.heladivaproject.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class ArticleDTO {
    private String articleId;
    private String title;
    private String scientificName;
    private String seasonality;
    private String location;
    private String uses;
    private String description;
    private String healthBenefits;
    private String mapCoordinates;
    private String authorId;
    private Date publishedDate;
    private String tags;
    private String ImageUrl;

}
