package br.edu.iftm.ds.exemplos.arquitetura.dao;




import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


import org.springframework.stereotype.Component;


import br.edu.iftm.ds.exemplos.arquitetura.domain.Cliente;




@Component
public class ClienteDao {




    private List<Cliente> clientes = new ArrayList<>(
        Arrays.asList(new Cliente(1,"Codigo"),
                         new Cliente(2,"Nome")
    ));
    public List<Cliente> getClientes() {
        return clientes;
    }




   
}
