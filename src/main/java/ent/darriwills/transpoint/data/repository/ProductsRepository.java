package ent.darriwills.transpoint.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ent.darriwills.transpoint.models.Products;

interface ProductsRepository extends JpaRepository<Products, Long> {}