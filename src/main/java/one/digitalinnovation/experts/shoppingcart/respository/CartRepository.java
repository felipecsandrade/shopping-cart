package one.digitalinnovation.experts.shoppingcart.respository;

import one.digitalinnovation.experts.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
