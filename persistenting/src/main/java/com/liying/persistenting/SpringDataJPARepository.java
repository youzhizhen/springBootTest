package com.liying.persistenting;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SpringDataJPARepository<T,ID> extends JpaRepository<T, Serializable>{
	
}
