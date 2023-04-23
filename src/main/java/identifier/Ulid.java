package identifier;

import de.huxhorn.sulky.ulid.ULID;

/**
 * A class that generates ULID (Universally Unique Lexicographically Sortable Identifier) identifiers.
 *
 * @see <a href="https://github.com/ulid/spec">ULID specification</a>
 */
public class Ulid implements Identifier{

    /**
     * Generates a ULID identifier.
     *
     * @return a string representing the generated ULID identifier.
     */
    @Override
    public String generate() {
        final ULID ulid = new ULID();
        return ulid.nextULID();
    }
}
