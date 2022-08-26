/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.paulaorpella.Security.Service;

import com.portfolio.paulaorpella.Security.Entity.Usuario;
import com.portfolio.paulaorpella.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean exitsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.exitsByNombreUsuario(nombreUsuario);
    }
    public boolean exitsByEmail(String email){
        return iusuarioRepository.exitsByEmail (email);
    }
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
