package io.github.OzeiasMoreira.imageliteapi.application.images;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ImageDTO {
    private String url;
    private String name;
    private String extension;
    private Long size;
    private LocalDateTime uploadDate;

}
