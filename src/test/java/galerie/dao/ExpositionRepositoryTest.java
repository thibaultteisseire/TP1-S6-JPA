package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.ExpositionRepository;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
/**
 *
 * @author Thibault
 */
public class ExpositionRepositoryTest {
    
    @Autowired
    private ExpositionRepository expositionDAO;
    
    @Test
    @Sql("test-data.sql") // On peut charger des donnnées spécifiques pour un test
    public void onSaitCompterLesEnregistrements() {
        log.info("On compte les enregistrements de la table 'Exposition'");
        int combienDansLeJeuDeTest = 2; 
        long nombre = expositionDAO.count();
        assertEquals(combienDansLeJeuDeTest, nombre, "On doit trouver 2 expositions" );
    }
}
