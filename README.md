# MODELO IDENTIDAD RELACION

![Captura de pantalla 2025-06-29 142503](https://github.com/user-attachments/assets/90049ba0-b9a2-4f04-bc7d-7e41578cdf83)

# CRUADRO DE METODOS DE JPA

| Acción     | Método JPA               | Ejemplo                          |
|------------|--------------------------|-----------------------------------|
| Agregar    | em.persist(objeto)       | em.persist(alumno);               |
| Consultar  | em.find(Clase.class, id) | em.find(Alumno.class, 1L);        |
| Actualizar | em.merge(objeto)         | em.merge(alumno);                 |
| Eliminar   | em.remove(objeto)        | em.remove(alumno);                |

# COMO HACER LA CONEXION Y PRUEBAS
```java
import jakarta.persistence.*;

public class Main {

	public static void main(String[] args) {

		try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("my persis")) { //AQUI DEBES DE PONER EL NOMBRE LA PERSISTENCIA

        //LLAMAS EL MANAGER PARA EMPEZAR HACER TRANSACIONES
			try (EntityManager em = emf.createEntityManager()) {

				em.getTransaction().begin(); //INICIAR TRANSACION
				em.getTransaction().commit(); //FINALIZAR TRANSACION

			}
		} catch (Exception e) {
			System.out.println(e.getMessage()); //MENSAJE DE ERROR PARA SABER QUE TIPO DE ERROR HAY
		}
	}
}
```
