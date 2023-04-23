# Tag Identifier Generator

This project provides a tag identifier generator that can be used to generate unique identifiers for various purposes.

## Features

- Generates tag identifiers with a maximum length of 98 bytes
- Supports prefix up to 64 bytes
- Supports identifier up to 32 bytes
- Uses ULID as the default identifier algorithm
- Provides an extensible identifier algorithm interface

## Usage

To generate a tag identifier with the default ULID algorithm, create an instance of the `Ulid` class and call the `generate` method:
```java
Generator generator = new Generator();
String prefix = "MY_PREFIX";
Identifier algorithm = new Ulid();
byte[] id = generator.getId(prefix, algorithm);
```

## License

This project is licensed under the Apache License 2.0. See the LICENSE file for details.
