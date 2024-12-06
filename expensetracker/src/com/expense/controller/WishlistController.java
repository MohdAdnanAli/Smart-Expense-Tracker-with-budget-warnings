package com.expense.controller;

import com.expense.entity.Wishlist;
import com.expense.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @PostMapping
    public Wishlist addWishlistItem(@RequestBody Wishlist wishlist) {
        return wishlistService.addWishlistItem(wishlist);
    }

    @GetMapping("/{userId}")
    public List<Wishlist> getWishlistByUserId(@PathVariable int userId) {
        return wishlistService.getWishlistByUserId(userId);
    }

    @DeleteMapping("/{id}")
    public void deleteWishlistItem(@PathVariable int id) {
        wishlistService.deleteWishlistItem(id);
    }
}
