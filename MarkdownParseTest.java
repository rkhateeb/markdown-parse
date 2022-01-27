import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    public void testMarkdownParse()
    {
        String[] markdownNames = {"empty-file.md","empty-link.md","image-file.md","test-file.md" };
        for(int i =0; i < markdownNames.length; i++){
            Path fileName = Path.of(markdownNames[i]);
            String contents = Files.readString(fileName);
            ArrayList<String> links = getLinks(contents);

            assertEquals(links, markdownNames);
            assertEquals();
        }
    }
}
