package one.digitalinnovation.experts.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Integer productId;
    private Integer amount;
}
