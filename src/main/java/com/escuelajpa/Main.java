package com.escuelajpa;

import jakarta.persistence.*;

public class Main {

	public static void main(String[] args) {

		try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("my persis")) {

			try (EntityManager em = emf.createEntityManager()) {

				em.getTransaction().begin();

				// AGREGAMOS GRUPOS-SON 12 GRUPOS
				/*
				 * String turno="MATUTINO"; for (int i = 1; i <= 6; i++) { for (int j = 0; j <
				 * 2; j++) { char letra = (char) ('A' + j); Grupo grupo = new Grupo(i, letra,
				 * turno); em.persist(grupo); } }
				 */

				// AGREGAMOS MASTERIAS DOS POR GRUPO
				/*
				 * String[] materias = { "Español", "Matemáticas", "Ciencias Naturales",
				 * "Historia", "Geografía", "Formación Cívica y Ética", "Educación Física",
				 * "Educación Artística", "Inglés", "Computación", "Valores",
				 * "Lectura y Redacción" };
				 * 
				 * 
				 * //OBTENER TODOS LOS GRUPOS List<Grupo> lista =
				 * em.createQuery("SELECT g FROM Grupo g", Grupo.class).getResultList();
				 * 
				 * for (Grupo g : lista) { int grado = g.getGrado(); int base = (grado - 1) * 2;
				 * 
				 * if (base + 1 < materias.length) { String m1 = materias[base]; String m2 =
				 * materias[base + 1];
				 * 
				 * Materia materia1 = new Materia(m1,5,g); Materia materia2 = new
				 * Materia(m2,5,g);
				 * 
				 * em.persist(materia1); em.persist(materia2); } else {
				 * System.out.println("No hay suficientes materias para el grado " + grado); } }
				 */

				// CONSULTAMOS EL GRADO/GRUPO Y LAS MATERIAS QUE TIENEN
				/*
				 * List<Grupo> lista = em.createQuery("SELECT g FROM Grupo g",
				 * Grupo.class).getResultList();
				 * 
				 * for (Grupo g : lista) { System.out.println(g.toString()); List<Materia>
				 * materias = g.getMaterias();
				 * 
				 * for (Materia m : materias) { System.out.println(m.toString()); } }
				 */

				em.getTransaction().commit();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}