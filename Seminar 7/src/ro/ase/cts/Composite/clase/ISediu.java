package ro.ase.cts.Composite.clase;

public interface ISediu {
	public void afiseazaDescriere();
	public void addNod(ISediu isediu) throws Exception;
	public void removeNod(ISediu isediu) throws Exception;
	public ISediu getNod() throws Exception;
	ISediu getNod(int pozitie);
}
