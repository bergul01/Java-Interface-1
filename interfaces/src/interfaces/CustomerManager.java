package interfaces;

public class CustomerManager {
	
	private Logger[] loggers; //neye bağımlıyask onun private değişkenini yaparız bu kısımda interface olan logger a bağımlıyız
	// private Logger loggers;  alt kısımda yorumda bahsedilen arraysiz kullanım için geçerli 
	
	
	public CustomerManager(Logger[] loggers) { //source ile generate constructor using fields ile getirdik.
												//arraysiz hali parametre içi (Logger logger) olucaktır
		
		this.loggers = loggers; //parametrede ki loggers i customerManager sınıfının private olan loggers kısmına eşitledik. 
	}
	//loosly coupled - tightly coupled   (bağımlılık)
	public void add(Customer customer) {
		System.out.println("Musteri eklendi " +customer.getFirstName());
		//this.logger.log(customer.getFirstName()); array olmassa bu şekilde 
		
		Utils.runLoggers(loggers, customer.getFirstName()); // statik metot kullandık 
		
	}
	public void delete(Customer customer) {
		System.out.println("Musteri silindi " + customer.getFirstName());
		//this.logger.log(customer.getFirstName()); array olmassa bu şekilde 
		
		Utils.runLoggers(loggers, customer.getFirstName()); //statik metot kullandık 
	}
	

}
