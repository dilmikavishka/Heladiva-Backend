package lk.ijse.heladivaproject.util;


import lk.ijse.heladivaproject.dto.ArticleDTO;
import lk.ijse.heladivaproject.dto.ProductDTO;
import lk.ijse.heladivaproject.dto.UserDTO;
import lk.ijse.heladivaproject.entity.Article;
import lk.ijse.heladivaproject.entity.Product;
import lk.ijse.heladivaproject.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Mapping {
    private final ModelMapper mapper;
    public UserDTO toUserDTO(User user) {
        return  mapper.map(user, UserDTO.class);
    }
    public User toUser(UserDTO userDTO) {
        return  mapper.map(userDTO, User.class);
    }
    public Collection<UserDTO> toUserDTOs(List<User> all) {
        return mapper.map(all, Collection.class);
    }

    public ArticleDTO toArticleDTO(Article article){return mapper.map(article,ArticleDTO.class);}
    public Article toArticle(ArticleDTO articleDTO){return  mapper.map(articleDTO,Article.class);}
    public List<ArticleDTO> toArticleDTOS(List<Article> all) {
        return all.stream().map(this::toArticleDTO).collect(Collectors.toList());
    }


    public ProductDTO toProductDTO(Product product){return mapper.map(product,ProductDTO.class);}
    public Product toProduct(ProductDTO productDTO){return  mapper.map(productDTO,Product.class);}
    public List<ProductDTO> toProductDTOS(List<Product> all) {
        return all.stream().map(this::toProductDTO).collect(Collectors.toList());
    }

}
