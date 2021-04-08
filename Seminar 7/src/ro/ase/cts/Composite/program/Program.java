package ro.ase.cts.Composite.program;

import ro.ase.cts.Composite.clase.AgentieComposite;
import ro.ase.cts.Composite.clase.FilialaFrunza;

public class Program {

	public static void main(String[] args) {
		AgentieComposite agentie1 = new AgentieComposite();
		AgentieComposite agentie2 = new AgentieComposite();
		AgentieComposite agentie3 = new AgentieComposite();
		
		FilialaFrunza filiala1 = new FilialaFrunza("FilialaNumarul1");
		FilialaFrunza filiala2 = new FilialaFrunza("FilialaNumarul2");
		FilialaFrunza filiala3 = new FilialaFrunza("FilialaNumarul3");
		FilialaFrunza filiala4 = new FilialaFrunza("FilialaNumarul4");
		
		agentie1.addNod(filiala1);
		
		agentie1.addNod(filiala2);
		
		agentie2.addNod(filiala3);
		
		agentie3.addNod(filiala4);
		
		agentie1.addNod(agentie3);
		
		agentie1.afiseazaDescriere();
		
			System.out.println();
			
		agentie2.afiseazaDescriere();
		
			System.out.println();
		
		agentie3.removeNod(filiala4);
		
		agentie1.addNod(filiala4);
		
		agentie1.removeNod(agentie3);
		
		agentie1.afiseazaDescriere();
			
			System.out.println();
		
		
		
	}

}
