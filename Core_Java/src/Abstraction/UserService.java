package Abstraction;

public interface UserService extends CommonService {
	
	//int max=700;

	void addUser();
	void deleteUser();
	
	default void update() {	
		//self(Afno afno) implementation in impl.class
	}
	
	static void getUser() {
		//common(yei nai hunxa sabailai) impl. for all impl.class
	}
	
}
