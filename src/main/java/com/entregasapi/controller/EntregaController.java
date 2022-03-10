package com.entregasapi.controller;

import com.entregasapi.model.Entrega;
import com.entregasapi.service.EntregaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/entregas")
public class EntregaController {
    private EntregaService entregaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entrega solicitar(@RequestBody Entrega entrega) {
        return entregaService.solicitar(entrega);
    }


}
