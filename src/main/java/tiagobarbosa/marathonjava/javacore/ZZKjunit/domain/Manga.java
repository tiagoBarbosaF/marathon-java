package tiagobarbosa.marathonjava.javacore.ZZKjunit.domain;

import java.util.Objects;

public record Manga(String name, int chapters) {
    public Manga {
        Objects.requireNonNull(name);
    }
}
