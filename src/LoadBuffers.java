import java.util.ArrayList;

public class LoadBuffers {
BufferEntry[] loadBuffers;

int size;
public LoadBuffers(int size) {
	this.size=size;
loadBuffers=new BufferEntry[size];
for(int i=0;i<size;i++)
	loadBuffers[i]=new BufferEntry();
}

public int isFree() {
	for(int i=0;i<size;i++) {
		if(loadBuffers[i]==null||loadBuffers[i].busy==0)return i;
	}
	return -1;
}
	
static class BufferEntry{
	int tag,busy,address;
	int time;
	int instID;
	public BufferEntry(int tag, int busy, int address,int time) {
		super();
		this.tag = tag;
		this.busy = busy;
		this.address = address;
		this.time=time;
	}
	public BufferEntry() {
		
	}
	
}
public int nextInstruction() {
//	ArrayList<Integer>ans = new ArrayList<Integer>();
	int min=Integer.MAX_VALUE;
	int minidx=-1;
	for(int i=0;i<size;i++) {
		if(loadBuffers[i]!=null&&loadBuffers[i].busy==1&&loadBuffers[i].tag<min
				&&Tomasulo.mem.data[loadBuffers[i].address%Tomasulo.mem.size].Qi==0){
			min=loadBuffers[i].tag;
			minidx=i;
		}
//		if(loadBuffers[i]!=null&&loadBuffers[i].busy==1&&Tomasulo.mem.data[loadBuffers[i].address%Tomasulo.mem.size].Qi==0){
//			ans.add(i);
//		}
		
		
		
	}
	return minidx;
	
}

public String toString() {
	StringBuilder sb=new StringBuilder();
	String s="-----------------------------------------------------------------------\n";
	sb.append("the content of Load Buffers\n");
	sb.append(s);
	sb.append(String.format("%10s %10s %10s %10s ","Tag","busy","address","Time")+"\n");
	sb.append(s);
	for(int i=0;i<size;i++) {
		sb.append(String.format("%10s %10s %10s %10s \n",loadBuffers[i].tag,loadBuffers[i].busy,loadBuffers[i].address,loadBuffers[i].time));
		sb.append(s);
			
	}
	sb.append(s);
	return sb.toString();
	
}
}