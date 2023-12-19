package io.yury.apiservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// Описывает ручку users и доступные методы CRUD для нее
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<WebsiteUser, Long> {
    // Get List Items
    List<WebsiteUser> findByName(@Param("name") String name);

    // Get ById
    WebsiteUser findById(@Param("id") Long id);

    // POST
    WebsiteUser save(WebsiteUser entity);

    // Delete ById
    void deleteById(@Param("id") Long id);

}