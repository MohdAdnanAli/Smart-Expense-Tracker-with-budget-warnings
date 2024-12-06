package com.expense.service;

import com.expense.entity.Wishlist;
import com.expense.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    public Wishlist addWishlistItem(Wishlist wishlist) {
        return wishlistRepository.save(wishlist);
    }

    public List<Wishlist> getWishlistByUserId(int userId) {
        return wishlistRepository.findByUser_UserId(userId);
    }

    public void deleteWishlistItem(int id) {
        wishlistRepository.deleteById(id);
    }
}
