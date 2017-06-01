package br.edu.ifrs.canoas.james.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.canoas.james.domain.Carteira;

//import br.edu.canoas.lds.sed.domain.Person;
//import br.edu.canoas.lds.sed.domain.projection.PersonExcerpt;


@Repository
public class CarteiraRepository extends JpaRepository<Carteira, Long> {



}



/*
public interface PersonRepository extends JpaRepository<Person, Long> {

	public List<PersonExcerpt> findByFullNameContainingIgnoreCase(String fullName);

	public Person findByFullNameIgnoreCase(String fullName);

}*/