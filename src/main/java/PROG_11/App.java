package PROG_11;

import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;

import Service_copyfile.System_service;

public class App {
	public static void main(String[] args){
		try {
            if (!Files.exists(System_service.getPath1()))
                FileUtils.copyURLToFile(App.class.getClassLoader().getResource("users.json"), System_service.getPath1().toFile());
            if (!Files.exists(System_service.getPath2()))
                FileUtils.copyURLToFile(App.class.getClassLoader().getResource("FisierProgramari.json"), System_service.getPath2().toFile());
            if (!Files.exists(System_service.getPath3()))
                FileUtils.copyURLToFile(App.class.getClassLoader().getResource("FisierRecenzii.json"), System_service.getPath3().toFile());
            if (!Files.exists(System_service.getPath4()))
                FileUtils.copyURLToFile(App.class.getClassLoader().getResource("login.jpg"), System_service.getPath4().toFile());
           

        } catch (IOException e) {
            e.printStackTrace();
        }
			new MainFrame();
	}
}
