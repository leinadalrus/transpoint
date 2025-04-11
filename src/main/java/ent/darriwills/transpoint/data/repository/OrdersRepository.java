package ent.darriwills.transpoint.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ent.darriwills.transpoint.models.Orders;

interface OrderssRepository extends JpaRepository<Orders, Long> {}