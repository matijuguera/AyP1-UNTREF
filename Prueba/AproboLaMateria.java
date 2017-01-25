
public class AproboLaMateria {
	int notaPrimerParcial = 7; 
	int notaSegundoParcial = 7; 
	boolean aproboRecuperatorio = true; //APROBO LOS 2 O NINGUNO
	boolean aproboTrabajosPracticos = true;
	boolean aproboFinal = false;
	boolean aproboMateria(){
	return	(notaPrimerParcial>=4||aproboRecuperatorio)&&(notaSegundoParcial>=4||aproboRecuperatorio)&&(aproboTrabajosPracticos)&&((notaPrimerParcial>=7&&notaSegundoParcial>=7)||aproboFinal);
	}
	}
