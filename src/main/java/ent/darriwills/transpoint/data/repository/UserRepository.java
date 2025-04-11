package ent.darriwills.transpoint.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ent.darriwills.transpoint.models.User;

interface UserRepository extends JpaRepository<User, Long> {}