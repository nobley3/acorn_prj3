package prj3;

public class AirplaneService {
	
	AirplaneDAO dao = new AirplaneDAO(); 
	
	public AirplaneService() {
		this.dao = new AirplaneDAO();
	}
	
	public boolean login(String inputId, String inputPw) {
		return dao.selectIP(inputId,  inputPw);
		
	}
	//테스트
	public static void main(String[] args) {
		AirplaneService a = new AirplaneService();
		boolean result = a.login("a", "b");
		System.out.println(result);
	}

}
