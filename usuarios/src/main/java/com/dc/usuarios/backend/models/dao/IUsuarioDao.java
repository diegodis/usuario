package com.dc.usuarios.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.dc.usuarios.backend.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

}
