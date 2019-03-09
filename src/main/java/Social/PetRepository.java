package Social;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<User, Integer> {

    Iterable<User> deleteById();
}