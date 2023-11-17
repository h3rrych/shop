package pro.sky.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class Controller {
    private final CartService cartService;

    @Autowired
    public Controller(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/order/add")
    public void addItemToCart(@RequestParam int[] itemIds) {
        cartService.addItemToCart(itemIds);
    }

    @GetMapping("/order/get")
    public int[] getCartItems() {
        return cartService.getCartItems();
    }
}