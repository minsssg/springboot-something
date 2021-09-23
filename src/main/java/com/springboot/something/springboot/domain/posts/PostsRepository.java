package com.springboot.something.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // JPA에선 Repository 인터페이스를 생성
}
