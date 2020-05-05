import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.exception.model.GameModel;
import br.com.exception.repository.GameRepository;
import br.com.exception.service.GameService;

class RepositoryTest {
	
	public GameService service = new GameService();
	
	@Test
	public void getById() {
		int id = 1;
		int recebido = service.getById(id).getId();
		assertEquals(recebido,id);
		
	}
}
