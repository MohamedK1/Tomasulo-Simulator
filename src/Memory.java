
public class Memory {
	MemoryEntry data[];
int size;
static class MemoryEntry{
	double value;int Qi;
	public MemoryEntry(double val,int qi) {
		value=val;
		Qi=qi;
	}
}

public Memory(int size) {
	this.size=size;
	data=new MemoryEntry[size];
	for(int i=0;i<size;i++)
		data[i]=new MemoryEntry(i, 0);
}


}