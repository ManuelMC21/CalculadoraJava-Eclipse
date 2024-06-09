package flujo;

public class Operacion {
	
	public Double sum(Double num, Double cal){
		return cal+=num;
	}
	
	public Double res(Double num, Double cal){
		return cal-=num;
	}
	
	public Double mul(Double num, Double cal){
		return cal*=num;
	}
	
	public Double div(Double num, Double cal){
		return num != 0? cal/num:null;
	}
	
}
