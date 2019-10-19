package com.usry.beveragelog.models;

import com.usry.beveragelog.forms.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DrinkDao extends CrudRepository<Drink, Integer> {
}
