package test;



import br.com.edu.dao.ContratoDao;
import br.com.edu.dao.IContratoDao;
import br.com.edu.dao.mock.ContratoDaoMock;
import br.com.edu.service.ContratoService;
import br.com.edu.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void SalvarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("sucesso", retorno);
    }

        @Test
        public void buscarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
            String retorno = service.buscar();
            Assert.assertEquals("Cliente encontrado", retorno);
        }
        @Test
        public void excluirTest () {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
            String retorno = service.excluir();
            Assert.assertEquals("Cliente excluido com sucesso", retorno);
        }
        @Test
        public void atualizarTest () {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
            int retorno = service.atualizar();
            Assert.assertEquals(1000, retorno);

        }

    }
