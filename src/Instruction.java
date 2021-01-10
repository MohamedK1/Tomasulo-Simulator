
public class Instruction {
	String instStr;

	public static enum Type {
		add, mul, load, store,sub,div
	};
	
	public int getTypeVal() {
		if(type==Type.add)return 0;
		if(type==Type.mul)return 1;
		if(type==Type.load)return 2;
		if(type==Type.store)return 3;
		if(type==Type.sub)return 4;
		if(type==Type.div)return 5;
		return -1;
	}
	public String getType() {
		if(type==Type.add)return "ADD.D";
		if(type==Type.mul)return "MUL.D";
		if(type==Type.load)return "L.D";
		if(type==Type.store)return "S.D";
		if(type==Type.sub)return "SUB.D";
		if(type==Type.div)return "DIV.D";
		return "";
		
	}
	Type type;
	int dest, j, k;
	int id;
	public Instruction(String inst) {
		instStr = inst;
		String[] in = inst.split(" ");

		if (in[0].toLowerCase().contains("add"))
			type = Type.valueOf("add");
		else if (in[0].toLowerCase().contains("mul"))
			type = Type.valueOf("mul");
		else if (in[0].toLowerCase().contains("sub"))
			type = Type.valueOf("sub");
		else if (in[0].toLowerCase().contains("div"))
			type = Type.valueOf("div");
		else if (in[0].toLowerCase().contains("l"))
			type = Type.valueOf("load");
		else if (in[0].toLowerCase().contains("s"))
			type = Type.valueOf("store");
		
		dest = Integer.parseInt(in[1]);
		j = Integer.parseInt(in[2]);
		k = Integer.parseInt(in[3]);

	}
}