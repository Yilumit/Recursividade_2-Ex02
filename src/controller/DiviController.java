package controller;

public class DiviController {

	public DiviController() {
		super();
	}
	public int divisao(int dividendo, int divisor, int res){
		
		if (divisor>dividendo) {
			return res;
		} else {
			res += 1;
			res = divisao(dividendo-divisor, divisor, res);
			return res;
		}
	}
		
}
