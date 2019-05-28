class Main{
	public static void main(String args[]){
		Singleton x = Singleton.getInstance();

		Singleton y = Singleton.getInstance();

		Singleton z = Singleton.getInstance();

		x.s = (x.s).toUpperCase();

		System.out.println("x.s= " + x.s);
		y.showMessage();
		//System.out.println("Method showMessage: " + y.showMessage());
	}
}