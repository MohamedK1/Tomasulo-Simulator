import java.util.ArrayList;

public class AddReservationStation {
ReservationStation[] addRS;
int size;
public AddReservationStation(int size) {
	this.size=size;
	addRS=new ReservationStation[size];
	for(int i=0;i<size;i++) {
		addRS[i]=new ReservationStation();
	}
}


// The returns the index in the reservation station of the first free entry and returns -1 if there are no free entries.
public int isFree() {
	for(int i=0;i<size;i++) {
		if(addRS[i]==null||addRS[i].busy==0)return i;
	}
	return -1;
}


//Returns an array of indices in the reservation station of instructions that are ready to execute.  
public ArrayList<Integer> nextInstruction() {
	ArrayList<Integer> ans=new ArrayList<Integer>();
	int min=Integer.MAX_VALUE;
	int minidx=-1;
	for(int i=0;i<size;i++) {
		if(addRS[i]!=null&&addRS[i].busy==1&&addRS[i].qj==0&&addRS[i].qk==0){
		ans.add(i);
		}
	}
	return ans;
	
}
public String toString() {
	StringBuilder sb=new StringBuilder();
	String s="-------------------------------------------------------------------------------------------------------\n";
	sb.append("the content of add Reservation station\n");
	sb.append(s);
	sb.append(String.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s","Tag","busy","operation","Vj","Vk","Qj","Qk","A","Time")+"\n");
	sb.append(s);
	for(int i=0;i<size;i++) {
		sb.append(String.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s",addRS[i].tag,addRS[i].busy,"ADD.D",addRS[i].vj
				,addRS[i].vk,addRS[i].qj,addRS[i].qk,addRS[i].A,addRS[i].time)+"\n");
		sb.append(s);
			
	}
	sb.append(s);
	return sb.toString();
	
}
}
