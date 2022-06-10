package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.ConfigHibernate;
import dao.UsuarioDao;
import entidad.Usuario;
import negocio.UsuarioNegocio;

@Configuration
public class Config {
	
	@Bean
	public Usuario usuarioPepe(){
		return new Usuario("Pepe", "123");
	}
	
	@Bean
	public UsuarioNegocio usuarioNegocio() {
		return new UsuarioNegocio();
	}
	
	@Bean
	public UsuarioDao usuarioDao() {
		return new UsuarioDao();
	}
	
	@Bean
	public ConfigHibernate config() {
		return new ConfigHibernate();
	}
	
}
