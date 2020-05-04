import java.util.List;

import br.com.exception.model.GameModel;
import br.com.exception.repository.GameRepository;
import br.com.exception.service.GameService;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameService service = new GameService();
		List<GameModel> gameList = service.getAll();
		System.out.println(gameList);
	}

}
