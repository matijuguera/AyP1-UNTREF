import static org.junit.Assert.*;

import org.junit.Test;


public class VerificadorDobleTest {
	
	@Test(expected = Exception.class)
	public void ArrayConPosicionNegativa() {
		VerificadorDoble vd = new VerificadorDoble();
		int[] vector = new int[-7];

	}

	@Test
	public void CadaElementoEsElDobleDelAnterior() {
		VerificadorDoble vd = new VerificadorDoble();
		int[] vector = new int[4];
		vector[0]=1;
		vector[1]=2;
		vector[2]=4;
		vector[3]=8;
		vd.determinarSiCadaElementoEsElDobleDelAnterior(vector);
		assertEquals(3,vd.determinarSiCadaElementoEsElDobleDelAnterior(vector),0.0001);
	}
	@Test
	public void CadaElementoNoEsElDobleDelAnterior() {
		VerificadorDoble vd = new VerificadorDoble();
		int[] vector = new int[5];
		vector[0]=1;
		vector[1]=2;
		vector[2]=4;
		vector[3]=8;
		vector[4]=5;
		vd.determinarSiCadaElementoEsElDobleDelAnterior(vector);
		assertEquals(4,vd.determinarSiCadaElementoEsElDobleDelAnterior(vector),0.0001);
	}	
		@Test
		public void CadaElementoEsCero(){
			VerificadorDoble vd = new VerificadorDoble();
			int[] vector = new int[4];
			vd.determinarSiCadaElementoEsElDobleDelAnterior(vector);
			assertEquals(3,vd.determinarSiCadaElementoEsElDobleDelAnterior(vector),0.0001);
		}
		@Test
		public void CadaElementoNegativoEsElDobleDelAnterior(){
			VerificadorDoble vd = new VerificadorDoble();
			int[] vector = new int[6];
			vector[0]=-1;
			vector[1]=-2;
			vector[2]=-4;
			vector[3]=-8;
			vector[4]=-16;
			vector[5]=-32;
			vd.determinarSiCadaElementoEsElDobleDelAnterior(vector);
			assertEquals(5,vd.determinarSiCadaElementoEsElDobleDelAnterior(vector),0.0001);	
		}
		@Test
		public void CadaElementoNegativoNoEsElDobleDelAnterior(){
			VerificadorDoble vd = new VerificadorDoble();
			int[] vector = new int[6];
			vector[0]=-1;
			vector[1]=-2;
			vector[2]=-4;
			vector[3]=6;
			vector[4]=-16;
			vector[5]=-32;
			vd.determinarSiCadaElementoEsElDobleDelAnterior(vector);
			assertEquals(3,vd.determinarSiCadaElementoEsElDobleDelAnterior(vector),0.0001);	
		}
		
}
