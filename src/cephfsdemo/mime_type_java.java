import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class mime_type_java {
	
	public static void main(String[] args) throws IOException {
		Path source = Paths.get("f://abcd.jpg");
	    System.out.println(Files.probeContentType(source));
	}

}
