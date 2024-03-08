package com.example.repositorieshal2.repository;

import com.example.repositorieshal2.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("repository of programming languages"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}
