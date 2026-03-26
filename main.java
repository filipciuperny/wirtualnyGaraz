class main{
	public static void main(String args[]){
		auto opel = new auto("opel", "zafira", 1999);
		auto rdza = new auto("mazda", "323b", 2000);
		
		rdza.otomoto();	
	}

}
class auto{
	public String marka;
	public String model;
	public int RokProd;
	
	public auto(String marka, String model, int Rokprod){
	this.marka = marka;
	this.model = model;
	RokProd = Rokprod;
	}


	public void otomoto(){
		System.out.println("marka " + marka + " model " + model + " Rok " + RokProd);
	}
}
