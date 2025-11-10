public class IdentitaetvonObjekten {
	public static void main(String[] args) {
		int zahlVar1 = 0;
		int zahlVar2 = zahlVar1; // Beide Variablen haben nun den selben Wert. 
									// Sie bleiben aber verschieden. 
		System.out.println("zahlLit1: " + zahlVar1);
		System.out.println("zahlLit2: " + zahlVar2);
		System.out.println("Sind beide Werte identisch: " + (zahlVar1 == zahlVar2));

		System.out.println("---");
		zahlVar2 = 999;
		System.out.println("Setze zahlLit2 999");
		System.out.println("zahlLit1: " + zahlVar1);
		System.out.println("zahlLit2: " + zahlVar2);
		System.out.println("Sind beide Werte identisch: " + (zahlVar1 == zahlVar2));

		if (1==1) {
			return;
		}

		class GanzeZahl { // "inner-class", eigentlich unschön
			int wert = 12;
		}

		GanzeZahl zahlObj1 = new GanzeZahl();
		//zahlObj1.wert = 0;
		GanzeZahl zahlObj2 = new GanzeZahl();
		System.out.println("zahlObj1.wert: " + zahlObj1.wert);
		System.out.println("zahlObj2.wert: " + zahlObj2.wert);
		System.out.println("Sind beide Objekte identisch: " + (zahlObj1 == zahlObj2));

		System.out.println("---");
		System.out.println("Setze zahlObj2 = zahlObj1");
		zahlObj2 = zahlObj1; // Beide Objekte sind nun identisch. 
		System.out.println("zahlObj1.wert: " + zahlObj1.wert);
		System.out.println("zahlObj2.wert: " + zahlObj2.wert);
		System.out.println("Sind beide Objekte identisch: " + (zahlObj1 == zahlObj2));

		System.out.println("---");
		zahlObj2.wert = 999;
		System.out.println("Setze zahlObj2.wert auf 999");
		System.out.println("zahlObj1.wert: " + zahlObj1.wert);
		System.out.println("zahlObj2.wert: " + zahlObj2.wert);
		System.out.println("Sind beide Objekte identisch: " + (zahlObj1 == zahlObj2));
	}
}
