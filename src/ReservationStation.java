
public class ReservationStation {
	    int tag,busy,op,qj,qk,A,time;
	    double vj,vk;
	    int instID;
	    public ReservationStation() {
	    	
	    }
		public ReservationStation(int tag, int busy, int op, double vj, double vk, int qj, int qk, int A, int time) {
			this.tag = tag;
			this.busy = busy;
			this.op = op;
			this.vj = vj;
			this.vk = vk;
			this.qj = qj;
			this.qk = qk;
			this.A = A;
			this.time = time;
		}
		public String toString() {
			return String.format("tag is %d busy is %d op: %d vj:%d vk:%d qj:%d vk:%d A:%d time:%d\n",tag,busy,op,vj,vk,qj,qk,A,time );
		}

}
