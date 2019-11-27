import harnesses.ResourceLoader;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class JSONMapperTest {
    @Test
    public void test_load_json_from_resources() throws IOException {
        Map json = JSONMapper.toObject(
                ResourceLoader.getFileAsString("un_json.json"),
                Map.class
        );

        assertEquals(json.get("clave"), "valor" );
    }
}
