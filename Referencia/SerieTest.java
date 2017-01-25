import static org.junit.Assert.*;

import org.junit.Test;


public class SerieTest {


		@Test

		public void contruirSerie() {

		/* Actores */

		Actor[] actoresLost = new Actor[4];

		actoresLost[0] = new Actor("Jack","Matthew Fox");

		actoresLost[1] = new Actor("Jhon","Terry O'Quinn");

		actoresLost[2] = new Actor("Kate","Evangeline Lilly");

		actoresLost[3] = new Actor("Sayid","Naveen Andrews");

		/* Episodio 1 */

		Actor[] actoresEpisodio1 = new Actor[2];

		actoresEpisodio1[0] = actoresLost[0];

		actoresEpisodio1[1] = actoresLost[2];



		Episodio episodio1 = new Episodio(1, "Pilot: Part 1", actoresEpisodio1);

		/* Episodio 2 */

		Actor[] actoresEpisodio2 = new Actor[3];

		actoresEpisodio2[0] = actoresLost[1];

		actoresEpisodio2[1] = actoresLost[2];

		actoresEpisodio2[2] = actoresLost[3];



		Episodio episodio2 = new Episodio(2, "Pilot: Part 2", actoresEpisodio2);

		/* Serie */

		Episodio[] episodiosLost = new Episodio[2];

		episodiosLost[0] = episodio1;

		episodiosLost[1] = episodio2;

		Serie lost = new Serie("Lost", "Adventure", actoresLost, episodiosLost);



		/* comprueba la serie */

		assertEquals("Serie", "Lost", lost.getNombre());

		assertEquals("Género", "Adventure", lost.getGenero());

		/* comprueba los actores */

		assertEquals("cantidad de actores", 4, lost.getActores().length);



		assertEquals("actor", "Matthew Fox", lost.getActores()[0].getNombreReal());

		assertEquals("personaje", "Jack",lost.getActores()[0].getNombreFiccion());

		assertEquals("actor", "Evangeline Lilly",lost.getActores()[2].getNombreReal());

		assertEquals("personaje", "Sayid",lost.getActores()[3].getNombreFiccion());

		/* comprueba los episodios */

		assertEquals("cantidad de episodios", 2, lost.getEpisodios().length);

		assertEquals("número del episodio", 1,

		lost.getEpisodios()[0].getNumero());

		assertEquals("nombre del episodio", "Pilot: Part 1",

		lost.getEpisodios()[0].getNombre());

		assertEquals("número del episodio", 2,

		lost.getEpisodios()[1].getNumero());

		/* comprueba las referencias entre actores de la series de los episodios */

		assertSame(lost.getActores()[0], episodio1.getActores()[0]);

		assertSame(lost.getActores()[2], episodio1.getActores()[1]);

		assertSame(lost.getActores()[2], episodio2.getActores()[1]);

		}

		

}
