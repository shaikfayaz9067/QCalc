package com.crio.qcalc;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		
		// StandardCalculator calc = new StandardCalculator();
		
		// calc.add(Double.MAX_VALUE, 1);

		// System.out.println(calc.getResult());
		ScientificCalculator sc=new ScientificCalculator();
		// sc.tan(45);
		// sc.printResult();
		// sc.log(10);
		// // calc.printResult();
		// sc.printResult();
		LogicCalculator calc = new LogicCalculator();

			calc.AND(8, 6);

			calc.printResult();


	}

}
