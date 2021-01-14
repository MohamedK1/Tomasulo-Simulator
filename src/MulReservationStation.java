import java.util.ArrayList;

public class MulReservationStation {

	ReservationStation[] mulRS;
	int size;
	public MulReservationStation(int size) {
		this.size=size;
		mulRS=new ReservationStation[size];
		for(int i=0;i<size;i++) {
			mulRS[i]=new ReservationStation();
		}
	}
	public int isFree() {
		for(int i=0;i<size;i++) {
			if(mulRS[i]==null||mulRS[i].busy==0)return i;
		}
		return -1;
	}
	public ArrayList<Integer> nextInstruction() {
		ArrayList<Integer> ans=new ArrayList<Integer>();
		int min=Integer.MAX_VALUE;
	
		int minidx=-1;
		for(int i=0;i<size;i++) {
		if(mulRS[i]!=null&&mulRS[i].busy==1&&mulRS[i].qj==0&&mulRS[i].qk==0) {
				ans.add(i);
			}
		
		}
		return ans;
		
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		String s="-------------------------------------------------------------------------------------------------------\n";
		sb.append("The content of the multiply reservation station\n");
		sb.append(s);
		sb.append(String.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s","Tag","Busy","Operation","Vj","Vk","Qj","Qk","A","Time")+"\n");
		sb.append(s);
		for(int i=0;i<size;i++) {
			sb.append(String.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s",mulRS[i].tag,mulRS[i].busy,mulRS[i].op==5?"DIV.D":"MUL.D",mulRS[i].vj
					,mulRS[i].vk,mulRS[i].qj,mulRS[i].qk,mulRS[i].A,mulRS[i].time)+"\n");
			sb.append(s);
				
		}
		sb.append(s);
		return sb.toString();
		
	}
	
	
	}