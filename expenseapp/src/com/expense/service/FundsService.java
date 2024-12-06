package com.expense.service;

import com.expense.entity.Funds;
import com.expense.repository.FundsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundsService {

    @Autowired
    private FundsRepository fundsRepository;

    public Funds addFunds(Funds funds) {
        return fundsRepository.save(funds);
    }

    public List<Funds> getFundsByUserId(int userId) {
        return fundsRepository.findByUser_UserId(userId);
    }

    public void deleteFunds(int id) {
        fundsRepository.deleteById(id);
    }
}
