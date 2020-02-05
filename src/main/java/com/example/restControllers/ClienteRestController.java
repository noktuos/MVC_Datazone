package com.example.restControllers;

import com.example.models.Cliente;
import com.example.services.ClienteService;
import com.example.utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    @Autowired
    ClienteService clienteservice;

    // INSERT STATEMENT
    @PostMapping(UrlConstants.CLIENTE_AGREGAR)
    public void insertCliente(@RequestBody Cliente cliente){
        clienteservice.save(cliente);
    }
    // UPDATE STATEMENT
    @PutMapping(UrlConstants.CLIENTE_ACTUALIZAR)
    public void actualizarCliente(@RequestBody Cliente cliente, @PathVariable Integer id){
        clienteservice.update(cliente,id);
    }
    //    DELETE STATEMENT
    @DeleteMapping(UrlConstants.CLIENTE_ELIMINAR)
    public void eliminarCliente(Cliente cliente,@PathVariable Integer id){
        clienteservice.deleteById(cliente,id);
    }
    //    LIST ALL
    @GetMapping(UrlConstants.CLIENTE_LISTAR)
    public List<Cliente> listarClientes() throws Exception {
        return clienteservice.findAll();
    }
}
