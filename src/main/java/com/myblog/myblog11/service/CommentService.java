package com.myblog.myblog11.service;

import com.myblog.myblog11.payload.CommentDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public interface CommentService {
    CommentDto createComment(CommentDto commentDto,long postId);
}
