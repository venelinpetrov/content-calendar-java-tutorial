package dev.vpetrov.contentcalendar.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import dev.vpetrov.contentcalendar.model.Content;
import dev.vpetrov.contentcalendar.model.Status;
import dev.vpetrov.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {}

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList
            .stream()
            .filter(c -> c.id().equals(id))
            .findFirst();
    }

    @PostConstruct
    private void init() {
        Content c = new Content(1,
        "My first blog post",
        "My first blog post",
        Status.IDEA,
        Type.ARTICLE,
        LocalDateTime.now(),
        null,
        "");
        contentList.add(c);
    }

    public void create(Content content) {
        contentList.add(content);
    }

	public void update(Content content) {
	}

    public boolean existsById(Integer id) {
        return contentList.stream().anyMatch(c -> c.id().equals(id));
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}
