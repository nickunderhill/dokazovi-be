package com.softserveinc.dokazovi.service;

import com.softserveinc.dokazovi.dto.post.ImportantPostDTO;
import com.softserveinc.dokazovi.dto.post.LatestPostDTO;
import com.softserveinc.dokazovi.entity.PostEntity;
import com.softserveinc.dokazovi.entity.enumerations.PostStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {

	Page<LatestPostDTO> findAllByStatus(PostStatus postStatus, Pageable pageable);

	Page<ImportantPostDTO> findImportantPosts(Pageable pageable);

	List<PostEntity> findAll(Pageable pageable);

}
