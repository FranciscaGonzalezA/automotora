package com.generation.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.project.model.BuySell;
import com.generation.project.repository.BuySellRepository;

@Service
@Transactional
public class BuySellService {
    
    private BuySellRepository buySellRepository;

    public BuySellService (BuySellRepository buySellRepository) {
        this.buySellRepository = buySellRepository;
    }
    
    public void saveBuySell (BuySell buySell) {
        buySellRepository.save(buySell);
    }

    public void updateBuySell (BuySell buySell) {
        buySellRepository.save(buySell);
    }

    public List<BuySell> findAllCompra () {
        return buySellRepository.findAll();
    }

    public List<BuySell> encontrarMenor (int monto) {
        return buySellRepository.findLowerAmount(monto);
    }

    public List<BuySell> encontrarMayor (int monto) {
        return buySellRepository.findUpperAmount(monto);
    }

    public void deleteBuySell (Integer id) {
        buySellRepository.deleteById(id);
    }
}
