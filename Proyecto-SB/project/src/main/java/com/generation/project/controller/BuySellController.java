package com.generation.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.generation.project.model.BuySell;
import com.generation.project.service.BuySellService;



@CrossOrigin("*")
@RestController
public class BuySellController {
    private BuySellService buySellService;

    public BuySellController (@Autowired BuySellService buySellService) {
        this.buySellService = buySellService;
    }

    @PostMapping("/buysell/save")
    public void guardarAuto (@RequestBody BuySell buySell) {
        buySellService.saveBuySell(buySell);
    }

    @PutMapping("/buysell/update")
    public void actualizarAuto (@RequestBody BuySell buySell) {
        buySellService.updateBuySell(buySell);
    }

    @GetMapping("/buysell/findAll")
    public List<BuySell> todosLasCompras () {
        return buySellService.findAllCompra();
    }

    @GetMapping("/buysell/buscarMenor/{monto}")
    public List<BuySell> buscarMenor (@PathVariable int monto) {
        return buySellService.encontrarMenor(monto);
    }

    @GetMapping("/buysell/buscarMayor/{monto}")
    public List<BuySell> buscarMayor (@PathVariable int monto) {
        return buySellService.encontrarMayor(monto);
    }

    @DeleteMapping("/buysell/eliminarCompra/{id}")
    public void eliminarCompra (@PathVariable Integer id) {
        buySellService.deleteBuySell(id);
    }
}
