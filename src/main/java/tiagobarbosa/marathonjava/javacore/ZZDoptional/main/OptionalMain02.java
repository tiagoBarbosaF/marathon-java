package tiagobarbosa.marathonjava.javacore.ZZDoptional.main;

import tiagobarbosa.marathonjava.javacore.ZZDoptional.domain.Manga;
import tiagobarbosa.marathonjava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalMain02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Hellsing");
        mangaByTitle.ifPresent(m -> m.setTitle(m.getTitle() + " Ultimate"));
        System.out.println("Find by title (Hellsing) -> " + mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println("Find by id (2) ->" + mangaById);

        Manga newManga = MangaRepository.findByTitle("One Piece").orElseGet(() -> new Manga(3, "One Piece", 1000));
        System.out.println("Find by title and create new one (One Piece) ->" + newManga);
    }
}
