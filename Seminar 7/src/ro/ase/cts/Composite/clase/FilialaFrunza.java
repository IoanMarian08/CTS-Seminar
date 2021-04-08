package ro.ase.cts.Composite.clase;

public class FilialaFrunza implements ISediu{
	private String numeFiliala;

	
	
	public FilialaFrunza(String numeFiliala) {
		super();
		this.numeFiliala = numeFiliala;
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Este filiala " +numeFiliala);
	}

	@Override
	public void addNod(ISediu isediu) throws Exception {
		throw new Exception("Nu este implementat");
	}

	@Override
	public void removeNod(ISediu isediu) throws Exception{
		throw new Exception("Nu este implementat");
	}

	@Override
	public ISediu getNod() throws Exception{
		throw new Exception("Nu este implementat");
	}

	@Override
	public ISediu getNod(int pozitie) {
		// TODO Auto-generated method stub
		return null;
	}
}
