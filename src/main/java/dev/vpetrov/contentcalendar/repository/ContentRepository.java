package dev.vpetrov.contentcalendar.repository;

import org.springframework.data.repository.ListCrudRepository;

import dev.vpetrov.contentcalendar.model.Content;

public interface ContentRepository extends ListCrudRepository<Content, Integer>{

}
