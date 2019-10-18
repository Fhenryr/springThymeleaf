package com.threeway.curso.boot.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.threeway.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends GenericDao<Funcionario> implements FuncionarioDao{
	
	@Override
	public List<Funcionario> findByName(String nome) {
//		List<Funcionario> query = getEntityManager().createQuery("").getResultList();
		TypedQuery<Funcionario> query = getEntityManager().createQuery("select f from Funcionario f where f.nome like :nome", Funcionario.class);
		query.setParameter("nome", "%"+nome+"%");
		
		return query.getResultList();
	}

}
