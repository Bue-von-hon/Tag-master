import static org.junit.jupiter.api.Assertions.*;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import identifier.Identifier;
import identifier.Ulid;

class GeneratorTest {

    @Test
    void testGetId() {
        String prefix = "examplePrefix";
        Identifier algorithm = new Ulid();
        Generator idGenerator = new Generator();

        byte[] id = idGenerator.getId(prefix, algorithm);

        assertNotNull(id);
        assertEquals(98, id.length);

        byte prefixLength = id[0];
        byte identifierLength = id[17];
        assertEquals(prefix.length(), prefixLength);
        assertEquals(26, Byte.toUnsignedInt(identifierLength));

        String extractedPrefix = new String(id, 1, prefixLength, StandardCharsets.UTF_8);
        assertEquals(prefix, extractedPrefix);
    }
}
