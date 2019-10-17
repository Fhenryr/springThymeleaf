package com.threeway.curso.boot.web.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.threeway.curso.boot.domain.Cargo;
import com.threeway.curso.boot.domain.Departamento;
import com.threeway.curso.boot.service.CargoService;
import com.threeway.curso.boot.service.DepartamentoService;

@Component
public class StringToCargoConverter implements Converter<String, Cargo>{
	
	@Autowired
	CargoService cargoService;
	
	@Override
	public Cargo convert(String texto) {
		if (texto.isEmpty()) {
			return null;
		} else {
			return cargoService.buscarPorId(Long.valueOf(texto));
		}
	}
}
