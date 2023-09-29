package dev.vpetrov.contentcalendar.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String title;
    private String desc;
    private Status status;
	private Type contentType;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    private String url;
}