package br.edu.iftm.ds.exemplos.arquitetura.Control;




   import java.util.List;




   import org.springframework.beans.factory.annotation.Autowired;
   import org.springframework.web.bind.annotation.RestController;


   import br.edu.iftm.ds.exemplos.arquitetura.dao.ClienteDao;
   import br.edu.iftm.ds.exemplos.arquitetura.domain.Cliente;




   import org.springframework.web.bind.annotation.GetMapping;




   @RestController
     public class ClienteControl {




        @Autowired
        private ClienteDao ClienteDao;








        @GetMapping("/cliente")
         public List<Cliente> getAllClientes() {
             return ClienteDao.getClientes();
         }
     }
