package identifier;

public interface Identifier {
    /**
     * Generates an identifier with a maximum length of 32 bytes.
     *
     * @return a string representing the generated identifier.
     */
    String generate();
}
