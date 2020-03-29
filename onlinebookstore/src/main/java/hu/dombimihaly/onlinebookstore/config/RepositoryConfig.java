package hu.dombimihaly.onlinebookstore.config;

import hu.dombimihaly.onlinebookstore.entity.Book;
import hu.dombimihaly.onlinebookstore.entity.BookCategory;
import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

  @Autowired
  private EntityManager entityManager;

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
    .map(Type::getJavaType)
    .toArray(Class[]::new));
  }
}
