package Service_copyfile;

import java.nio.file.Path;
import java.nio.file.Paths;

public class System_service {

	private static final String USER_FOLDER = System.getProperty("user.dir");
    public static final Path APPLICATION_HOME_PATH = Paths.get(USER_FOLDER);
    private static final Path USERS_PATH1 = System_service.getPathToFile("src/main/resources/users.json");
    private static final Path USERS_PATH2 = System_service.getPathToFile("src/main/resources/FisierProgramari.json");
    private static final Path USERS_PATH3 = System_service.getPathToFile("src/main/resources/FisierRecenzii.json");
    private static final Path USERS_PATH4 = System_service.getPathToFile("src/main/resources/login.jpg");
    
    public static Path getPathToFile(String... path) {
        return APPLICATION_HOME_PATH.resolve(Paths.get("", path));
    }
    
    public static Path getPath1() {
    	return USERS_PATH1;
    }
    
    public static Path getPath2() {
    	return USERS_PATH2;
    }
    
    public static Path getPath3() {
    	return USERS_PATH3;
    }
    
    public static Path getPath4() {
    	return USERS_PATH4;
    }
}
