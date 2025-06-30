# MODELO IDENTIDAD RELACION

![Captura de pantalla 2025-06-29 142503](https://github.com/user-attachments/assets/90049ba0-b9a2-4f04-bc7d-7e41578cdf83)

# CRUADRO DE METODOS DE JPA

| Acción     | Método JPA               | Ejemplo                          |
|------------|--------------------------|-----------------------------------|
| Agregar    | em.persist(objeto)       | em.persist(alumno);               |
| Consultar  | em.find(Clase.class, id) | em.find(Alumno.class, 1L);        |
| Actualizar | em.merge(objeto)         | em.merge(alumno);                 |
| Eliminar   | em.remove(objeto)        | em.remove(alumno);                |
