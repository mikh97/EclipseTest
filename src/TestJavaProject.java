
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class TestJavaProject {

	public static void main(String[] args) {

		Desktop desktop = Desktop.getDesktop();
		File file = new File("/System/Applications/Notes.app");
		try {
			desktop.open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

