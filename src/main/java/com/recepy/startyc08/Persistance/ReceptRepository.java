package com.recepy.startyc08.Persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.recepy.startyc08.model.Recept;

@Component
public interface ReceptRepository extends CrudRepository<Recept, Long> {

}
