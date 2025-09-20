package io.github.OzeiasMoreira.imageliteapi.infra.repository;

import io.github.OzeiasMoreira.imageliteapi.domain.entity.Image;
import io.github.OzeiasMoreira.imageliteapi.domain.enums.ImageExtension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, String>, JpaSpecificationExecutor<Image> {

    default List<Image> findByExtensionAndNameOrTagsLike(ImageExtension extension, String query) {
        return findAll();
    }

}
