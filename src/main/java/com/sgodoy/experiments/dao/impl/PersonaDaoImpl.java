package com.sgodoy.experiments.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sgodoy.experiments.beans.Persona;
import com.sgodoy.experiments.dao.IPersonaDao;
import com.sgodoy.experiments.utils.LogUtils;

@Repository("PersonaDaoImpl")
public class PersonaDaoImpl implements IPersonaDao, Serializable {

	private static final long serialVersionUID = -3214736793294742484L;
	private static final Logger log = LoggerFactory.getLogger(PersonaDaoImpl.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Persona> getPersonas() {
		LogUtils.logInit(log, "getPersonas");
		
		StringBuilder sql = new StringBuilder("SELECT \"ID_PERSONA\", \"NOMBRE\", \"APELLIDO_PATERNO\", \"APELLIDO_MATERNO\" FROM \"PERSONA\"");
		List<Persona> returnObject = null;
		try {
			returnObject = jdbcTemplate.query(sql.toString(), 
				(rs, rowNum) -> new Persona(
					rs.getInt("ID_PERSONA"),
					rs.getString("NOMBRE"),
					rs.getString("APELLIDO_PATERNO"),
					rs.getString("APELLIDO_MATERNO")
					)
				);
		} catch (DataAccessException e) {
			LogUtils.logError(log, e.getMessage(), "PersonasDaoImpl", "getPersonas");
			e.printStackTrace();
		}
		LogUtils.logFin(log, "getPersonas");
		return returnObject;
	}

}
