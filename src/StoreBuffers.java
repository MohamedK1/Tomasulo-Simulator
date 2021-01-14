import java.util.ArrayList;

public class StoreBuffers {
	BufferEntry[] storeBuffers;

	int size;

	public StoreBuffers(int size) {
		this.size = size;
		storeBuffers = new BufferEntry[size];
		for (int i = 0; i < size; i++)
			storeBuffers[i] = new StoreBuffers.BufferEntry();
	}

	public int isFree() {
		for(int i=0;i<size;i++) {
			if(storeBuffers[i]==null||storeBuffers[i].busy==0)return i;
		}
		return -1;
	}

	static class BufferEntry {
		int tag, busy, address;
		int time;
		int Qi;
		int instID;
		double value;

		public BufferEntry(int tag, int busy, int address, double val,int Qi, int time) {
			super();
			this.tag = tag;
			this.busy = busy;
			this.address = address;
			value = val;
			this.time=time;
			this.Qi=Qi;
		}

		public BufferEntry() {
			value = -1;
		}

	}
	public int nextInstruction() {
		int min=Integer.MAX_VALUE;
		int minidx=-1;
//		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			if(storeBuffers[i]!=null&&storeBuffers[i].busy==1&&storeBuffers[i].tag<min&&storeBuffers[i].Qi==0) {
				min=storeBuffers[i].tag;
				minidx=i;
			}
//			if(storeBuffers[i]!=null&&storeBuffers[i].busy==1&&storeBuffers[i].Qi==0) {
//				ans.add(i);
//			}
			
		}
		return minidx;
		
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		String s="-----------------------------------------------------------------------\n";
		sb.append("The content of the store buffers\n");
		sb.append(s);
		sb.append(String.format("%10s %10s %10s %10s %10s %10s ","Tag","Busy","Address","Value","Qi","Time")+"\n");
		sb.append(s);
		for(int i=0;i<size;i++) {
			sb.append(String.format("%10s %10s %10s %10s %10s %10s ",storeBuffers[i].tag,storeBuffers[i].busy,storeBuffers[i].address,storeBuffers[i].value,storeBuffers[i].Qi,storeBuffers[i].time)+"\n");
			sb.append(s);
				
		}
		sb.append(s);
		return sb.toString();
		
	}

}