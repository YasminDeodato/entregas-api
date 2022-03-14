package com.entregasapi.service;

import com.entregasapi.model.Cliente;
import com.entregasapi.model.Entrega;
import com.entregasapi.model.StatusEntrega;
import com.entregasapi.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;

@AllArgsConstructor
@Service
public class EntregaService {

    private EntregaRepository entregaRepository;
    private ClienteService clienteService;

    @Transactional
    public Entrega solicitar(Entrega entrega) {
        Cliente cliente = clienteService.buscar(entrega.getCliente().getId());

        entrega.setCliente(cliente);
        entrega.setStatus(StatusEntrega.PENDENTE);
        entrega.setDataPedido(OffsetDateTime.now());

        return entregaRepository.save(entrega);
    }

}
