package com.softserveinc.dokazovi.service.impl;

import com.softserveinc.dokazovi.dto.post.PostDTO;
import com.softserveinc.dokazovi.entity.enumerations.PostStatus;
import com.softserveinc.dokazovi.mapper.PostMapper;
import com.softserveinc.dokazovi.repositories.PostRepository;
import com.softserveinc.dokazovi.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

	private final PostRepository postRepository;
	private final PostMapper postMapper;

	@Override
	public Page<PostDTO> findAll(Pageable pageable) {
		return postRepository.findAll(pageable)
				.map(postMapper::toPostDTO);
	}

	@Override
	public Page<PostDTO> findAllByStatus(PostStatus postStatus, Pageable pageable) {
		return postRepository.findAllByStatus(postStatus, pageable)
				.map(postMapper::toPostDTO);
	}
}
