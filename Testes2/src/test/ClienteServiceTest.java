package test;


import br.com.edu.dao.ClienteDao;
import br.com.edu.dao.mock.ClienteDaoMock;
import br.com.edu.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void SalvarTeste() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso", retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoSalvarTeste() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso", retorno);

    }
}






