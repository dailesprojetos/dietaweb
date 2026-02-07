package systeconline.dietaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import systeconline.dietaweb.models.Dieta;
import java.util.List;
import java.time.LocalDate;


@Repository
public interface DietaRepository extends JpaRepository<Dieta, Long>{
	
	List<Dieta> findByDia(LocalDate dia);

}
