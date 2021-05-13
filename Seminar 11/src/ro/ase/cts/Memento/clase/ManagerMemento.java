package ro.ase.cts.Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> mementoList;

	public ManagerMemento() {
		super();
		this.mementoList = new ArrayList<>();
	}
	
	public void addMemento(Memento m) {
		mementoList.add(m);
	}
	
	public Memento cereUnMemento(int index)
	{
		if(index >=0 && index< mementoList.size()) {
			return mementoList.get(index);
		}
		
		return null;
	}
	
	
	public Memento cereUtimulMemento() {
		return mementoList.get(mementoList.size()-1);
	}
}
