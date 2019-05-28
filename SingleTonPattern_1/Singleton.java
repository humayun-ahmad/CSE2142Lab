class Singleton{
	//private static Singleton single_instance = null;
	private static Singleton single_instance = new Singleton();

	public String s;

	private Singleton(){
		s = "Hello I am a string part of Singleton class";
	}

	public static Singleton getInstance(){
		/*if(single_instance == null){
			single_instance = new Singleton();
		}*/
		return single_instance;
	}

	public void showMessage(){
		System.out.println("Yeah, I am here man !");
	}
}