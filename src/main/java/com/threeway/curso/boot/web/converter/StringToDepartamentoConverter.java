package com.threeway.curso.boot.web.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.threeway.curso.boot.domain.Departamento;
import com.threeway.curso.boot.service.DepartamentoService;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento>{

	@Autowired
	DepartamentoService departamentoService;
	
	@Override
	public Departamento convert(String texto) {
		if (texto.isEmpty()) {
			return null;
		} else {
			return departamentoService.buscarPorId(Long.valueOf(texto));
		}
	}
}
