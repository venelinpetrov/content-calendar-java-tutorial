package dev.vpetrov.contentcalendar.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import dev.vpetrov.contentcalendar.model.Content;

public interface ContentRepository extends ListCrudRepository<Content, Integer>{
    List<Content> findAllByTitleContains(String keyword);
}
