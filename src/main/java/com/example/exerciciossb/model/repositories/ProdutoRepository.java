package com.example.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

// import org.springframework.data.repository.CrudRepository;

import com.example.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContaining(String partNome);

	//findByNomeContaining
	//findByNomeIsContaining
	//findByNomeContains
	
	//findByNomeStartsWith
	//findByNomeEndsWith
	
	//findByNomeNotContaing	
	

}
