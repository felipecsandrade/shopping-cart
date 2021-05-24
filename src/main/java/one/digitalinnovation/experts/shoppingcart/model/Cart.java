package one.digitalinnovation.experts.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("cart")
public class Cart {

    private Integer id;
    private List<Item> itens;

    public Cart(Integer id){
        this.id = id;
    }

    public List<Item> getItens(){
        if(itens == null){
            itens = new ArrayList<>();
        }
        return itens;
    }

}
