package ro.ase.cts.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class AgentieComposite implements ISediu{

private List<ISediu> listaSedii;
	
	public AgentieComposite() {
		super();
		this.listaSedii = new ArrayList<ISediu>();
	}

	public void afiseazaDescriere() {
		System.out.println("Este o agentie");
		for(ISediu sediu:listaSedii) {
			sediu.afiseazaDescriere();
		}
		
	}

	@Override
	public void addNod(ISediu sediu) {
		listaSedii.add(sediu);
		
	}

	@Override
	public void removeNod(ISediu sediu) {
		listaSedii.remove(sediu);
		
	}

	@Override
	public ISediu getNod(int pozitie) {
		return listaSedii.get(pozitie);
	}

	@Override
	public ISediu getNod() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
