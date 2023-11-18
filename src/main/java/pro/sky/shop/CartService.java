package pro.sky.shop;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class CartService {
    private final List<Integer> cartItems;

    public CartService() {
        this.cartItems = new ArrayList<>();
    }

    public void addItemToCart(int[] itemIds) {
        for (int itemId : itemIds) {
            cartItems.add(itemId);
        }
    }

    public int[] getCartItems() {
        return cartItems.stream().mapToInt(Integer::intValue).toArray();
    }
}