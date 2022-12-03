import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Reader {
    public static List<String> lines(String day) {
        try {
            return Files.readAllLines(Path.of("input/" + day + ".txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
