package org.example.springbatchyumi.repository;

import org.example.springbatchyumi.entity.WinEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WinRepository extends JpaRepository<WinEntity, Long> {

	Page<WinEntity> findByWinGreaterThanEqual(Long win, Pageable pageable);
}
