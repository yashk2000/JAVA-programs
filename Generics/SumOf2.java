public class SumOf2 {
	public static <T> void add(T x,T y) {
		System.out.println(x.getClass());
	if(x.getClass().toString().equals("class java.lang.Integer")&&y.getClass().toString().equals("class java.lang.Integer")) {
		System.out.println(Integer.sum((Integer)x,(Integer) y));
	}
	else if(x.getClass().toString().equals("class java.lang.Double")&&y.getClass().toString().equals("class java.lang.Double")) {
		System.out.println(Double.sum((Double)x,(Double) y));
	}
	else if((x.getClass().toString().equals("class java.lang.Character")&&
			y.getClass().toString().equals("class java.lang.Character")
			||x.getClass().toString().equals("class java.lang.String")&&
			y.getClass().toString().equals("class java.lang.String"))) {
		System.out.println(x.toString()+y.toString());
	}
	else
	{System.out.println("use parameters of same type");}
	
	}
}

