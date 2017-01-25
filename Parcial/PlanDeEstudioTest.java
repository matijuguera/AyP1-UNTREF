import static org.junit.Assert.*;

import org.junit.Test;


public class PlanDeEstudioTest {

	@Test
	public void ProbarHorasEstudiadas() {
		PlanDeEstudio P = new PlanDeEstudio(5);
		P.almacenarHorasDeEstudioPlanificadas(2,10);
		P.almacenarHorasEfectivasDeEstudio(2,5);
		assertEquals(5,P.getHorasEstudiadas(2));
	}
	@Test
	public void ProbarHorasEstudiadasTotales() {
		PlanDeEstudio P = new PlanDeEstudio(5);
		P.almacenarHorasDeEstudioPlanificadas(2,10);
		P.almacenarHorasEfectivasDeEstudio(2,5);
		P.almacenarHorasEfectivasDeEstudio(1,5);
		assertEquals(10,P.getHorasTotalesEstudiadas());
	}
	@Test
	public void ProbarHorasSuperanPlanificadas() {
		PlanDeEstudio P = new PlanDeEstudio(5);
		P.almacenarHorasDeEstudioPlanificadas(2,10);
		P.almacenarHorasEfectivasDeEstudio(2,15);
		assertEquals(1,P.getHorasEstudiadasSuperanHorasPlanificadas());
	}
	@Test
	public void getMaximaHoraDeDiferenciaEntreEstudiadasYPlanificadas() {
		PlanDeEstudio P = new PlanDeEstudio(5);
		P.almacenarHorasDeEstudioPlanificadas(2,15);
		P.almacenarHorasEfectivasDeEstudio(2,10);
		P.almacenarHorasDeEstudioPlanificadas(2,10);
		P.almacenarHorasEfectivasDeEstudio(2,4);
		assertEquals(6,P.getMaximaHoraDeDiferenciaEntreEstudiadasYPlanificadas());
	}

	

}
