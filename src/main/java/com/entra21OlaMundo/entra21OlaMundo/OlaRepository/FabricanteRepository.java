package com.entra21OlaMundo.entra21OlaMundo.OlaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entra21OlaMundo.entra21OlaMundo.Olamodel.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {

}
