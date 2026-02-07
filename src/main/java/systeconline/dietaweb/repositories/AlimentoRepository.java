package systeconline.dietaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import systeconline.dietaweb.models.Alimento;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long> {

}
