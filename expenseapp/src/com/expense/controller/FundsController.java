package com.expense.controller;

import com.expense.entity.Funds;
import com.expense.service.FundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funds")
public class FundsController {

    @Autowired
    private FundsService fundsService;

    @PostMapping
    public Funds addFunds(@RequestBody Funds funds) {
        return fundsService.addFunds(funds);
    }

    @GetMapping("/{userId}")
    public List<Funds> getFundsByUserId(@PathVariable int userId) {
        return fundsService.getFundsByUserId(userId);
    }

    @DeleteMapping("/{id}")
    public void deleteFunds(@PathVariable int id) {
        fundsService.deleteFunds(id);
    }
}
