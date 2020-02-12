package Lab06.Models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Newbook extends CrudRepository<Newbud, Long> {
    List<Newbud> findByName(String name);

    Newbud findById(long id);
}
