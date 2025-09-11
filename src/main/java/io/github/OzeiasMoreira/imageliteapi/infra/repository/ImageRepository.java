package io.github.OzeiasMoreira.imageliteapi.infra.repository;

import io.github.OzeiasMoreira.imageliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {

}
